package com.testing.cpc.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import freemarker.ext.dom.NodeModel;
import com.testing.cpc.common.constant.Constants;
import com.testing.cpc.service.CpcBusinessService;

/**
 * US 5899
 * 
 * @author Testing
 * @version 1.6 Aug 26, 2014
 * 
 */
@Component
public class CpcSchemeViewerHelper {

    private static final Logger logger = Logger.getLogger(CpcSchemeViewerHelper.class);

    @Autowired
    private CpcSchemeViewerCache cpcSchemeViewerCache;

    @Autowired
    private CpcSchemeViewerFileReader cpcSchemeViewerFileReader;

    public NodeModel getCpcSchemeSourceFile(final String symbolText, final String suffix) {
        long startTime = System.currentTimeMillis();
        long endTime;

        if ((symbolText != null) && (!symbolText.isEmpty())) {
            // fileSuffix structure will be (roughly):
            // "cpc-scheme-([A-Z]{1})([A-Z0-9]{3})?.xml"
            String fileKey =
                    Constants.CPC_SCHEME_FILE_PREFIX
                            + (StringUtils.isNotBlank(suffix) ? (Constants.HYPHEN + suffix) : Constants.NO_SPACE)
                            + Constants.CPC_SCHEME_FILE_POSTFIX;
            if (cpcSchemeViewerCache.isCacheInitialized()) {
                NodeModel nodeModel = readFromCache(fileKey);
                return nodeModel;
            } else {
                NodeModel nodeModel = null;
                try {
                    if (!cpcSchemeViewerCache.isCacheInitialized()) {
                        cpcSchemeViewerCache.initializeCache();
                    }
                    endTime = System.currentTimeMillis();
                    logger.info("Time taken to load the Cache for Service Request, since it failed to load at startup = "
                            + (endTime - startTime));
                    if (cpcSchemeViewerCache.isCacheInitialized()) {
                        nodeModel = readFromCache(fileKey);
                    } else {
                        File file = cpcSchemeViewerFileReader.getFileForTheGivenXMLPath(suffix);
                        nodeModel = NodeModel.parse(file);
                        endTime = System.currentTimeMillis();
                        logger.info("Time taken to parse the File Content from Mount successfully = "
                                + (endTime - startTime));
                    }
                    return nodeModel;
                } catch (Exception ex) {
                    logger.error(ex.getMessage(), ex);
                    endTime = System.currentTimeMillis();
                    logger.info("Time taken to parse the File Content from Mount with Exceptions = " + (endTime - startTime));
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    private NodeModel readFromCache(String fileKey) {

        return cpcSchemeViewerCache.getValueByKey(fileKey);
    }

    private List<NodeModel> getCpcSchemeFiles(final String symbolText) {
        SortedSet<String> keys = new TreeSet<>(cpcSchemeViewerCache.getKeysFromCache());
        List<NodeModel> nodeModels = new ArrayList<>();
        logger.info("Total Keys found = " + keys.size());
        for (String key : keys) {
            String suffix =
                    key.replaceFirst((Constants.CPC_SCHEME_FILE_PREFIX + Constants.HYPHEN), "").replaceFirst(
                            Constants.CPC_SCHEME_FILE_POSTFIX, "");
            if (symbolText.equalsIgnoreCase(Constants.ASTERISK)) {
                if (suffix.length() == Constants.VALUE_ONE) {
                    logger.info("Key = " + key);
                    nodeModels.add(readFromCache(key));
                }
            } else if (symbolText.length() == Constants.VALUE_ONE) {
                if (suffix.length() == Constants.VALUE_ONE) {
                    if (!(symbolText.equalsIgnoreCase(suffix))) {
                        logger.info("Key = " + key);
                        nodeModels.add(readFromCache(key));
                    }
                }
            } else if (symbolText.length() == Constants.VALUE_THREE) {
                if (suffix.startsWith(symbolText)) {
                    logger.info("Key = " + key);
                    nodeModels.add(readFromCache(key));
                }
                if (suffix.length() == Constants.VALUE_ONE) {
                    if (!(symbolText.startsWith(suffix))) {
                        logger.info("Key = " + key);
                        nodeModels.add(readFromCache(key));
                    }
                }
            } else if (symbolText.length() >= Constants.VALUE_FOUR) {
                if (suffix.length() >= Constants.VALUE_FOUR) {
                    if (symbolText.startsWith(suffix.substring(Constants.VALUE_ZERO, Constants.VALUE_THREE))) {
                        logger.info("Key = " + key);
                        nodeModels.add(readFromCache(key));
                    }
                }
                if (suffix.length() == Constants.VALUE_ONE) {
                    if (!(symbolText.startsWith(suffix))) {
                        logger.info("Key = " + key);
                        nodeModels.add(readFromCache(key));
                    }
                }
            }
        }

        return nodeModels;
    }

    public List<NodeModel> getAllCpcSchemeFiles(final String symbolText) {
        List<NodeModel> nodeModels = new ArrayList<>();
        if (StringUtils.isEmpty(symbolText)) {
            nodeModels = null;
        } else if (symbolText.equalsIgnoreCase(Constants.ASTERISK)) {
            nodeModels = getCpcSchemeFiles(symbolText);
        } else if (symbolText.length() == Constants.VALUE_ONE) {
            nodeModels = getCpcSchemeFiles(symbolText);
            nodeModels.addAll(Arrays.asList(getCpcSchemeSourceFile(symbolText, CpcBusinessService
                    .getSectionFromSymbolText(symbolText)), getCpcSchemeSourceFile(symbolText, "")));
        } else if (symbolText.length() >= Constants.VALUE_THREE) {
            nodeModels = getCpcSchemeFiles(symbolText);
            nodeModels.addAll(Arrays.asList(getCpcSchemeSourceFile(symbolText, CpcBusinessService
                    .getSectionFromSymbolText(symbolText)), getCpcSchemeSourceFile(symbolText, "")));
        }

        return nodeModels;
    }

    public NodeModel getMainCpcSchemeFile(final String symbolText) {
        if (StringUtils.isEmpty(symbolText)) {
            return null;
        } else {
            return getCpcSchemeSourceFile(symbolText, CpcBusinessService.getMainGroupFromSymbolText(symbolText));
        }
    }

}
