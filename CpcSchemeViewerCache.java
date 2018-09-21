/**
 * 
 */
package com.testing.cpc.common.util;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.xml.sax.InputSource;

import freemarker.ext.dom.NodeModel;
import com.testing.cpc.common.constant.Constants;

/**
 * US 5899
 * 
 * @author testing
 * @version 1.6 Sep 2, 2014
 * 
 */
@Component
public class CpcSchemeViewerCache {

    private static final Logger log = Logger.getLogger(CpcSchemeViewerCache.class);
    private ConcurrentHashMap<String, NodeModel> schemeViewerCache = new ConcurrentHashMap<>();

    private Set<String> filterdKeySet = Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());

    protected volatile boolean filterdKeySetIni = false;

    protected volatile boolean cacheInitialized = false;
    protected File[] files = null;

    /*
     * Junit tests can't access system variables. For this reason
     * CpcServicesPropertyConfigurer bean was made optional Unit and Integration
     * tests need to pass for Jenkins build
     */

    public Set<String> getFilterdKeySet() {
        return Collections.unmodifiableSet(filterdKeySet);
    }

    public void setFilterdKeySet(Set<String> filterdKeySet) {
        this.filterdKeySet = filterdKeySet;
    }

    public boolean isFilterdKeySetIni() {
        return filterdKeySetIni;
    }

    public void setFilterdKeySetIni(boolean filterdKeySetIni) {
        this.filterdKeySetIni = filterdKeySetIni;
    }

    @Autowired(required = false)
    private CpcServicesPropertyConfigurer cpcServicesPropertyConfigurer;

    public Set<String> getKeysFromCache() {
        return Collections.unmodifiableSet(schemeViewerCache.keySet());
    }

    public boolean isCacheInitialized() {
        return cacheInitialized;
    }

    public void setCacheInitialized(boolean cacheInitialized) {
        this.cacheInitialized = cacheInitialized;
    }

    public NodeModel getValueByKey(String key) {
        return schemeViewerCache.get(key);
    }

    @PostConstruct
    public void initializeCache() {
        long startTime = System.currentTimeMillis();
        long endTime;

        try {
            files =
                    (new File(cpcServicesPropertyConfigurer.getProperty(Constants.SCHEME_LOCATION_KEY)))
                            .listFiles(new FileFilter() {
                                @Override
                                public boolean accept(File pathname) {
                                    String fileName = pathname.getName();
                                    return fileName.startsWith(Constants.CPC_SCHEME_FILE_PREFIX)
                                            && fileName.endsWith(Constants.CPC_SCHEME_FILE_POSTFIX);
                                }
                            });
            endTime = System.currentTimeMillis();
            log.debug("Time taken to get all the Files from Mount Successfully = " + (endTime - startTime));
        } catch (SecurityException se) {
            log.error(se.getMessage(), se);
            endTime = System.currentTimeMillis();
            log.debug("Time taken to get all the Files from Mount with Exception = " + (endTime - startTime));
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            endTime = System.currentTimeMillis();
            log.debug("Time taken to get all the Files from Mount with Exception = " + (endTime - startTime));
        }

        if (files != null) {
            processFiles(files);
        }
    }

    private void processFiles(File[] files) {
        long endTime;

        if (files != null) {
            long startTimeCache = System.currentTimeMillis();
            for (File file : files) {

                NodeModel nodelModel = readFromCache(file);
                if (nodelModel != null) {
                    schemeViewerCache.put(file.getName(), nodelModel);

                    String suffix =
                            file.getName().replaceFirst((Constants.CPC_SCHEME_FILE_PREFIX + Constants.HYPHEN),
                                    Constants.EMPTY_STRING).replaceFirst(Constants.CPC_SCHEME_FILE_POSTFIX,
                                    Constants.EMPTY_STRING);

                    if (suffix.length() > Constants.ONE && StringUtils.isAlphanumeric(suffix)) {
                        String suf = suffix.substring(Constants.ZERO, Constants.THREE);
                        filterdKeySet.add(suf);
                    }

                }
            }

            endTime = System.currentTimeMillis();
            log.debug("Time taken to put all the Files Content into Cache = " + (endTime - startTimeCache));
            if (schemeViewerCache.size() != Constants.VALUE_ZERO) {
                cacheInitialized = true;
            }

            if (filterdKeySet.size() != Constants.VALUE_ZERO) {
                filterdKeySetIni = true;
            }
        }
    }

    private static NodeModel readFromCache(File file) {
        long startTime = System.currentTimeMillis();
        long endTime;

        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        InputSource inputSource = null;
        try {

            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream, Constants.DEFAULT_XML_ENCODER);

            inputSource = new InputSource(inputStreamReader);
            inputSource.setEncoding(Constants.DEFAULT_XML_ENCODER);
            NodeModel nodeModel = NodeModel.parse(inputSource);
            endTime = System.currentTimeMillis();
            log.debug("Time taken to parse the File Content from Cache successfully = " + (endTime - startTime));
            return nodeModel;
        } catch (IOException ioe) {
            log.error(ioe.getMessage(), ioe);
            endTime = System.currentTimeMillis();
            log.debug("Time taken to parse the File Content from Cache with Exceptions = " + (endTime - startTime));
            return null;
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            endTime = System.currentTimeMillis();
            log.debug("Time taken to parse the File Content from Cache with Exceptions = " + (endTime - startTime));
            return null;
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }

            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
    }
}
