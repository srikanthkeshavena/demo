package com.testing.cpc.dao.util;

import com.testing.cpc.dao.exception.SerializationHelperException;

import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.log4j.Logger;
import org.hibernate.collection.internal.PersistentSet;
import org.hibernate.proxy.HibernateProxy;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * JaxB throws serialization exceptions when working with JPA(Hibernate)
 * entities, because hibernate uses proxies and PersistentSets which are not
 * serializable by JaxB This helper class takes a JPA entity and prepares it for
 * serialization before JaxB marshals it. Steps - 1. Goes through all mapped
 * properties for the given entity 2. gets the value of each of them 3. If the
 * value is a PersistentSet, replaces it with LinkedHashSet (if initialized) or
 * sets it to an empty set (if not initialized) 4. If the value is a proxy, sets
 * it to the originally proxied object (if initialized) or sets it to null (if
 * not initialized) 5. Goes through steps 1 to 4 recursively for the entire
 * graph
 */
public class EntitySerializationHelper {

    private static final Logger log = Logger.getLogger(EntitySerializationHelper.class);

    private Set<Integer> objectIdentities = Collections.newSetFromMap(new ConcurrentHashMap<Integer, Boolean>(100, 0.75f, 100));

    @Autowired
    private JPAUtil jpaUtil;

    /**
     * Prepares the given entity or entity collection for serialization
     * 
     * @param obj
     */
    public void prepareForSerialization(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Collection) {
            prepareCollectionForSerialization((Collection) obj);
        } else {
            prepareEntityForSerialization(obj);
        }
    }

    private void prepareCollectionForSerialization(Collection collection) {
        if (collection == null) {
            return;
        }
        for (Object entity : collection) {
            prepareEntityForSerialization(entity);
        }
    }

    private void prepareEntityForSerialization(Object entity) {
        if (entity == null) {
            return;
        }
        try {
            // if entity is not already handled and it is a mapped entity
            if (!objectIdentities.contains(System.identityHashCode(entity)) && jpaUtil.isEntityMapped(entity)) {
                // all entities that are already handled are placed in to a set,
                // otherwise we will go in to cycles
                objectIdentities.add(System.identityHashCode(entity));
                // get all jpa mapped properties. we will only handle these
                // properties
                List<PropertyDescriptor> mappedAssociationProperties = jpaUtil.getMappedAssociationProperties(entity);
                // Introspect the bean (and it's super classes) and get all
                // property descriptors
                // iterate through each jpa mapped property and handle it
                for (PropertyDescriptor mappedAssociationProperty : mappedAssociationProperties) {
                    handleProperty(entity, mappedAssociationProperty);
                }
            }
        } catch (Exception e) {
            throw new SerializationHelperException(e);
        }

    }

    private void handleProperty(Object entity, PropertyDescriptor property) {
        // Get the value of the property - directly access field instead of
        // using getters and setters
        Object propertyValue = getPropertyValue(entity, property);
        if (propertyValue != null) {
            // If it is a persistent set, check whether it is initialized or not
            if (propertyValue instanceof PersistentSet) {
                PersistentSet set = (PersistentSet) propertyValue;
                // if it was initialized
                if (set.wasInitialized()) {
                    // get the underlying collection held by the persistent set
                    Set underlyingCollection = getUnderlyingSet(set);
                    setPropertyValue(entity, property.getName(), underlyingCollection);
                    // prepare the persistent collection for serialization by
                    // going through each entity in the collection
                    prepareCollectionForSerialization(underlyingCollection);
                } else
                    // if the PersistentSet was not initialized, replace it with
                    // an empty set
                    setPropertyValue(entity, property.getName(), new HashSet());
            }
            // if the value is a proxy, check whether it was initialized or not
            else if (propertyValue instanceof HibernateProxy) {
                // if not initialized, set it to null
                if (!jpaUtil.isInitialized(propertyValue)) {
                    HibernateProxy proxy = (HibernateProxy) propertyValue;
                    Serializable id = proxy.getHibernateLazyInitializer().getIdentifier();
                    if (id != null) {
                        Object newInstance;
                        try {
                            newInstance = property.getPropertyType().newInstance();
                            jpaUtil.setEntityId(newInstance, id);
                            setPropertyValue(entity, property.getName(), newInstance);
                        } catch (InstantiationException | IllegalAccessException e) {
                            log.error(e);
                        }
                    } else {
                        setPropertyValue(entity, property.getName(), (Object) null);
                    }
                } else // if already initialized, get the proxied object from
                       // the proxy
                {
                    Object proxiedObject = jpaUtil.getProxiedObject(propertyValue);
                    prepareEntityForSerialization(proxiedObject);
                }
            } else // recursive call to prepare the value for serialization
            {
                prepareEntityForSerialization(propertyValue);
            }
        }

    }

    /**
     * Gets the value of the given property (field) on given object
     * 
     * @param entity
     * @param name
     * @return
     * @throws Exception
     */
    private Object getPropertyValue(Object entity, PropertyDescriptor property) {
        Object object = null;
        try {
            object = property.getReadMethod().invoke(entity, (Object[]) null);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            log.error(e);
        }
        return object;
    }

    /**
     * Sets the value of the given property (field) on given object
     * 
     * @param entity
     * @param name
     * @param value
     * @throws Exception
     */
    private void setPropertyValue(Object entity, String name, Object value) {
        Field field;
        try {
            field = getField(entity, name);
            if (field != null) {
                field.set(entity, value);
            }
        } catch (Exception e) {
            log.error(e);
        }

    }

    /**
     * Get the 'Field' object for the given object with given fieldName.
     * Iteratively goes through super classes to find the field
     * 
     * @param obj
     * @param fieldName
     * @return
     * @throws Exception
     */
    private Field getField(Object obj, String fieldName) {
        Field field = null;
        Class clazz = obj.getClass();
        while (clazz != null) {
            try {
                field = clazz.getDeclaredField(fieldName);
                break;
            } catch (NoSuchFieldException e) {
                log.error(e);
            }
            clazz = clazz.getSuperclass();
        }
        if (field != null) {
            field.setAccessible(true);
        }

        return field;
    }

    private Set getUnderlyingSet(PersistentSet persistentSet) {
        Field field = null;
        Set set = null;
        try {
            field = PersistentSet.class.getDeclaredField("set");
            field.setAccessible(true);
            set = (Set) field.get(persistentSet);
        } catch (IllegalAccessException | NoSuchFieldException | SecurityException e) {
            log.error(e);
        }

        return set;
    }

}
