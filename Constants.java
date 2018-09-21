package com.testing.cpc.common.constant;

import java.awt.Color;
import java.util.regex.Pattern;

import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;

/**
 * The Constants class represents a constants defined and used across CPC
 * Services
 *
 
 */

public class Constants {

    public static final String POINTCUT_EXECUTE_SERVICE_METHODS = "execution( * com.testing.cpc.service.impl..*.*(..))";
    public static final String POINTCUT_FAMILY_METHODS =
            "execution( * com.testing.cpc.service.impl.CPCFamilyServiceImpl.*(..))";
    public static final String POINTCUT_CLASSIFICATION_SYMBOL_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCClassificationSymbolServiceImpl.*(..))";
    public static final String POINTCUT_PATENT_DOCUMENT_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCPatentDocumentServiceImpl.*(..))";
    public static final String POINTCUT_ALLOCATION_METHODS = "execution( * com.testing.cpc.service."
            + "impl.CPCAllocationServiceImpl.*(..))";
    public static final String POINTCUT_PATENT_DOCUMENT_ALLOCATION_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCPatentDocumentAllocServiceImpl.*(..))";
    public static final String POINTCUT_PATENT_FAMILY_ALLOCATION_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCPatentFamilyAllocServiceImpl.*(..))";
    public static final String POINTCUT_STND_RAISE_HAND_STATUS_METHODS = "execution( * com.testing.cpc.service.impl."
            + "StndRaiseHandStatusServiceImpl.*(..))";
    public static final String POINTCUT_RAISE_HAND_STATUS_METHODS = "execution( * com.testing.cpc.service.impl."
            + "RaiseHandStatusServiceImpl.*(..))";
    public static final String POINTCUT_RAISE_HAND_METHODS = "execution( * com.testing.cpc.service.impl."
            + "RaiseHandServiceImpl.*(..))";
    public static final String POINTCUT_STND_RAISE_HAND_TYPE_METHODS = "execution( * com.testing.cpc.service.impl."
            + "StndRaiseHandTypeServiceImpl.*(..))";
    public static final String POINTCUT_SYMBOL_VALIDATION_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCSymbolValidationServiceImpl.*(..))";
    // History tables
    public static final String POINTCUT_ACTION_HIST_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCActionHistServiceImpl.*(..))";
    public static final String POINTCUT_FAMILY_COMPOSTN_HIST_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCFamilyCompostnHistServiceImpl.*(..))";
    public static final String POINTCUT_SYMBOL_ALLOCATION_HIST_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCSymbolAllocationHistServiceImpl.*(..))";
    // RBAC tables
    public static final String POINTCUT_STND_GAU_METHODS = "execution( * com.testing.cpc.service.impl."
            + "CPCSymbolAllocationHistServiceImpl.*(..))";
    public static final String POINTCUT_GAU_ROLE_METHODS = "execution( * com.testing.cpc.service.impl."
            + "GauRoleServiceImpl.*(..))";
    public static final String POINTCUT_APPLICATION_USER_ROLE_METHODS = "execution( * com.testing.cpc.service.impl."
            + "ApplicationUserRoleServiceImpl.*(..))";
    public static final String POINTCUT_APPLICATION_USER_METHODS = "execution( * com.testing.cpc.service.impl."
            + "ApplicationUserServiceImpl.*(..))";
    public static final String POINTCUT_STND_ROLE_METHODS = "execution( * com.testing.cpc.service.impl."
            + "StndRoleServiceImpl.*(..))";
    public static final String POINTCUT_STND_PRIVILEGE_METHODS = "execution( * com.testing.cpc.service.impl."
            + "StndPrivilegeServiceImpl.*(..))";
    public static final String POINTCUT_RESOURCE_ROLE_METHODS = "execution( * com.testing.cpc.service.impl."
            + "ResourceRoleServiceImpl.*(..))";
    public static final String POINTCUT_STND_RESOURCE_METHODS = "execution( * com.testing.cpc.service.impl."
            + "StndResourceServiceImpl.*(..))";

    public static final String RESOURCE_NM_FAMILY = "family";
    public static final String RESOURCE_NM_CLASSIFICATION_SYMBOL = "classification_symbol";
    public static final String RESOURCE_NM_PATENT_DOCUMENT = "patent_document";
    public static final String RESOURCE_NM_ALLOCATION = "allocation";
    public static final String RESOURCE_NM_PATENT_DOCUMENT_ALLOCATION = "patent_document_allocation";
    public static final String RESOURCE_NM_PATENT_FAMILY_ALLOCATION = "patent_family_allocation";
    public static final String RESOURCE_NM_STND_RAISE_HAND_STATUS = "stnd_raise_hand_status";
    public static final String RESOURCE_NM_RAISE_HAND_STATUS = "raise_hand_status";
    public static final String RESOURCE_NM_RAISE_HAND = "raise_hand";
    public static final String RESOURCE_NM_STND_RAISE_HAND_TYPE = "stnd_raise_hand_type";
    public static final String RESOURCE_NM_SYMBOL_VALIDATION = "symbol_validation";
    // History tables
    public static final String RESOURCE_NM_ACTION_HIST = "action_hist";
    public static final String RESOURCE_NM_FAMILY_COMPOSTN_HIST = "family_compostn_hist";
    public static final String RESOURCE_NM_SYMBOL_ALLOCATION_HIST = "symbol_allocation_hist";
    // RBAC tables
    public static final String RESOURCE_NM_STND_GAU = "stnd_gau";
    public static final String RESOURCE_NM_GAU_ROLE = "gau_role";
    public static final String RESOURCE_NM_APPLICATION_USER_ROLE = "application_user_role";
    public static final String RESOURCE_NM_APPLICATION_USER = "application_user";
    public static final String RESOURCE_NM_STND_ROLE = "stnd_role";
    public static final String RESOURCE_NM_STND_PRIVILEGE = "stnd_privilege";
    public static final String RESOURCE_NM_RESOURCE_ROLE = "resource_role";
    public static final String RESOURCE_NM_STND_RESOURCE = "stnd_resource";

    public static final String PUBLISHED_DATE_REGEXP = "[0-9]{2}[- /.][0-9]{2}[- /.][0-9]{4}";

    public static final String GET = "get";
    public static final String CREATE = "create";
    public static final String UPDATE = "update";
    public static final String DELETE = "delete";
    public static final String DELETE_UPPER_CASE = "Delete";
    public static final String VALIDATE = "validate";
    public static final String LIST = "list";
    public static final String ADD = "add";
    public static final String ALLOCATE = "allocate";

    // generic constants for service Impl methods
    public static final String DATE_FORMAT_MM_DD_YYYY = "MM-dd-yyyy hh:mm:ss.SSS";
    public static final String DATE_FORMAT_YYYY_MM_DD = "yyyyMMdd";
    public static final String MM_DD_YYYY_FORMAT = "MM-dd-yyyy";
    public static final String DATE_FORMAT_YYYY_MM_DD_WITH_HIPHEN = "yyyy-MM-dd";
    public static final String DATE_FORMAT_MMM_DD_COMMA_YYYY = "MMM dd, yyyy hh:mm a";
    public static final String MM_DD_YYYY_FORMAT_WITH_SLASH = "MM/dd/yyyy";

    public static final String CLASSIFICATION_METHOD_CD_H = "H";
    public static final String CLASSIFICATION_METHOD_CD_M = "M";
    public static final String CLASSIFICATION_METHOD_CD_G = "G";
    public static final String CLASSIFICATION_METHOD_CD_A = "A";
    public static final String CLASSIFICATION_METHOD_CD_C = "C";

    public static final String CLASSIFICATION_VALUE_CD_I = "I";
    public static final String CLASSIFICATION_VALUE_CD_A = "A";

    public static final String POSITION_FIRST = "F";
    public static final String POSITION_LATER = "L";

    public static final String YES_CODE = "Y";
    public static final String NO_CODE = "N";
    public static final String N_A = "N/A";

    public static final String COMMON_CLASSIFICATION_IN_Y = "Y";
    public static final String COMMON_CLASSIFICATION_IN_N = "N";
    public static final String RAISE_HAND_IN_Y = "Y";
    public static final String RAISE_HAND_IN_N = "N";

    public static final String RHF_STATUS_CODE_UNREVIEWED = "UNREVIEWED";
    public static final String RHF_STATUS_CODE_WITHDRAW = "WITHDRAW";

    public static final String CLASSIFICATION_STATUS_CODE_B = "B";
    public static final String CLASSIFICATION_STATUS_CODE_R = "R";

    public static final String VALID_CODE = "VALID";
    public static final String INVALID_CODE = "INVALID";
    public static final String FROZEN_CODE = "FROZEN";

    public static final String CPC_MEMBER_IPO_CD_US = "US";
    public static final String CPC_MEMBER_IPO_CD_EP = "EP";

    public static final String CPC_FAMILY_MEMBER_APP_ID_NA = "NA";
    public static final String CPC_FAMILY_MEMBER_SERVICE_VIOLATION_NO_RESULT_FOUND_DOC_ID = "cpc.classification."
            + "familyMembers.docId";
    public static final String CPC_FAMILY_MEMBER_SERVICE_VIOLATION_NO_RESULT_FOUND_APP_NO = "cpc.classification."
            + "familyMembers.appNo";
    public static final String CPC_FAMILY_MEMBER_SERVICE_VIOLATION_NO_RESULT_FOUND_FAM_ID = "cpc.classification."
            + "familyMembers.designatedFamilyId";
    public static final String CPC_FAMILY_MEMBER_SERVICE_VIOLATION_NO_RESULT_FOUND_FORGN_DOC_ID = "cpc.classification."
            + "familyMembers.forgnDocId";
    public static final String CPC_TSA_DIRECTORY_SERVICE_VIOLATION_NO_RESULT_FOUND = "cpc.tsa.directory."
            + "service.violation.noResults";
    public static final long CPC_TSA_DIRECTORY_SERVICE_TREE_DEPTH_TECH_CENTER = 1L;
    public static final long CPC_TSA_DIRECTORY_SERVICE_TREE_DEPTH_WORK_GROUP = 2L;
    public static final long CPC_TSA_DIRECTORY_SERVICE_TREE_DEPTH_ART_UNIT = 3L;

    public static final String USER_ID_US = "US";
    public static final String USER_ID_EPO = "EPO";
    public static final String USER_ID_RTIS = "RTIS";
    public static final String USER_ID_PDCS = "PDCS";

    public static final String PDCS_PROCESS = "PDCS";
    public static final String RTIS_PROCESS = "RTIS";
    public static final String RTIS_BATCH_TYPE = "RTIS";
    public static final String PGPUB_DOCUMENT = "PGPUB";
    public static final String GRANT_DOCUMENT = "GRANT";
    public static final String SERCO_PROCESS = "SERCO";
    public static final String OACS_PROCESS = "OACS";
    public static final String PDCS_PROCESS_CONVERSION = "PDCS CONVERSION";

    public static final String SYMBOL_STATUS_CD_PROD = "PROD";
    public static final String SYMBOL_STATUS_CD_PREPUB = "PREPUB";
    public static final String SYMBOL_STATUS_CD_TO_BE_DELETED = "TO BE DELETED";

    public static final int POSITION_ONE = 1;
    public static final int POSITION_NINENINTYNINE = 999;
    public static final int VALUE_MINUS_ONE = -1;
    public static final String STRING_ZERO = "0";
    public static final String STRING_ONE = "1";
    public static final int VALUE_ZERO = 0;
    public static final int VALUE_ONE = 1;
    public static final int VALUE_TWO = 2;
    public static final int VALUE_THREE = 3;
    public static final int VALUE_FOUR = 4;
    public static final int VALUE_FIVE = 5;
    public static final int VALUE_SIX = 6;
    public static final int VALUE_SEVEN = 7;
    public static final int VALUE_EIGHT = 8;
    public static final int VALUE_NINE = 9;
    public static final int VALUE_TEN = 10;
    public static final int VALUE_ELEVEN = 11;
    public static final int VALUE_TWELVE = 12;
    public static final int VALUE_THIRTEEN = 13;
    public static final int VALUE_FOURTEEN = 14;
    public static final int VALUE_FIFTEEN = 15;
    public static final int VALUE_SIXTEEN = 16;
    public static final int VALUE_THRITY = 30;
    public static final int VALUE_THRITYONE = 31;
    public static final int VALUE_FIVEONETWO = 512;
    public static final int VALUE_FOURK = 4000;

    public static final int ZERO = 0;
    public static final int ONEL = 1;
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
    public static final int SEVEN = 7;
    public static final int EIGHT = 8;
    public static final int NINE = 9;
    public static final int TEN = 10;
    public static final int ELEVEN = 11;
    public static final int TWELVE = 12;
    public static final int THIRTEEN = 13;
    public static final int FOURTEEN = 14;
    public static final int FIFTEEN = 15;
    public static final int SIXTEEN = 16;
    public static final int TWENTY = 20;
    public static final int TWENTY_FIVE = 25;
    public static final int ONE_HUNDRED = 100;
    public static final int FIFTY = 50;
    public static final int FIVE_HUNDRED = 500;
    public static final int ONE_THOUSAND = 1000;
    public static final int HTTP_STATUS_CODE_301 = 301;
    public static final int HTTP_STATUS_CODE_302 = 302;
    public static final int HTTP_STATUS_CODE_303 = 303;

    public static final int JPA_BULK_INSERT_UPDATE_RECORDS = 500;
    public static final int JPA_BULK_INSERT_UPDATE_RECORDS_400 = 400;
    public static final int JPA_BULK_INSERT_UPDATE_RECORDS_300 = 300;
    public static final int JPA_BULK_INSERT_UPDATE_RECORDS_200 = 200;
    public static final int JPA_BULK_INSERT_UPDATE_RECORDS_100 = 100;
    public static final int JPA_BULK_INSERT_UPDATE_RECORDS_50 = 50;
    public static final int JPA_BULK_INSERT_UPDATE_RECORDS_25 = 25;
    public static final int JPA_BULK_INSERT_UPDATE_RECORDS_10 = 10;
    public static final int TEXT_SEARCH_LIMIT_RESPONSE = 500;
    public static final int TEXT_SEARCH_LIMIT_DAOP = 2000;
    public static final int FLUSH_COUNT_500 = 500;
    public static final int FLUSH_COUNT_25 = TWENTY_FIVE;
    public static final int FLUSH_COUNT_10 = TEN;
    public static final int FLUSH_COUNT_5 = FIVE;
    public static final int DEFAULT_PAGE_SIZE = TWENTY_FIVE;
    public static final int FLUSH_COUNT_1 = ONE;
    public static final int RECORD_COUNT_ONE = 1;

    public static final boolean TRUE_FLAG = true;
    public static final boolean FALSE_FLAG = false;

    public static final long LOCK_CONTROL_NUMBER_VALUE_ONE = 1;
    public static final long ZEROL = 0;
    public static final long ZERO_LONG = 0L;
    public static final long ONE_LONG = 1L;
    public static final long THREE_L = 3L;
    public static final long START_FISCAL_YEAR = 2013;
    public static final long TEMP_LONG_NUMBER = 888888888888l;
    public static final double ZERO_DOUBLE = 0.0d;

    public static final String WHITE_SPACE = " ";
    public static final String NO_SPACE = "";
    public static final String COLON = ":";

    public static final String ACTION_CODE_CREATE = "CREATE";
    public static final String ACTION_CODE_ADD = "ADD";
    public static final String ACTION_CODE_UPDATE = "UPDATE";
    public static final String ACTION_CODE_DELETE = "DELETE";
    public static final String ACTION_CODE_WITHDRAW = "WITHDRAW";
    public static final String ACTION_CODE_UNWITHDRAW = "UNWITHDRAW";
    public static final String ACTION_CODE_ALLOCATE = "ALLOCATE";
    public static final String ACTION_CODE_ALLOCATION = "ALLOCATION";
    public static final String ACTION_FAMILY_PROCESS = "FAMILY";
    public static final String ACTION_DOCUMENT_PROCESS = "DOCUMENT";
    public static final String ACTION_APPLICATION_PROCESS = "APPLICATION";
    public static final String ACTION_SYMBOL_PROCESS = "SYMBOL";
    public static final String ACTION_CODE_AGREE = "AGREE";
    public static final String ACTION_CODE_AGREED = "AGREED";
    public static final String ACTION_CODE_DISAGREE = "DISAGREE";
    public static final String ACTION_CODE_DISAGREED = "DISAGREED";
    public static final String ACTION_CODE_CREATE_RHF = "CREATERHF";
    public static final String ACTION_CODE_UNDO_RHF = "UNDORHF";
    public static final String ACTION_CODE_RHF = "RHF";

    public static final String PROCESS_CODE_ESB_INITIAL = "ESBINITIAL";
    public static final String PROCESS_CODE_INITIAL = "INITIAL";
    public static final String PROCESS_CODE_INITIAL_TEXT = "INITIAL CLASSIFICATION";
    public static final String PROCESS_ESB = "ESB";
    public static final String PROCESS_CODE_KIPO = "KIPO";

    public static final String MESSAGE_CODE_CPC_NO_RECORDS_FOUND = "cpc.noRecordsFound";
    public static final String MESSAGE_CODE_CPC_BAD_INPUT = "cpc.badInput";
    public static final String MESSAGE_CODE_CPC_NO_UPDATE = "cpc.noUpdates";

    public static final String SCHEMA_SYMBOL_VALIDATION = "CPCSymbolList.xsd";
    public static final String SCHEMA_SYMBOL_ALLOCATION = "CPCSymbolAllocationList.xsd";
    public static final String SCHEMA_BATCH_DOCUMENT = "BatchDocument.xsd";
    public static final String SCHEMA_BATCH_LOG = "BatchLog.xsd";
    public static final String SCHEMA_BATCH_DOCUMENT_ALLOCATION = "BatchDocumentAllocation.xsd";
    public static final String SCHEMA_DOCUMENT_LIST = "DocumentList.xsd";

    public static final String UNMARSHAL_EXCEPTION_STRING = "javax.xml.bind.UnmarshalException";
    public static final String LINKED_EXCEPTION_STRING = "- with linked exception";
    public static final String SAXPARSE_EXCEPTION_STRING = "org.xml.sax.SAXParseException";
    public static final String CVC_COMPLEX_TYPE_STRING = "cvc-complex-type.2.4.a";
    public static final String CVC_ELT_STRING = "cvc-elt.1";

    public static final String RIGHT_SQUARE_BRACKET_STRING = "[";
    public static final String LEFT_SQUARE_BRACKET_STRING = "]";
    public static final String SEMI_COLON_STRING = ":";
    public static final String HYPHEN = "-";
    public static final String ASTERISK = "*";
    public static final String PIPE = "|";
    public static final String SINGLE_QUOTE_STRING = "'";

    public static final String CONTRACTOR_STRING = "Contractor";
    public static final String US_NON_EXPERT_STRING = "US (Non-Expert)";
    public static final String US_EXPERT_STRING = "US (Expert)";

    public static final String STATUS_SUCCESS_STRING = "SUCCESS";

    public static final String USERID_SERCO = "SERCO";
    public static final String USERID_RTIS = "RTIS";
    public static final String USERID_EPO = "EPO";
    public static final String USERID_US_NONEXP = "US (NON-EXPERT)";
    public static final String USERID_US_EXP = "US (EXPERT)";
    public static final String USERID_USPTO = "USPTO";
    public static final String USERID_EP = "EP";

    public static final String ROLE_QN = "QN";
    public static final String ROLE_SPEQN = "SPEQN";
    public static final String ROLE_TCLEAD = "TL";
    public static final String ROLE_RECLASS = "RECLASS";
    public static final String ROLE_QN_SPEQN_TL_ALL = "ALL";
    public static final String ROLE_CQIC = "CQIC";
    public static final String ROLE_ADMIN = "ADMIN";
    public static final String ROLE_ODM = "ODM";
    public static final String ROLE_PDCS = "PDCS";

    public static final String ROLE_CQIC_CMNT_TYPE = "CQI";

    public static final String CPC_ALLOCATION_LIKE = "LIKE";
    public static final String CPC_ALLOCATION_DISLIKE = "DISLIKE";

    public static final String CPC_ALLOCATION_ENDORSEMENT_LIKE_SUCCESS = "cpc.allocation.endorsement.like.success";
    public static final String CPC_ALLOCATION_ENDORSEMENT_DISLIKE_SUCCESS = "cpc.allocation.endorsement.dislike.success";

    public static final String PATH_SEPARATOR = "/";
    public static final String QUESTION_MARK = "?";

    public static final String SCHEME_LOCATION_KEY = "cpc.schemeView.schemeLocation";

    public static final String DEFAULT_XML_ENCODER = "UTF-8";

    public static final String CPC_SCHEME_FREEMARKER_FILE = "ftl/cpc_scheme.ftl";
    public static final String CPC_SCHEME_FREEMARKER_FILE_CHILDREN = "ftl/class_symbol_children.ftl";
    public static final String CPC_SCHEME_FREEMARKER_FILE_ANCESTOR = "ftl/class_symbol_ancestor.ftl";

    public static final String CPC_SCHEME_FILE_PREFIX = "cpc-scheme";
    public static final String CPC_SCHEME_FILE_POSTFIX = ".xml";

    public static final String MESSAGE_CODE_CPC_SYMBOL_CANNOT_FIRST_POSITION = "cpc.symbol.cannot.first.position";
    public static final String MESSAGE_CODE_CPC_SYMBOL_VALIDATION_CANNOT_INVENTIVE =
            "cpc.symbol.validation.cannot.inventive";
    public static final String MESSAGE_CODE_CPC_FAMILY_NO_VALID_FIRST_ALLOCATION = "cpc.family.no.valid.first.allocation";
    public static final String MESSAGE_CODE_CPC_SYMBOL_NOT_FOUND = "cpc.symbol.notFound";

    public static final String SECTION_A = "A";
    public static final String SECTION_B = "B";
    public static final String SECTION_C = "C";
    public static final String SECTION_D = "D";
    public static final String SECTION_E = "E";
    public static final String SECTION_F = "F";
    public static final String SECTION_G = "G";
    public static final String SECTION_H = "H";
    public static final String SECTION_Y = "Y";

    public static final String SECTION_A_TITLE = "HUMAN NECESSITIES";
    public static final String SECTION_B_TITLE = "PERFORMING OPERATIONS";
    public static final String SECTION_C_TITLE = "CHEMISTRY";
    public static final String SECTION_D_TITLE = "TEXTILES";
    public static final String SECTION_E_TITLE = "FIXED CONSTRUCTIONS";
    public static final String SECTION_F_TITLE = "MECHANICAL ENGINEERING";
    public static final String SECTION_G_TITLE = "PHYSICS";
    public static final String SECTION_H_TITLE = "ELECTRICTY";
    public static final String SECTION_Y_TITLE = "GENERAL TAGGING OF NEW TECHNOLOGICAL DEVELOPMENTS";

    public static final String CPC_SCHEME_TEXT_ROOT_TAG = "root";
    public static final String CPC_SCHEME_TEXT_SCHEME_TAG = "CPC Scheme";

    public static final String PERCENTAGE = "%";
    public static final String FULL_TEXT_REGEX1 = "(?i)(.*?\\b";

    public static final String FULL_TEXT_REGEX2 = "\\b.*?)";
    public static final String SPACES = "\\s+";

    public static final String TRUE_STRING = "true";
    public static final String FALSE_STRING = "false";

    public static final String BACK_SLASH = "/";
    public static final String SYMBOL_RANGE_ALL = "ALL";

    public static final String MESSAGE_CODE_CPC_USER_SYMBOL_RANGE_SAVE_FAILED = "cpc.user.symbol.range.save";

    public static final String CPC_RPM_INVALID_PROJECT_ID = "cpc.rpm.invalid.project.id";
    public static final String FILE_UPLOAD_STATUS = "UPLOADED";
    public static final String FILE_UPLOAD_FAILED_STATUS = "UPLOAD FAILED";
    public static final String SERVICE_SUCCESS_200_CODE = "200";
    public static final String SERVICE_FAILURE_500_CODE = "500";
    public static final String SERVICE_FAILURE_400_CODE = "400";
    public static final String SERVICE_FAILURE_500_CODE_PARAM = "500_PARAM";

    public static final String MESSAGE_CODE_CPC_RDS_SHEET_DATA_NOT_AT_ROW_FIVE =
            "cpc.rds.workspace.spreadsheet.data.notat.row5";
    public static final String MESSAGE_CODE_CPC_RDS_SHEET_INVALID_IPO_CODE =
            "cpc.rds.workspace.spreadsheet.ipo.code.invalid";
    public static final String MESSAGE_CODE_CPC_RDS_SHEET_INVALID_SEQ_NUM =
            "cpc.rds.workspace.spreadsheet.seq.number.invalid";
    public static final String MESSAGE_CODE_CPC_RDS_SHEET_CLASSIFICATION_VALUE_EMPTY =
            "cpc.rds.workspace.spreadsheet.classification.value.empty";

    public static final String MESSAGE_CODE_RDS_UPLOAD_EMPTY_SPACES = "rds.upload.empty.spaces.in.value";
    public static final String MESSAGE_CODE_RDS_UPLOAD_TOO_LARGE_VALUE = "rds.upload.content.length.more";
    public static final String MESSAGE_CODE_RDS_UPLOAD_ERROR = "rds.upload.error";
    public static final String MESSAGE_CODE_RDS_UPLOAD_CSV_MESSAGE = "CSV:Cell,Error,\n";
    public static final String MESSAGE_CODE_RDS_UPLOAD_UNKNOWN_ERROR = ",Unknown Error, \n";
    public static final String MESSAGE_CODE_RDS_UPLOAD_CELL_TYPE_ERROR = "rds.upload.content.cell.type";

    public static final String NPL_CMNT = "NPL";
    public static final String UNOTE_CMNT = "UNOTE";

    public static final String MESSAGE_CODE_CPC_RDS_WORKSPACE_PROJECT_BATCH_EXISTS = "cpc.rds.workspace."
            + "project.batch.already.exists";
    public static final String MESSAGE_CODE_CPC_RDS_WORKSPACE_FILE_CONTENT_MISSING =
            "cpc.rds.workspace.file.content.missing";
    public static final String MESSAGE_CODE_CPC_RDS_WORKSPACE_SPREADSHEET_INVALID = "cpc.rds.workspace.spreadsheet.invalid";
    public static final String MESSAGE_CODE_CPC_RDS_FILE_TYPE_SAMPLE = "cpc.rds.file.type.sample";

    // CPCIssueClassificationPdfReport
    public static final Color GRAY = new Color(238, 238, 238);
    public static final Font HELVETICA_10_BOLD = FontFactory.getFont(FontFactory.HELVETICA, 10, Font.BOLD);
    public static final Font HELVETICA_12 = FontFactory.getFont(FontFactory.HELVETICA, 12);
    public static final Font HELVETICA_12_BOLD = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.BOLD);
    public static final Font HELVETICA_14 = FontFactory.getFont(FontFactory.HELVETICA, 14);
    public static final Font HELVETICA_14_BOLD = FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD);
    public static final Font HELVETICA_16_BOLD_UNDERLINE = FontFactory.getFont(FontFactory.HELVETICA, 14, Font.BOLD);

    // CPCIssueClassificationInputParser
    public static final char TAB = '\t';
    public static final char CARRIAGE_RETURN = '\r';
    public static final char NEWLINE = '\n';
    public static final String EMPTY_STRING = "";
    public static final String STRING_NULL = null;
    public static final String PARSE_COMBINATION_SETS = "Combination Sets (";
    public static final String PARSE_DOCUMENTS = "Documents (";
    public static final String PARSE_APPLICATION_NUMBER_SPACES = " Application Number: ";
    public static final String PARSE_APP_USER_ID_SPACES = " appUserId: ";
    public static final String PARSE_END_PAREN_COLON = "):";
    public static final String PARSE_END_PAREN = ")";
    public static final String PARSE_START_PAREN = "(";
    public static final String PARSE_DATE_CREATED2 = "Date Created:";
    public static final String PARSE_DATE_CREATED = " Date Created:";
    public static final String PARSE_APPLICATION_NUMBER = "Application Number: ";
    public static final String PARSE_APP_USER_ID = "appUserId: ";
    public static final String PARSE_USERNAME = "Username: ";
    public static final String STRING_NEWLINE = "\\n";
    public static final String COMMA = ",";
    public static final String INPUT_CSV_IS_MALFORMED = "Input CSV is malformed";
    public static final String DOUBLES_QUOTES = "\"\"";
    public static final String DOUBLE_QUOTE = "\"";
    public static final String INPUT_COMBINATION_LIST = "COMBINATION_LIST";
    public static final String INPUT_COMBINATION_COUNT = "COMBINATION_COUNT";
    public static final String INPUT_ALLOCATION_LIST = "ALLOCATION_LIST";
    public static final String INPUT_ALLOCATION_COUNT = "ALLOCATION_COUNT";
    public static final String INPUT_FOREIGN_DOCUMENT_LIST = "FOREIGN_DOCUMENT_LIST";
    public static final String INPUT_FOREIGN_DOCUMENT_COUNT = "FOREIGN_DOCUMENT_COUNT";
    public static final String INPUT_DOCUMENT_LIST = "DOCUMENT_LIST";
    public static final String INPUT_DOCUMENT_COUNT = "DOCUMENT_COUNT";
    public static final String INPUT_US_APP_COUNT = "US_APP_COUNT";
    public static final String INPUT_FAMILY_ID = "FAMILY_ID";
    public static final String INPUT_DATE_CREATED = "DATE_CREATED";
    public static final String INPUT_EXAMINER = "EXAMINER";
    public static final String INPUT_APP_NUMBER = "APP_NUMBER";
    public static final String INPUT_APP_USER_ID = "APP_USER_ID";
    public static final String INPUT_USERNAME = "USERNAME";
    public static final Pattern QUOTE = Pattern.compile("^\\s*\"((?:[^\"]|(?:\"\"))*?)\"\\s*,");

    // CPCIssuesClassificationService
    public static final String ETI_OACS_DIR = "ETI_OACS_DIR";
    public static final String SLASH = "/";
    public static final String XML_EXTENSION = ".xml";
    public static final String PDF_EXTENSION = ".pdf";
    public static final String XLSX_EXTENSION = ".xlsx";
    public static final String DOCX_EXTENSION = ".docx";
    public static final String UNDERSCORE = "_";
    public static final String FILE_PREFIX = "CPCIssueClassification_";
    public static final String UTF_8 = "UTF-8";
    public static final String ATTACHMENT_FILENAME = "attachment; filename=\"Issue_Classification.pdf\"";
    public static final String ATTACHMENT_FILENAME_SIMPLE_PDF = "attachment; filename=\"CPC Classification for App No:  ";
    public static final String PDF_FILE_EXTENSION = ".pdf\"";

    public static final String CONTENT_DISPOSITION = "Content-Disposition";
    public static final String CONTENT_LENGTH = "Content-Length";
    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_PDF = "application/pdf";
    public static final String APPLICATION_XML = "application/xml";
    public static final String X_FRAME_OPTIONS = "X-Frame-Options";
    public static final String X_FRAME_OPTION_SAME_ORIGIN_CODE = "SAMEORIGIN";

    // CSV Export
    public static final String APPLICATION_CSV = "application/csv";
    public static final String ATTACHMENT_FILENAME_RECLASS_DATASHEET = "attachment; filename=\"reclass datasheet ";
    public static final String CSV_EXTENSION = ".csv\"";
    public static final String CSV_NUM_COLUMN = "No.";
    public static final String CSV_STATUS_COLUMN = "Status";
    public static final String CSV_DOC_ID_COLUMN = "Doc ID";
    public static final String CSV_OLD_SYMBOL_COLUMN = "Old Symbol";
    public static final String CSV_TYPE_COLUMN = "Type";
    public static final String CSV_SYMBOL_COLUMN = "Symbol";
    public static final String CSV_IPC_SYMBOL_COLUMN = "IPC Symbol";
    public static final String CSV_COMMENTS_COLUMN = "Comments";
    public static final String CSV_TC_EXPERT_COLUMN = "TC Expert";
    public static final String CSV_TC_EXPERT_NOTES_COLUMN = "TC Expert Notes";
    public static final String CSV_MODIFIED_BY_COLUMN = "Modified By";
    public static final String CSV_DATE_MODIFIED_COLUMN = "Date Modified";
    public static final String CSV_VALIDATION_ERRORS = "Validation Errors";
    public static final String CSV_SYS_VAL_PASSED = "Passed";
    public static final String CSV_SYS_VAL_PENDING = "Pending";
    public static final String CSV_SYS_VAL_FAILED = "Failed";
    public static final String CSV_USPC_COLUMN = "USPC";
    public static final String CSV_CPC_COLUMN = "CPC";
    public static final String WINDOWS_1252_CHARSET = "Windows-1252";
    public static final String DATE_FORMAT_12HR = "MMM d, yyyy hh:mm aaa";
    public static final String FORMAT_CSV = "csv";
    public static final String FORMAT_XML = "xml";

    // tc un - reviewed
    public static final String PROJECT_ID = "Project ID";
    public static final String ROUTED_ART_UNIT_COLUMN = "Routed Art Unit";
    public static final String APPLICATION_COLUMN = "Application";
    public static final String UNREVIEWED_USPC_ROUTING_COLUMN = "Unreviewed USPC Routing";
    public static final String UNREVIEWED_CPC_COLUMN = "Unreviewed CPC";

    public static final String DESCRIPTION = "Description";
    public static final String COMBINED_PROJECTS = "Combined Projects";
    public static final String TOTAL_APPLICATIONS = "Total Applications";
    public static final String UNREVIEWED_APPLICATIONS = "Unreviewed Applications";
    public static final String REVIEWED_APPLICATIONS = "Reviewed Applications";
    public static final String REVIEWED_PERCENTAGE = "Reveiewed Percentage";

    // US 1164
    public static final String ATTACHMENT_FILENAME_USPC_CPC_EXPORT = "attachment; filename=\"cpc crosswalk ";

    public static final String ISO8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final String CPC_ISSUE_FORMAT = "MM_dd_yyyy_HH_mm_ss";
    public static final String CPC_ISSUE_XML_FORMAT = "MM/dd/yyyy HH:mm:ss a z";

    public static final String YES = "yes";
    public static final String APPLICATION_NUMBER = "application-number";
    public static final String CPC = "CPC";
    public static final String SYSTEM_ACRONYM = "system-acronym";
    public static final String FILE_NAME = "file-name";
    public static final String PDF = "pdf";
    public static final String FILE_TYPE = "file-type";
    public static final String CREATE_TIME_STAMP = "create-time-stamp";
    public static final String CPC_ISSUE_CLASSIFICATION = "CPC Issue Classification";
    public static final String DOCUMENT_TITLE = "document-title";
    public static final String PAGE_COUNT = "page-count";
    public static final String IIFW = "IIFW";
    public static final String DOC_CODE = "doc-code";
    public static final String LOGIN_NAME = "login-name";
    public static final String STANDALONE = "standalone";
    public static final String VELOCITY_PROPS = "file.resource.loader.path";
    public static final String VEL_TEMPLATE_BASE = "cpc.velocity.template.base";
    public static final String OACS_XML_TEMPLATE = "OACS_XML_TEMPLATE";
    public static final String SYSTEM_DOCUMENT = "system-document";
    public static final String SYSTEM_METADATA = "system-metadata";

    public static final String ALLOCATION_CT_F = "F";
    public static final String ALLOCATION_CT_I = "I";
    public static final String ALLOCATION_CT_A = "A";

    public static final String NOTNUMBERS = "[^0-9]";
    public static final String DATE_FORMAT = "yyyy-MM-dd'T'hh:mm:ss.SSSZ";
    public static final String XML_NAMESPACE = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String FAMILY_MEMBER_JSON_NAME = "familyMember";
    public static final String SORT_ORDER_ASC = "ASC";
    public static final String SORT_ORDER_DESC = "DESC";
    public static final String SORT_ORDER_ASC_NULLS_FIRST = "ASC NULLS FIRST";
    public static final String SORT_ORDER_ASC_NULLS_LAST = "ASC NULLS LAST";
    public static final String SORT_ORDER_DESC_NULLS_LAST = "DESC NULLS LAST";
    public static final String PUB_IPO_CD = "pubIpoCd";
    public static final String SUBCLASS_TX = "symbolSubclassTx";
    public static final String ALLOCATION_CT = "allocationCt";

    public static final String RECLASS_STATUS_LOG_DETAILS_JSON_NAME = "reclassStatusLogDetails";
    public static final String RECLASS_DATASHEET_JSON_NAME = "reclassDatasheet";
    public static final String RECLASS_DS_JSON_NAME = "reclassDatasheet";
    public static final String RECLASS_ALLOCATION_VIEW_JSON_NAME = "reclassAllocationView";
    public static final String RECLASS_DATASHEET_BATCH_FILE_VIEW_JSON_NAME = "reclassDatasheetBatchFileView";
    public static final String RECLASS_WORKSPACE_QA_SAMPLE_JSON_NAME = "reclassBatchFile";
    public static final String RECLASS_RECLASS_FILE_COMMENT_JSON_NAME = "reclassFileComment";
    public static final String RECLASS_RECLASS_SYMBOL_REPLACE = "cPCReclassSymbolReplace";
    public static final String RECLASS_RECLASS_BATCH_FILE_CMNT_HIST = "ceclassBatchFileCommentHist";
    public static final String RECLASS_ALLOCATION_CMNT_HIST = "reclassAllocationCommentHist";

    public static final String RECLASS_QA_SAMPLE_FILENAME = "Sample_";
    public static final String RECLASS_BATCH_FILE_TYPE_SAMPLE = "SAMP";
    public static final String RECLASS_BATCH_FILE_TYPE_ERROR = "ELST";
    public static final String RECLASS_BATCH_STATUS_CODE_SIM = "SAM";

    // US10550 CPC USPC Symbols 07/20/2015
    public static final String MESSAGE_CODE_CPC_USPC_CONCORDANCE_SYMBOL_EDIT_FAILED = "cpc.uspc.concordance.symbol.edit";
    // OACS Changes and Messages added as Constants - 02/11/2015
    public static final String MESSAGE_CODE_CPC_THE_WHOLE_SYMBOLS_LIST_IS_MISSING = "The whole symbols list is "
            + "missing or the Non-COMBI list is missing";
    public static final String MESSAGE_CODE_CPC_NONCOMBI_GROUP_NO_AND_RANK_NO_SHOULD_BE_ZERO = "The Non-COMBI Group No "
            + "and Rank No should be ZERO.";

    // US8370 Symbol Validation Messages
    public static final String MESSAGE_CODE_CPC_RDS_VALIDATE_FAILED = "cpc.rds.symbol.validation.failed";
    public static final String MESSAGE_CODE_CPC_RDS_SYMBOL_VALIDATION_NOTALLOCATABLE = "cpc.rds.symbol.validation."
            + "notallocatable";
    public static final String MESSAGE_CODE_CPC_RDS_SYMBOL_VALIDATION_CANNOT_FIRST = "cpc.rds.symbol.validation."
            + "cannot.first";
    public static final String MESSAGE_CODE_CPC_RDS_SYMBOL_VALIDATION_CANNOT_INVENTIVE = "cpc.rds.symbol.validation."
            + "cannot.inventive";
    public static final String MESSAGE_CODE_CPC_RDS_ALLOCATION_VALIDATION_FAILED = "cpc.rds.allocation.validation.failed";
    public static final String MESSAGE_CODE_CPC_RDS_SOURCE_SYMBOL_NOT_PRESENT = "cpc.rds.allocation.source.not.present";
    public static final String MESSAGE_CODE_CPC_RDS_TARGET_SYMBOL_NOT_PRESENT = "cpc.rds.allocation.target.not.present";
    public static final String MESSAGE_CODE_CPC_RDS_WORKING_LIST_MULTIPLE_FS = "cpc.rds.working.multiple.Fs.error";
    public static final String MESSAGE_CODE_CPC_RDS_SYMBOL_ALLOCATION_CATEGORY_NULL =
            "cpc.rds.symbol.allocation.category.null";

    // Reclass Batch File Status Codes
    public static final String MESSAGE_CODE_RECLASS_STATUS_CODE_VALIDATING = "VIP";
    public static final String MESSAGE_CODE_RECLASS_STATUS_CODE_VALIDATION_ERRORS = "ERR";
    public static final String MESSAGE_CODE_RECLASS_STATUS_CODE_VALID = "VAL";
    public static final String MESSAGE_CODE_RECLASS_STATUS_CODE_REJECTED = "REJ";
    // Reclass Family Validation Status Codes
    public static final String MESSAGE_CODE_RECLASS_STATUS_CODE_FAMILY_VALIDATING = "FIP";
    public static final String MESSAGE_CODE_RECLASS_STATUS_CODE_FAMILY_VALIDATION_ERRORS = "FER";
    public static final String MESSAGE_CODE_RECLASS_STATUS_CODE_FAMILY_VALID = "FCP";
    // Reclass Load to CPC Status Codes
    public static final String MESSAGE_CODE_RECLASS_CPC_LOAD_PROGRESS = "APP";
    public static final String MESSAGE_CODE_RECLASS_PARTIAL_CPC_LOAD = "PL";
    public static final String MESSAGE_CODE_RECLASS_CPC_LOADED = "COM";
    public static final String MESSAGE_CODE_RECLASS_READY_TO_APPROVE = "PTA";
    public static final String MESSAGE_CODE_RECLASS_COMPLETE = "CMP";
    public static final String MESSAGE_CODE_RECLASS_DELETE = "DEL";
    public static final String MESSAGE_CODE_RECLASS_FILE_TYPE_ORIG = "ORIG";
    public static final String MESSAGE_CODE_RECLASS_FILE_TYPE_REWORK = "REWK";

    public static final String MESSAGE_CODE_RECLASS_FILE_TYPE_TWLA = "TWLA";
    public static final String MESSAGE_CODE_RECLASS_FILE_TYPE_TWLI = "TWLI";
    // RDS dislike
    public static final String MESSAGE_CODE_CPC_RDS_DISLIKE_FAILED = "cpc.rds.dislike.failed";
    // US8848 reclass proj info service - Project scope(string) Validation
    // Messages
    public static final String CPC_RPM_INVALID_PROJECT_SCOPE = "cpc.rpm.invalid.projectScope";
    public static final String CPC_RECLASS_PROJECT_INFO_JSON_NAME = "cpcRevisionProjectInfo";
    public static final String CPC_RPM_INVALID_PROJECT_LEAD_ID = "cpc.rpm.invalid.projectLeadId";
    public static final String REGULAR_EXPRESSION_PROJECT_SCOPE_PATTERN = "^[a-zA-Z0-9-,:;/]*$";
    public static final String MESSAGE_CODE_CPC_USER_SYMBOL_RANGE_DELETE_FAILED = "cpc.user.symbol.range.delete";
    public static final String RDS_COLUMN_LAST_MOD_USER_FULL_NM = "lastModUserFullName";
    public static final String RDS_COLUMN_TC_EXPERT_FULL_NM = "tcExpertFullName";
    public static final String RDS_COLUMN_LAST_MOD_USER_FAMILY_NM = "lastModUserFamilyName";
    public static final String RDS_COLUMN_LAST_TC_EXPERT_FAMILY_NM = "tcExpertFamilyName";

    // US9032 Constants
    public static final String MESSAGE_CODE_RDS_DOCUMENT_FAMILY_NOT_FOUND = "cpc.rds.doc.family.notfound";
    public static final String RDS_PROCESS = "RDS";
    public static final String MESSAGE_CODE_CPC_RECLASS_FILE_TYPE_SAMPLE = "cpc.rds.file.type.sample";
    public static final String MESSAGE_CODE_CPC_RDS_ALLOCATION_INGESTED = "cpc.rds.allocation.ingested";
    public static final String MESSAGE_CODE_CPC_RDS_EDIT_FAILED = "cpc.rds.edit.failed";
    public static final String SUBCLASS_REGEX_PATTERN = "^[a-zA-Z0-9]*$";
    public static final String SUBGROUP_REGEX_PATTERN = "^[a-zA-Z0-9/]*$";
    public static final String REGULAR_EXPRESSION_FOR_YN_FLAG_STRING_PATTERN = "^[YN]{1}$";

    // US 9520
    public static final String RECLASS_ALLOC_CMNT_DTLS_JSON_NAME = "reclassAllocationCommentDetails";
    public static final String CPC_RDS_ALLOCATION_COMMENTS_FAILED = "cpc.rds.allocation.comments.falied";
    public static final String CPC_RDS_FINDANDREPLACE_NOUPDATES = "cpc.rds.findAndReplace.noUpdates";

    // US 10236
    public static final String CPC_RECLASS_PROJECT_JSON_NAME = "cpcRevisionProject";
    public static final String CPC_RECLASS_PROJECT_SCOPE_JSON_NAME = "cpcRevisionProjectScope";
    public static final String MESSAGE_CODE_CPC_REVISION_PROJECT_EXISTS = "cpc.revisionproject.already.exists";
    public static final String CPC_RECLASS_PROJECT_DEFAULT_SORT_FIELD = "revisionProjectId";
    public static final String CPC_RELCASS_INTEL_STATUS_CD_SORT_FIELD = "reclassIntellectualStatusCd";
    public static final String CPC_RECLASS_ADMIN_LAST_MOD_CT_SORT_FIELD = "lastModReclassAdminCt";
    public static final String CPC_RECLASS_PROJECT_DEFAULT_STATUS_FIELD = "active";
    public static final String CPC_RECLASS_PROJECT_APPROVAL_STATUS_FIELD = "PTA";
    public static final String MESSAGE_CODE_CPC_REVISION_PROJECT_SOURCE_AND_TRAGET_EXISTS =
            "cpc.revisionproject.source.and.target.already.exists";

    public static final String CPC_FAMILY_DESIGFAMILY_ID_NOT_EXISTS = "cpc.family.designatedFamily.notexists";
    public static final String CPC_REQUIRED_FIELD_IS_MISSING = "cpc.validation.notNull";
    public static final String CPC_APPLICATION_NUMBER_STRING = "'Application Nubmer'";
    public static final String CPC_DESIGNATED_FAMILY_ID_STRING = "'Designated Family Id'";
    public static final String CPC_DOCUMENT_NUMBER_STRING = "'Document Number'";
    public static final String CPC_USER_ID_STRING = "'User ID'";
    public static final String CPC_CAT_PROCESS = "CAT";

    public static final String RECLASS_INTEL_STATUS_COMPLETED = "Completed";
    public static final String RECLASS_INTEL_STATUS_ACTIVE = "Active";
    public static final String RECLASS_INTEL_STATUS_APPROVAL = "Approval";

    public static final String CPC_PROJECT_STATUS_COMPLETED_CODE = "'COM'";
    public static final String CPC_PROJECT_STATUS_DEFAULT_CODE = "ACTIVE";
    public static final String CPC_PROJECT_STATUS_INITIATED_CODE = "INI";
    public static final String CPC_PROJECT_STATUS_IN_PROGRESS_CODE = "IP";
    public static final String CPC_PROJECT_STATUS_USER_SEARCH_COMP_STATUS = "Completed";
    public static final String CPC_PROJECT_STATUS_USER_SEARCH_COMP = "COM";
    public static final String MESSAGE_CODE_CPC_BATCH_FILE_COMMENT_ADD_FAILED = "cpc.batchFile.comment.add.failed";

    public static final String CPC_RDS_ALLOCATION_NOT_READY_FOR_APPROVE = "cpc.rds.allocation.not.ready.for.approve";
    public static final String CPC_DOCUMENT_HAS_APPLICATION_ASSIGNED = "cpc.document.application.already.exists";
    public static final String CPC_PATENT_DOCUMENT_NOT_FOUND = "cpc.patentdocument.notFound";
    public static final String TEXT_SEARCH_REGEX_PATTERN = "[^A-Za-z0-9]";
    public static final String RECLASS_STATUS = "reclassAllocationStatus";
    public static final String RECLASS_BATCH_FILE_RECORD_ID = "batchFileRecordId";

    public static final String RECLASS_BATCH_STATUS_CD_PTA = "PTA";
    public static final String RECLASS_BATCH_STATUS_CD_PL = "PL";
    public static final String RECLASS_BATCH_STATUS_CD_PEN = "PEN";
    public static final String RECLASS_BATCH_STATUS_CD_COM = "COM";
    public static final String RECLASS_BATCH_STATUS_CD_APP = "APP";
    public static final String RECLASS_BATCH_STATUS_CD_REJ = "REJ";
    public static final String RECLASS_BATCH_STATUS_CD_FIP = "FIP";
    public static final String RECLASS_BATCH_STATUS_CD_FER = "FER";
    public static final String RECLASS_BATCH_STATUS_CD_FCP = "FCP";
    public static final String RECLASS_BATCH_STATUS_CD_VIP = "VIP";
    public static final String RECLASS_BATCH_STATUS_CD_ERR = "ERR";
    public static final String RECLASS_BATCH_STATUS_CD_VAL = "VAL";

    public static final String RECLASS_RDS_STATUS_FILE_VALIDATION_PASSED = "File Validation Passed";
    public static final String RECLASS_RDS_STATUS_FAMILY_VALIDATION_PASSED = "Family Validation Passed";
    public static final String RECLASS_RDS_STATUS_FILE_VALIDATION_FAILED = "File Validation Failed";
    public static final String RECLASS_RDS_STATUS_FAMILY_VALIDATION_FAILED = "Family Validation Failed";
    public static final String RECLASS_RDS_STATUS_LOADED_IN_CPC_DB = "Loaded in DB";
    public static final String RECLASS_RDS_STATUS_PENDING = "Pending";

    public static final String MESSAGE_CODE_CPC_RDS_BATCH_FILE_ID_MISSING = "cpc.rds.workspace.batch.file.id.missing";
    public static final String MESSAGE_CODE_CPC_RDS_BATCH_USERID_MISSING = "cpc.rds.workspace.batch.userid.missing";

    public static final String CPC_PATENT_FAMILY_ALLOC_NULL = "cpc.patentfamilyalloc.null";
    public static final String MCC_ADD_ALLOC_SYMBOL_NOTFOUND = "mcc.addAlllocation.symbol.nofound";
    public static final String MCC_ADD_ALLOC_SYMBOL_INVALID = "mcc.addAlllocation.symbol.invalid";
    public static final String MCC_ADD_ALLOC_SYMBOL_EXISTS = "mcc.addAlllocation.already.exists";
    public static final String CPC_OACS_ADD_ALLOC_NO_ALLOCS = "cpc.oacs.add-allocation.no.allocations";
    public static final String CPC_OACS_ADD_ALLOC_APPLI_NO = "cpc.oacs.add-allocation.applicationNo";
    public static final String CPC_PATENT_APPLI_NOTFOUND = "cpc.patent.application.notFound";
    public static final String CPC_OACS_ADD_ALLOC_EMP_NO_NOTFOUND = "cpc.oacs.add-allocation.employeeNo.notFound";
    public static final String CPC_FAMILY_NOTFOUND = "cpc.family.notFound";
    public static final String CPC_PATENT_FAMILY_ALLOC_NOTFOUND = "cpc.patentfamilyalloc.notFound";
    public static final String MCC_AGREE_ALLOC_UNPUBLISHED = "mcc.agreeAllocation.unpublished";
    public static final String MCC_DISAGREE_ALLOC_UNPUBLISHED = "mcc.disagree.unpublished";
    public static final String MCC_CREATE_RHF_UNPUBLISHED = "mcc.create.rhf.unpublished";
    public static final String MCC_CANNOT_CREATE_UNDO_RHF_UNPUBLISHED = "mcc.cannot.undo.rhf.unpublished";
    public static final String DISAGREED_EPO_RAISE_HAND = "Disagreed to EPO Raise Hand successfully";
    public static final String MCC_ALLOC_CANNOT_DISAGREE = "mcc.allocation.cannot.disagree";
    public static final String MCC_COMBI_NOTEXISTS = "mcc.combi.notexists";
    public static final String RAISE_HAND_ALLOCATION_CREATED =
            "Raise Hand for the requested allocation created successfully";
    public static final String MCC_CANNOT_CREATE_RHF = "mcc.cannot.create.rhf";
    public static final String RAISE_HAND_ALLOCATION_WITHDRWAN = "Raise Hand for the requested allocation "
            + "withdrawn successfully";
    public static final String MCC_CANNOT_UNDO_RHF = "mcc.cannot.undo.rhf";
    public static final String MCC_DELETE_ALLOC_NOTABLETO_PROMOTE = "mcc.deleteAllocation.notableto.promote";
    public static final String ALLOC_DEL_SUCCESS = "Allocation deleted successfully.";
    public static final String AGREED_WITH_EPO_ALLOC_DEL_SUCCESS = "Agreed with EPO. Allocation deleted successfully";
    public static final String ALLOC_UPDATE_SUCCESS = "Allocation updated successfully.";
    public static final String CPC_CLASSIFICATION_SYMBOL_NONEXISTS = "cpc.classificationsymbol.notexists";
    public static final String MCC_COMBI_SYMBOL_INVALID = "mcc.combi.symbol.validation.invalid";
    public static final String MCC_COMBI_SYMBOL_VALIDATION = "mcc.combi.symbol.validation";
    public static final String SEMI_COLON = ";";
    public static final String PERIOD = ".";

    // CPCClassificatioinPicturesService
    public static final String MCC_UPDATE_SYMBOL_CANNOT_FIRST = "mcc.update.allocation.symbol.cannot.first";
    public static final String CPC_SYMBOL_VALIDATE_NOTALLOCATABLE = "cpc.symbol.validation.notallocatable";
    public static final String MCC_UPDATE_ALLOCATION_NO_PERFORMED = "mcc.update.allocation.no.performed";
    public static final String MCC_UPDATE_ALLOCATION_SYMBOL_CANNOT_INVENTIVE = "mcc.update.allocation."
            + "symbol.cannot.inventive";
    public static final String MCC_UPDATE_ALLOCATION_PROMOTE_SYMBOL_CANNOT_FIRST = "mcc.update.allocation.promote."
            + "symbol.cannot.first";
    public static final String MCC_UPDATE_ALLOCATION_NOTABLE_PROMOTE = "mcc.update.allocation.notableto.promote";
    public static final String CPC_SYMBOL_VALIDATE_NONCOMBI_FIRST_ISINVENTIVE = "cpc.symbol.validation."
            + "noncombi.first.isInventive";

    public static final String PROPS_FILE_LOCA = "PROP_FILE_DIR";
    public static final String LOG4JXML_FILE_NM = "log4j.xml";
    public static final String JBOSS_DEPLOYDIR_PROP = "com.testing.cpc.jboss.deploydir";
    public static final String JBOSS_HOME_DIR = "jboss.server.home.dir";
    public static final String JBOSS_LOG_DIR = "jboss.server.log.dir";

    // US14618, 14617, 14619 User Symbol Collection Messages
    public static final String MESSAGE_CODE_CPC_USER_SYMBOL_COLLECTION_COMBI_SAVE_FAILED = "cpc.user.symbol.collection."
            + "combi.save.failed";
    public static final String MESSAGE_CODE_CPC_USER_SYMBOL_COLLECTION_NONCOMBI_SAVE_FAILED = "cpc.user.symbol.collection."
            + "noncombi.save.failed";
    public static final String MESSAGE_CODE_CPC_USER_SYMBOL_COLLECTION_COMBI_INVALID_SYMBOL = "cpc.user.symbol.collection."
            + "combi.invalid.symbol";
    public static final String MESSAGE_CODE_CPC_USER_SYMBOL_COLLECTION_COMBI_SET_EXISTS = "cpc.user.symbol.collection."
            + "combi.set.exists";
    public static final String MESSAGE_CODE_CPC_USER_SYMBOL_COLLECTION_NONCOMBI_EXISTS = "cpc.user.symbol.collection."
            + "noncombi.exists";
    public static final String MESSAGE_SYSMBOLS_LIST_MISSING = "The whole symbols list is missing "
            + "or the Non-COMBI list is missing";
    public static final String MESSAGE_NONCOMBI_GROUP_AND_RANK_TO_ZERO =
            "The Non-COMBI Group No and Rank No should be ZERO.";

    public static final String CHAR_Z = "Z";
    public static final String CLASS_CODE_01 = "01";
    public static final String MAIN_GROUP_0000 = "0000";
    public static final String SUB_GROUP_000000 = "000000";
    public static final String ALLOC_ALREADY_IN_FAMILY = "This allocation already exists in this family.";
    public static final String MESSAGE_NONCOMBI_ALLOC_INVALID = "This Non-COMBI allocation INVALID, As Non-COMBI "
            + "set can have only one FIRST position attribute.";
    public static final String STR_FIRST = "FIRST";
    public static final String STR_LATER = "LATER";

    public static final String APP_CATEGORY_LIST = "LIST";
    public static final String APP_CATEGORY_PERCENTAGE = "PERCENTAGE";
    public static final String APP_CATEGORY_NUMBER = "NUMBER";
    public static final String APP_CATEGORY_MANUAL = "MANUAL";
    public static final String APP_CATEGORY_SYMBOL = "SYMBOL";
    public static final String EXAMINATION_STRING = "EXAMINATION";

    public static final String QA_PROJECT_ACTIVE = "Active";
    public static final String QA_PROJECT_COM = "Com";
    public static final String QA_PROJECT_ALL = "All";
    public static final long QA_PROJECTID_100K = 100000;

    public static final String AGREE_STR = "AGREE";
    public static final String DISAGREE_STR = "DISAGREE";
    public static final String NA_STR = "N/A";

    public static final String QUALITY_ASSURANCE_APP_VIEW_JSON_NAME = "qualityAssuranceApplicationView";

    public static final String MESSAGE_CODE_CPC_QATOOLKIT_PROJECT_CREATE_MESSAGE = "cpc.qatoolkit.project.create.message";
    public static final String MESSAGE_CODE_CPC_QATOOLKIT_PROJECT_UPDATE_MESSAGE = "cpc.qatoolkit.project.update.message";

    public static final String QAVIEW_OBJ_APPID = "applicationId";
    public static final String QAVIEW_OBJ_QNARTUNIT = "qnAssignmentArtUnitCode";

    public static final String PALM_USPC_CODE = "PALM_USPC";
    public static final String PALM_GAU_CODE = "PALM_ART_UNIT";
    public static final String PALM_WSDL = "/ManageBibliographicDataServices/ManageBibData?wsdl";
    public static final String PALM_WORKER_WSDL = "/WorkerServices/services/WorkerService?wsdl";

    public static final String PALM_USPC_REST_OBJECT = "/OPSGPCDMServices/application-classifications/us?";
    public static final String PALM_USPC_REFERENCETYPE_PE_CODE = "PE";
    public static final String PALM_USPC_REFERENCETYPE_PG_CODE = "PG";
    public static final String PALM_USPC_RESPONSE_RESULTS_TAG = "results";
    public static final String PALM_USPC_RESPONSE_REFERENCE_TYPE_TAG = "referenceType";
    public static final String PALM_USPC_RESPONSE_VALID_IN_TAG = "validIndicator";
    public static final String PALM_USPC_RESPONSE_PRIMARY_IN_TAG = "primaryIndicator";
    public static final String PALM_USPC_NATIONAL_CLASS_TAG = "nationalClass";
    public static final String PALM_USPC_NATIONAL_SUBCLASS_TAG = "nationalSubclass";
    public static final String PALM_ROUTING_SEARCH_STRING = "\"primaryIndicator\":\"Y\",\"referenceType\":\"PG\"";

    public static final String TITLE_TAG_START = "<title>";
    public static final String TITLE_TAG_CLOSE = "</title>";
    public static final String CLASS_REF_TAG_START = " <class-ref scheme=\"cpc\">";
    public static final String CLASS_REF_TAG_CLOSE = "</class-ref>";
    public static final String CLASS_REF_NOT_MAPPED_TAG_START = "<class-ref scheme=\"not-mapped\">";

    public static final String PATTERN_REGEX_1 = "\\s";
    public static final String PATTERN_REGEX_2 = "\\S*";

    public static final String QA_DECISION_CATEGORY_AGREE = "AGREE";
    public static final String QA_DECISION_CATEGORY_DISAGREE = "DISAGREE";
    public static final String QA_DECISION_CATEGORY_NA = "N/A";
    public static final String QA_DECISION_CATEGORY_EXCUSE = "EXCUSE";

    public static final String MESSAGE_CODE_CPC_STND_QA_PHASE_CODE_NOT_FOUND = "cpc.stndqa.phase.notFound";

    public static final String PHASE_QN = "QN";
    public static final String PHASE_CQIC = "CQIC";
    public static final String PHASE_CONTR = "CONTR";
    public static final String PHASE_CQICR = "CQICR";
    public static final String PHASE_COMPLETED = "Completed";

    public static final String PHASE_PENDING_COMPLETE_UI_MSG = "Pending Completion";

    public static final String PHASE_QN_NAME = "QN";
    public static final String PHASE_CQICF_NAME = "CQICF";
    public static final String PHASE_CONTR_REBUTTAL_NAME = "CONTR";
    public static final String PHASE_CQICR_NAME = "CQICR";

    public static final String DISPLAY_DECISSION_CONTRACTOR_REBUTTAL = "Contractor Rebuttal";
    public static final String DISPLAY_DECISSION_CQIC_FINAL = "CQICF";
    public static final String DISPLAY_DECISSION_CQIC_REBUTTAL = "CQICR";
    public static final String DISPLAY_DECISSION_CQIC_CONTRACTOR_REBUTTAL = "Contractor Rebuttal";
    public static final String DISPLAY_DECISSION_CQIC = "CQIC";
    public static final String DISPLAY_DECISSION_QN = "QN";

    // CR,QN,CQI,CQF,CQR
    public static final String DECISSION_CONTRACTOR_REBUTTAL = "CR";
    public static final String DECISSION_CQIC_FINAL = "CQF";
    public static final String DECISSION_CQIC_REBUTTAL = "CQR";
    public static final String DECISSION_CQIC = "CQI";
    public static final String DECISSION_QN = "QN";

    public static final String PWS_XML_DECISSION_CONTRACTOR_REBUTTAL = "CONTRACTOR";
    public static final String PWS_XML_DECISSION_CQIC_FINAL = "USPTO-F";
    public static final String PWS_XML_DECISSION_CQIC_REBUTTAL = "USPTO-R";

    public static final String PWS_XML_DECISSION_QN_AGREE = "Agree";
    public static final String PWS_XML_DECISSION_QN_DISAGREE = "Disagree";
    public static final String PWS_XML_DECISSION_QN_N_A = "N/A";

    public static final String PWS_XML_DECISSION_CQIC_ALLOW = "Allow";
    public static final String PWS_XML_DECISSION_CQIC_DENY = "Deny";
    public static final String PWS_XML_DECISSION_CQIC_N_A = "N/A";

    public static final String EXCUSE_ERROR_CHECKED = "true";
    public static final String EXCUSE_ERROR_NOT_CHECKED = "false";
    public static final String CLASSIFICATION_DECISION_NOT_REVIEWED = "Not Reviewed";
    public static final String ROUITNG_DECISION_NOT_REVIEWED = "Not Reviewed";
    public static final String PWS_XML_OMITTED = "omitted";
    public static final String PWS_XML_INCLUDED = "included";

    public static final String QA_PROJECT_CATEGORY_CONTRACTOR = "CONTRACTOR";
    public static final String QA_PROJECT_CATEGORY_EXAMINATION = "EXAMINATION";

    // US18016 File, Symbol Validation Messages
    public static final String MESSAGE_CODE_CPC_RDS_IPO_CODE_VALIDATE_FAILED = "cpc.rds.ipocode.validation.failed";
    public static final String MESSAGE_CODE_CPC_RDS_SEQ_NUM_VALIDATE_FAILED = "cpc.rds.sequenceNumber.validation.failed";
    public static final String MESSAGE_CODE_CPC_RDS_KIND_CODE_VALIDATE_FAILED = "cpc.rds.kindcode.validation.failed";
    public static final String MESSAGE_CODE_CPC_RDS_FULL_SYMBOL_TEXT_NEW_IS_EMPTY = "cpc.rds.fullsymbol.new.not.exists";

    public static final String CPC_MAIL_SERVER_HOST = "mail.smtp.host";
    public static final String HTML_NEWLINE = "<br/>";
    public static final String DAY_MONTH_DD_YYYY_FORMAT = "E, MMM d, yyyy";
    public static final String CPC_PRODUCTION_SUPPORT_EMAIL = "cpcproductionsupport@uspto.gov";

    public static final String MESSAGE_CODE_CPC_QA_ALLOCATION_NON_COMBI_DUPLICATE_SYMBOL =
            "cpc.qa.allocation.noncombi.exists";
    public static final String MESSAGE_CODE_CPC_QA_ALLOCATION_NON_COMBI_INVALID_SYMBOL =
            "cpc.qa.allocation.noncombi.symbol.invalid";

    public static final String CPC_USER_NOTE_TYPE_UNOTE = "UNOTE";
    public static final String CPC_USER_NOTE_TYPE_NPL = "NPL";

    public static final String CPC_DUMMY_SYMBOL = "CONTRACTOR_USPC_CONCORDANCE";
    public static final String CPC_DUMMY_SYMBOL_SCHEME_DATE = "2013-01-01T00:00:00.000-0500";

    public static final String MESSAGE_CODE_APPLICATION_PUBLISHED = "cpc.application.published";

    public static final String MESSAGE_CODE_CPC_SYMBOL_VALIDATION_DUPLICATE_NONCOMBI =
            "cpc.symbol.validation.set.duplicate.noncombi";
    public static final String CPC_USER_RECLASS_EXPERT = "RECLASS EXPERT";
    public static final String RECLASS_PROCESS = "RECLASS";
    public static final String CPC_USER_US_CONTRACTOR_6 = "US Contractor 6";

    public static final String SORT_KEY_ART_UNIT = "artUnit";
    public static final String SORT_KEY_USER_FAMILY_NAME = "userFamilyName";
    public static final String SORT_KEY_CPC_SYMBOL = "fullSymbolTx";
    public static final String SORT_KEY_DATE_MODIFIED = "lastModTs";
    public static final String SORT_KEY_TOPIC = "collectionTopicTx";

    public static final String DOC_APPEND_INDICATOR_FOREIGN = "foreign";
    public static final String DOC_APPEND_INDICATOR_BOTH = "both";
    public static final String DOC_APPEND_INDICATOR_US = "us";
    public static final String MESSAGE_CODE_CPC_EXPERT_CP_EXISTS = "cpc.expert.cp.exists";

    public static final String CSV_QA_CONTRACTOR_EXPORT_PROJECT_ID = "Project ID";
    public static final String CSV_QA_CONTRACTOR_EXPORT_APPLCIATION_NO = "Application No.";
    public static final String CSV_QA_CONTRACTOR_EXPORT_SYMBOL = "Symbol";
    public static final String CSV_QA_CONTRACTOR_EXPORT_CONTRACTOR_JUSTIFICATION = "Cont. Justification";
    public static final String CSV_QA_CONTRACTOR_EXPORT_QN_DECISION = "QN Decision";
    public static final String CSV_QA_CONTRACTOR_EXPORT_CONTRACTOR_REBUTTAL_COMMENT = "Cont. Rebuttal Comment";
    public static final String ATTACHMENT_FILENAME_PWS_CONTRACTOR_EXPORT = "attachment; filename=\"PWS Contractor Export";
    public static final String MESSAGE_CODE_CPC_QA_PWS_CONTRACT_FILE_CONTENT_MISSING =
            "cpc.qa.pws.contractor.file.content.missing";
    public static final String MESSAGE_CODE_CPC_QA_PWS_CONTRACT_FILE_PROJECT_INVALID =
            "cpc.qa.pws.contractor.file.invalid.project";
    public static final String MESSAGE_CODE_CPC_QA_PWS_CONTRACT_FILE_PROJECT_TYPE_INVALID =
            "cpc.qa.pws.contractor.file.invalid.project.type";
    public static final String CSV_QA_CONTRACTOR_EXPORT_INSTRUCTIONS = "Instructions: Enter your comments in the Contractor"
            + " Rebuttal Comment (column G) ONLY. Then save and email copy of spreadsheet to CQIC QA Team.";
    public static final String MESSAGE_CODE_CPC_QA_PWS_CONTRACT_FILE_INVALID_USER =
            "cpc.qa.pws.contractor.file.invalid.user";
    public static final String MESSAGE_CODE_CPC_QA_PWS_CONTRACT_FILE_ERRORS = "cpc.qa.pws.contractor.file.errors";
    public static final String MESSAGE_CODE_CPC_QA_PWS_CONTRACT_FILE_NO_UPDATE = "cpc.qa.pws.contractor.file.no.update";
    public static final int COMMENT_LIMIT_500 = 500;
    public static final String QA_PROJECT_ERROR_TX_STARTS_WITH = "Application(s) not found in the batch - ";

    public static final String MESSAGE_CODE_QAP_CREATE_INVALID_APPLICATION_EXISTS =
            "cpc.qap.invalid.applications.exists.create";
    public static final String MESSAGE_CODE_QAP_UPDATE_INVALID_APPLICATION_EXISTS =
            "cpc.qap.invalid.applications.exists.update";
    public static final int QAP_INVALID_APP_ERROR_LENGTH = 3999;

    public static final String APPUSER_OBJ_APPUSERID = "applicationUserId";
    public static final String APPUSER_OBJ_GIVENNAME = "givenName";
    public static final String APPUSER_OBJ_MIDDLENAME = "middleName";
    public static final String APPUSER_OBJ_FAMILYNAME = "familyName";
    public static final String APPUSER_OBJ_EMAILADDRESS = "emailAddressTx";
    public static final String APPUSER_OBJ_USERROLEID = "userRoleId";
    public static final String APPUSER_OBJ_ROLEID = "roleId";
    public static final String APPUSER_OBJ_ROLENAME = "roleName";
    public static final String APPUSER_OBJ_LASTMODTS = "lastModTs";
    public static final String APPUSER_OBJ_LASTMODUSERID = "lastModUserId";
    public static final String APPUSER_OBJ_LASTMODUSERGIVENNM = "lastModUserGivenName";
    public static final String APPUSER_OBJ_LASTMODUSERMIDDLENM = "lastModUserMiddleName";
    public static final String APPUSER_OBJ_LASTMODUSERFAMILYNM = "lastModUserFamilyName";
    public static final String APPUSER_OBJ_LASTMODUSEREMAILADD = "lastModUserEmailAddressTx";

    public static final String APPUSER_DB_APPUSERID = "APPLICATION_USER_ID UPPER(ROLE_NM) UPPER(ROLE_NM) ORG_CD";
    public static final String APPUSER_DB_NAME = "UPPER(FAMILY_NM) UPPER(GIVEN_NM) UPPER(MIDDLE_NM) UPPER(ROLE_NM)"
            + " UPPER(ROLE_NM) ORG_CD";
    public static final String APPUSER_DB_EMAILADDRESS = "UPPER(EMAIL_ADDRESS_TX) UPPER(ROLE_NM) UPPER(ROLE_NM) ORG_CD";
    public static final String APPUSER_DB_USERROLEID = "ROLE_ID UPPER(FAMILY_NM) UPPER(GIVEN_NM) UPPER(MIDDLE_NM) ORG_CD";
    public static final String APPUSER_DB_ROLEID = "USER_ROLE_ID";
    public static final String APPUSER_DB_ROLENAME = "ROLE_NM ORG_CD UPPER(FAMILY_NM) UPPER(GIVEN_NM) UPPER(MIDDLE_NM)";
    public static final String APPUSER_DB_LASTMODTS = "LAST_MOD_TS " + APPUSER_DB_NAME;
    public static final String APPUSER_DB_LASTMODUSERNM = "UPPER(LAST_MOD_USER_ID) " + APPUSER_DB_NAME;
    public static final String APPUSER_DB_LASTMODUSEREMAILADDRESS = "UPPER(LAST_MOD_USER_EMAIL_ADDRESS_TX) "
            + APPUSER_DB_NAME;

    public static final String MESSAGE_CODE_CPC_USER_STRING_COLLECTION_FAILED = "cpc.user.string.collection."
            + "save.failed";
    public static final String MESSAGE_CODE_CPC_USER_STRING_COLLECTION_FAILED_DUP = "cpc.user.string.collection."
            + "save.failed.duplicate";

    public static final int LOOP_COUNT_2000 = 2000;
    public static final String ATTACHMENT_FILENAME_CPC_ADMIN = "attachment; filename=\"CAT admin ";
    // Admin Export
    public static final String CSV_NAME_COLUMN = "Name";
    public static final String CSV_EMAIL_COLUMN = "Email";
    public static final String CSV_ROLE_COLUMN = "Role";
    public static final String CSV_TC_COLUMN = "TC";
    public static final String CSV_ART_UNIT_COLUMN = "Art Unit";

    public static final String ROLE_NAME_SNTD_STR = "getRoleNm";

    public static final String MCC_NON_COMBI_SYMBOL_VALIDATION = "mcc.non.combi.symbol.validation";

    public static final String USER_STRING_SYMBOL_ENDS_WITH_CPC = ".CPC.";
    public static final String USER_STRING_SYMBOL_ENDS_WITH_CPCC = ".CPCC.";
    public static final String USER_STRING_SYMBOL_JOIN = "AND|OR|SAME";

    public static final String MESSAGE_CODE_CPC_SYMBOL_VALIDATION_MORETHAN_ONE_FIRST_FOUND =
            "cpc.symbol.validation.noncombi.morethan.one.first.exists";

    public static final String MESSAGE_CODE_CPC_SYMBOL_VALIDATION_NO_FIRST_FOUND =
            "cpc.symbol.validation.noncombi.no.first.exists";

    public static final String MESSAGE_CODE_CPC_SYMBOL_VALIDATION_SYBMOL_ALREADY_PRESENT =
            "cpc.symbol.validation.noncombi.already.exists";

    public static final String MESSAGE_CODE_CPC_RDS_MORETHAN_ONE_FIRST_FOUND =
            "cpc.rds.family.validation.morethan.one.first.exists";

    public static final String STATUS_PARTIAL_DB_LOAD = "Partial DB Load";
    public static final String STATUS_LOADED_IN_DB = "Loaded in DB";
    public static final String STATUS_LOAD_IN_PROGRESS = "DB Load in Progress";

    public static final String CPC_SYMBOL_VALIDATE_NONCOMBI_ONE_FIRST = "cpc.symbol.validation.noncombi.one.first";

    public static final String RCL_STATUS_PENDING = "PENDING";
    public static final String RCL_STATUS_CONFIRMED = "CONFIRMED";
    public static final String RCL_STATUS_COMPLETE = "COMPLETE";
    public static final String RCL_STATUS_COMPLETE_WITH_ERRORS = "ERROR";
    public static final String RCL_STATUS_FAIL = "FAIL";
    public static final String RCL_STATUS_PUBLISHED = "published";

    public static final String RCL_STATUS_PENDING_UI_STATUS = "Pending Validation";
    public static final String RCL_STATUS_CONFIRMED_UI_STATUS = "Pending Load";
    public static final String RCL_STATUS_COMPLETE_UI_STATUS = "Complete";
    public static final String RCL_STATUS_COMPLETE_WITH_ERRORS_UI_STATUS = "Completed With Errors";
    public static final String RCL_STATUS_FAIL_UI_STATUS = "Fail";

    public static final String CPC_RCL_TYPE_CODE_NOT_VALID = "cpc.rcl.type.code.not.valid";
    public static final String CPC_SYMBOL_VALIDATE_NOT_FOUND_IN_CPC = "cpc.classificationsymbol.notFound.in.cpc";
    public static final String CPC_RCL_SYMBOL_NOTFOUND_IN_SCHEME_SYMBOL = "cpc.rcl.symbol.notFound.in.scheme.symbol";
    public static final String CPC_RCL_TO_SYMBOL_INVALID_TYPE = "cpc.rcl.to.symbo.invalid.type";

    public static final String CPC_RCL_FILE_ID_MISSING = "cpc.rcl.fileid.missing";
    public static final String CPC_RCL_SCHEME_VERSION_DATE_IS_MISSING = "cpc.rcl.scheme.version.date.missing";
    public static final String CPC_RCL_LASTMOD_USER_IS_MISSING = "cpc.rcl.last.mod.userid.missing";

    public static final String RCL_FILE_STATUS_IS_COMPLETED = "rcl.file.status.completed";
    public static final String RCL_FILENAME_VERSION_DATE_UNIQUE = "rcl.filename.version.date.unique";

    public static final String SPEQN_USER_ROLE = "SPEQN";
    public static final String QN_USER_ROLE = "QN";

    public static final String XLSX_EXTENSION_NAME = "xlsx";
    public static final String XML_EXTENSION_NAME = "xml";
    public static final String CONSTANT_NNN = "NNN";

    public static final String RCL_STAGING_TOTAL_SIZE = "rcl_staging_total_size";
    public static final String RCL_STAGING_LIST = "rcl_staging_list";
    public static final String CPC_RCL_TYPE_CODE_D = "D";
    public static final String CPC_RCL_SYMBOL_IS_EMPTY = "cpc.rcl.symbol.is.empty";
    public static final String CPC_RCL_FINDANDREPLACE_NOUPDATES = "cpc.rcl.findAndReplace.noUpdates";

    public static final String CPC_ERROR_TEXT_NOT_ALLOCATABLE = "is not allocatable.";

    public static final String QA_ALLOCATION_DECISION_SCOPE_SYMBOL = "SYMBOL";
    public static final String QA_ALLOCATION_DECISION_SCOPE_POSITION = "POSITION";
    public static final String QA_ALLOCATION_DECISION_SCOPE_SYMBOL_POSITION = "BOTH";

    public static final String QA_LOOKUP_SEARCH_ROTU_CLASS_AU = "BOTHAU";
    public static final String QA_LOOKUP_SEARCH_ROUT_AU = "ROUTAU";
    public static final String QA_LOOKUP_SEARCH_CLASS_AU = "CLASSAU";

    public static final String COMPLETE = "Complete";
    public static final String INCOMPLETE = "Incomplete";
    public static final String ALL = "All";

    public static final String SORT_KEY_STRING_DEFAULT =
            " QN_APP_ROUT_CLASS_TYPE_SORT DESC, APPLICATION_ID DESC, PROJECT_ID DESC, EVALUATION_TYPE_SORT DESC, "
                    + " ALLOCATION_TYPE_SORT DESC, SYMBOL_USPC_CPC ASC ";
    public static final String DEFAULT_SORT =
            " APPLICATION_ID DESC, PROJECT_ID DESC, EVALUATION_TYPE_SORT DESC, ALLOCATION_TYPE_SORT DESC, SYMBOL_USPC_CPC ASC ";

    public static final String QA_PWS_FILTER_OPERATOR_EQUAL = "equal";
    public static final String QA_PWS_FILTER_OPERATOR_STARTS_WITH = "startWith";
    public static final String QA_PWS_FILTER_OPERATOR_EMPTY = "isEmpty";

    public static final String PROJECT_SCOPE_CATEGORY_MODIFIED = "MODIFIED";
    public static final String PROJECT_SCOPE_CATEGORY_DELETED = "DELETED";
    public static final String PROJECT_SCOPE_CATEGORY_ADDED = "ADDED";

    public static final String PROJECT_SCOPE_CATEGORY_M = "M";
    public static final String PROJECT_SCOPE_CATEGORY_D = "D";
    public static final String PROJECT_SCOPE_CATEGORY_A = "A";
    public static final String PWS_REPORT = "PWS";
    public static final String MWS_REPORT = "MWS";

    public static final String EVALUATION_ROUTING = "Routing";
    public static final String EVALUATION_CLASSIFICATION = "Classification";
    public static final String STRING_D = "D";
    public static final String STRING_R = "R";

    public static final String CPC_REVSION_PROJECT_NOT_FOUND_IN_CPC = "cpc.revisionproject.not.found";
    public static final String CPC_RDS_ALLOCATION_NOT_READY_FOR_DELETE = "cpc.rds.allocation.not.ready.for.delete";
    public static final String MESSAGE_CODE_PROJECT_SCOPE_EXCEL_CONTENT_EMPTY =
            "cpc.revisionproject.scope.excel.content.empty";

    public static final String TECHNICAL = "TECHNICAL";
    public static final String INTELLECTUAL = "INTELLECTUAL";

    public static final String ERROR_REPORT = "error";
    public static final String TC_UNREVIEWED_REPORT = "unreviewed";
    public static final String CQIC_QA_REPORT = "cqic";

    public static final String BATCH_STATUS_COMPLETED = "COMPLETED";
    public static final String BATCH_STATUS_ERROR = "ERROR";

    public static final String DOUBLE_ZERO = "00";
    public static final String ZERO_DOT_DOUBLE_ZERO_FORMAT = "0.00";
    public static final String X_INDICATOR = "x";
    public static final String ATTACHMENT_FILENAME_FOR_CSV = "attachment; filename=\"";
    public static final String OLD_SYMBOLS_DELETION_COMPLETED = "Old Symbol(s) Deletion Completed";
    public static final String HYPHENS = "--";

    public static final String NON_USPTO_CLASSIFIER_CONTRACTOR = "US Contractor";

    public static final String BATCH_LOG_ID = "batchLogId";
    public static final String QA_PROJECT_ID = "projectId";

    public static final String REGEX_NON_DIGIT = "\\D+";
    public static final String QA_PROJECT_PENDING_COMPLETION = "PEND";

    public static final String SYMBOL_TYPE_F = "F";
    public static final String SYMBOL_TYPE_I = "I";
    public static final String SYMBOL_TYPE_A = "A";

    public static final String SYMBOL_TYPE_FIRST = "First";
    public static final String SYMBOL_TYPE_INVENTIVE = "Inventive";
    public static final String SYMBOL_TYPE_ADDITIONAL = "Additional";

    public static final String BATCH_CLSFCN_DOCUMENT_ACTIVE = "ACTIVE";

    public static final String BATCH_CLSFCN_DOCUMENT_ID = "batchDocumentId";
    public static final String BATCH_CLSFCN_LOG_ID = "batchLogId";
    public static final String FILTER_BY = "filterBy";

    public static final String FILTER_COLUMN_CR_TYPE_COMMENT = "CR_TYPE_COMMENT";

    // New PDCS Batch Related Error codes Constants
    public static final String ERROR_CODE_BATCH_DOCUMENT_ALREADY_EXISTS = "pdcs.batchDocument.already.exists";
    public static final String ERROR_CODE_BATCH_DOCUMENT_SCHEMA_ERROR = "pdcs.batchDocument.schema.error";
    public static final String ERROR_CODE_BATCH_DOCUMENT_ID_IS_MISSING = "batch.batchDocument.batchDocumentId.missing";
    public static final String ERROR_CODE_BATCH_DOCUMENT_NOT_FOUND = "pdcs.batchDocument.batchDocumentId.notFound";
    public static final String ERROR_CODE_BATCH_DOCUMENT_ALLOC_ID_MISSING = "batch.document.allocations.missing";
    public static final String ERROR_CODE_BATCH_DOCUMENT_ALLOC_SYMBOL_NOT_FOUND = "cpc.classificationsymbol.notFound";
    public static final String ERROR_CODE_BATCH_DOCUMENT_LOG_ID_IS_EMPTY = "pdcs.batchDocument.batchLogId.empty";
    public static final String ERROR_CODE_BATCH_DOCUMENT_TYPE_MISSING = "pdcs.batchDocument.batchtypecode.empty";
    public static final String ERROR_CODE_BATCH_DOCUMENT_LAST_MOD_USERID_MISSING =
            "pdcs.batchDocument.lastmod.userid.missing";
    public static final String ERROR_CODE_BATCH_DOCUMENT_STATUS_IS_EMPTY = "pdcs.batchDocument.batchstatuscode.empty";
    public static final String ERROR_CODE_BATCH_DOCUMENT_STATUS_COMPLETED = "pdcs.batch.batchDocument.status.completed";
    public static final String ERROR_CODE_BATCH_DOCUMENT_APP_FAMILY_DOCUMENT =
            "pdcs.batchDocument.applicationFamily.document";
    public static final String ERROR_CODE_BATCH_DOCUMENT_APP_FAMILY_NO_ALLOCATIONS =
            "pdcs.batchDocument.applicationFamily.no.allocations";
    public static final String ERROR_CODE_BATCH_DOCUMENT_ALLOCATIONS_SYMBOLS_INVALID =
            "pdcs.batchDocument.allocations.symbols.invalid";

    public static final String COMBI_SET_SYMBOL_RANK_SHOULD_BE_IN_SEQUENCE_ORDER =
            "COMBI set symbol rank should be in sequence order";
    public static final String MOST_RECENT_CLASSIFICATION_EXISTS_IN_CPC_DATABASE =
            "Most Recent Classification exists in CPC Database";
    public static final String ERROR_CODE_DOCUMENT_EXISTS_IN_CPC_DATABASE = "Document exists in CPC Database";
    // New PDCS Batch Document Status Codes
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_STARTED = "STARTED";
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_COMPLETED = "COMPLETED";
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_FAILED = "FAILED";
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_ERROR = "ERROR";
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_PASSED = "PASSED";
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_PDCS_READY = "PDCS READY";
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_WITHDRAW = ACTION_CODE_WITHDRAW;
    public static final String BATCH_CLASSIFICATION_STATUS_CODE_UNWITHDRAW = ACTION_CODE_UNWITHDRAW;

    public static final String SCHEMA_BATCH_CLASSIFICATION_LOG = "BatchClassificationLog.xsd";

    public static final String PALM = "PALM";

    public static final String APPLICATION_ID = "applicationNumber";
    public static final String PUB_SEQ_NO = "documentId";
    public static final String DOCUMENT_ACTION_FILE_ID = "documentActionFileId";

    public static final String PENDING_STATUS_CODE = "PENDING";
    public static final String MANUAL_ENTRY_WITHDRAW_FILE_NAME = "ODM_";
    public static final String MANUAL_ENTRY_UN_WITHDRAW_FILE_NAME = "PDCS_";
    public static final String DOCUMENT_WITHDRAW_CODE = "W";
    public static final String DOCUMENT_UN_WITHDRAW_CODE = "U";
    public static final String ERROR_CODE_DOCUMENT_WITHDRAW_ACTION_CATEGORY_IS_MISSING =
            "pdcs.document.withdraw.action.category.missing";
    public static final String ERROR_CODE_DOCUMENT_WITHDRAW_USERID_IS_MISSING = "pdcs.document.withdraw.userid.missing";
    public static final String ERROR_CODE_DOCUMENT_WITHDRAW_PUB_DATE_IS_MISSING = "pdcs.document.withdraw.pub.date.missing";

    public static final String ERROR_CODE_DOCUMENT_DOES_NOT_EXIST = "document.does.not.exist";
    public static final String ERROR_CODE_DOCUMENT_PUB_DATE_DOES_NOT_EXIST = "document.pub.date.does.not.exist";
    public static final String ERROR_CODE_DOCUMENT_ALREADY_WITHDRAWN_STATE = "document.already.withdrawn";
    public static final String ERROR_CODE_DOCUMENT_ALREADY_UN_WITHDRAWN_STATE = "document.already.unwithdrawn";
    public static final String ERROR_CODE_DOCUMENT_AND_APPLICATION_DO_NOT_MATCH = "document.and.application.do.not.match";
    public static final String ERROR_CODE_DUPLICATE_DOCUMENTS_FOR_DOCID_AND_PUBDATE =
            "duplicate.documents.with.same.docid.and.pubdate";
    public static final String ERROR_CODE_DUPLICATE_DOCUMENTS_FOR_DOCID_AND_PUBDATE_APPID =
            "duplicate.documents.with.same.docid.and.pubdate.appid";
    public static final String ERROR_CODE_APPLICATION_ID_DOES_NOT_EXIST = "application.number.does.not.exist";
    public static final String ERROR_CODE_DOC_APPL_ID_DOES_NOT_MATCH = "document.application.number.does.not.match";

    public static final String WITHDRAW_DOCUMENT_STATUS_DRAFT_STRING = "DRAFT";
    public static final String WITHDRAW_DOCUMENT_STATUS_PENDING_STRING = "PENDING";
    public static final String WITHDRAW_DOCUMENT_STATUS_READY_STRING = "READY";
    public static final String WITHDRAW_DOCUMENT_STATUS_PASSED_STRING = "PASSED";
    public static final String WITHDRAW_DOCUMENT_STATUS_ERROR_STRING = "ERROR";
    public static final String WITHDRAW_DOCUMENT_STATUS_DELETED_STRING = "DELETED";
    public static final String WITHDRAW_DOCUMENT_STATUS_COMPLETED_STRING = "COMPLETED";
    public static final String WITHDRAW_DOCUMENT_STATUS_PDCS_READY_STRING = "PDCS READY";
    public static final String WITHDRAW_DOCUMENT_IMPORT_DATE_FORMATE = "MMddyyyyHH:mm:ss";

    public static final String STATUS_CODE = "statusCode";
    public static final String PDCS_FILE_NAME = "fileName";
    public static final String DATE_MODIFIED = "dateModified";

    public static final String BATCH_CLSSFCTN_STATUS = "FK_BATCH_CLSSFCTN_STATUS_CD";

    public static final String CPC_REVISION_PROJECT_SCOPE_SYMBOL_NOT_EXISTS = "cpc.revision.project.scope.symbol.not.exists";
    public static final String CPC_REVISION_PROJECT_SCOPE_SYMBOL_NOT_PROVIDED =
            "cpc.revision.project.scope.symbol.not.provided";
    public static final String CPC_REVISION_PROJECT_RCL_INVALID_AMXL = "cpc.revision.project.scope.rcl.xml.invalid";
    public static final String CPC_REVISION_PROJECT_SCOPE_RCL_TRANSFER_TYPE_INTELLECTUAL = "intellectual";
    public static final String CPC_REVISION_PROJECT_SCOPE_RCL_TRANSFER_TYPE_ADMINISTRATIVE = "administrative";
    public static final String CPC_REVISION_PROJECT_SCOPE_RCL_TRANSFER_TYPE_INTELLECTUAL_CODE = "I";
    public static final String CPC_REVISION_PROJECT_SCOPE_RCL_TRANSFER_TYPE_ADMINISTRATIVE_CODE = "A";
    public static final String CPC_REVISION_PROJECT_SCOPE_AMENDMENT_TYPE_C = "C"; //
    public static final String CPC_REVISION_PROJECT_SCOPE_AMENDMENT_TYPE_D = "D"; // DELETE
    public static final String CPC_REVISION_PROJECT_SCOPE_AMENDMENT_TYPE_F = "F"; // FROZEN
    public static final String CPC_REVISION_PROJECT_SCOPE_XSD_NAME = "revision-concordance-table.xsd";
    public static final String CPC_REVISION_PROJECT_SCOPE_XSD_VALIDATION_STATUS = "STATUS";
    public static final String CPC_REVISION_PROJECT_SCOPE_XML_OBJECT = "OBJECT";

    public static final String CPC_RECLASS_ALLOCATION_CATEGORY_WARN = "Warning";
    public static final String CPC_RECLASS_ALLOCATION_CATEGORY_ERROR = "Error";
    public static final String CPC_CREATE_USER_ID_RECLASS = "reclass";
    public static final String CPC_RECLASS_PROJECT_CATEGORY_INSERT = "Insert";
    public static final String CPC_RECLASS_PROJECT_CATEGORY_DELETE = "Delete";

    public static final String CPC_CREATE_USER_ID_US_CONTRACTOR_6 = "us contractor 6";

    public static final String MESSAGE_CODE_CPC_WITHDRAW_EXCEL_FILE_CONTENT_MISSING =
            "cpc.withdraw.excel.file.content.missing";

    public static final String ACTION_REASON_TEXT = "Auto-petition to withdraw - Granted";
    public static final String CPC_DOCUMENT_WITHDRAW_FILENAME_UNIQUE = "cpc.document.withdraw.filename.unique";
    public static final String STND_DOC_ACTION_REASON_AUTO_PETITION_CODE = "AUTO_PET";
    public static final String ACTION_CODE = "ACTION_CODE";

    public static final String RECLASS_PROJECT_SCOPE_TYPE_ALL = "ALL";
    public static final String RECLASS_PROJECT_SCOPE_TYPE_INTEL = "I";
    public static final String RECLASS_PROJECT_SCOPE_TYPE_ADMIN = "A";

    public static final String CPC_PDCS_WITHDRAW_DOC_NOTICE_FILE = "ftl/cpc_withdraw_document_notice_xhtml.ftl";
    public static final String NO_DATA_FOUND_FROM_PALM_CODE = "[No Data found from PALM]";
    public static final String CPC_PDCS_WITHDRAW_DOCUMENT_NO_DATES = "cpc.pdcs.document.withdraw.no.dates";
    public static final String CPC_PDCS_WITHDRAW_DOCUMENT_NO_DOCS_FOUND = "cpc.pdcs.document.withdraw.no.docs.found";
    public static final String CPC_PDCS_WITHDRAW_DOCUMENT_ERRATA_NO_DOCS_FOUND =
            "cpc.pdcs.document.withdraw.errata.no.docs.found";
    public static final String CPC_PDCS_WITHDRAW_DOCUMENT_MORE_DOCS_FOUND = "cpc.pdcs.document.withdraw.more.docs.found";
    public static final String CPC_PDCS_WITHDRAW_DOCUMENT_NO_PALM_SERVICE = "cpc.palm.service.not.available";
    public static final String CPC_PDCS_ODM_MANAGER_ROLE = "ODM-MGR";
    public static final String PDCS_PATENT_WITHDRAW_NOTICE_DOC_FILE_NAME = "Patent Withdraw Notice_";
    public static final String PDCS_DOCX_EXPORT_TYPE =
            "application/vnd.openxmlformats-officedocument.wordprocessingml.document";
    public static final String PDCS_PATENT_WITHDRAW_NOTICE_DOC_FILE_EXTENSION = DOCX_EXTENSION;
    public static final String PDCS_ATTACHMENT_FILENAME_WITHDRAW_NOTICE = "attachment; filename=";
    public static final String CPC_PALM_SERVICE_NOT_AVAILABLE = "cpc.palm.service.not.available";
    public static final String APPLICATION_JSON = "application/json";

    public static final String DATE_FORMAT_MMMMM_DD_YYYY = "MMMMM dd, yyyy";
    public static final String DATE_FORMAT_MMDDYYYY = "MMddyyyy";
    public static final String FORMAT_DOCX = "docx";
    public static final String CPC_PDCS_ERRATA_WITHDRAW_DOC_NOTICE_FILE =
            "ftl/cpc_errata_withdraw_document_notice_xhtml.ftl";
    public static final String PDCS_PATENT_WITHDRAW_ERRATA_NOTICE_DOC_FILE_NAME = "Errata_";
    public static final String PDCS_PATENT_WITHDRAW_ERRATA_MULTI_INVERTORS = ", ET AL";

    public static final String TOTAL_FAMILIES_TEXT = "Total Families: ";
    public static final String FAMILIES_IN_ERROR_TEXT = "Families in Errors: ";
    public static final String SYMBOLS_ADDED_TEXT = "Symbols Added (number of Allocations inserted during Admin Transfer): ";
    public static final String SYMBOLS_DELETED_TEXT =
            "Symbols Deleted (count of Allocations deleted during Admin Transfer): ";
    public static final String REPORT_DATE_STR = "Report Date: ";
    public static final String ERROR_REPORT_TEXT = "Error Report";
    public static final String FAMILY_ID_TEXT = "Family Id";
    public static final String CREATE_NEW_ALLOCATIONS_TEXT = "Create New Allocations";
    public static final String DELETE_OLD_ALLOCATIONS_TEXT = "Delete Old Allocations";

    public static final String MESSAGE_CODE_CPC_SYMBOL_VALIDATION_ONLY_LATER = "cpc.symbol.validation.only.later";
    public static final String MESSAGE_CODE_CPC_SYMBOL_VALIDATION_ONLY_LATER_SYMBOL =
            "cpc.symbol.validation.only.later.symbol";
    public static final String CPC_RECLASS_ADMIN_TRANSFER_ADD_INSERT_CODE = "Insert";
    public static final String CPC_RECLASS_ADMIN_TRANSFER_ADD_DELETE_CODE = "Delete";

    public static final String MESSAGE_CODE_RECLASS_COMPLETE_WITH_ERRORS = "CER";

    public static final String MESSAGE_CODE_ADMIN_TRANSFER_PROJECT_NF_OR_COMPLETED =
            "cpc.admin.transfer.project.not.found.or.completed";
    public static final String MESSAGE_CODE_ADMIN_TRANSFER_NO_FIRST_IN_FAMILY = "cpc.admin.transfer.project.family.no.first";

    public static final String FAILED_TO_PROCESS = "FailedToProcess";
    public static final String DOCUMENT_ID = "DocumentId";
    public static final String APPLICATION_NO = "applicationNo";
    public static final String WITHDRAWAL_ID = "WithdrawalId";
    public static final String PUB_DATE = "PubDate";
    public static final String WITHDRAWAL_DATE = "WithdrawalDate";

    public static final String FROM_DATE_STR = "fromDate";
    public static final String TO_DATE_STR = "toDate";
    public static final String WITHDRAWAL = "Withdrawal";
    public static final String UN_WITHDRAWAL = "Un-withdrawal";

    public static final String WITHDRAWAL_ID_STR = "Withdrawal ID";
    public static final String DOCUMENT_ID_STR = "Document ID";
    public static final String APPLICATION_NO_STR = "Application No.";
    public static final String FILE_NAME_STR = "Filename";
    public static final String PUBLICATION_DATE_STR = "Publication Date";
    public static final String WITHDRAWAL_DATE_STR = "Withdrawal Date";
    public static final String PROCESSED_BY_STR = "Processed By";
    public static final String DATE_PROCESSED_STR = "Date Processed";
    public static final String ACTION_STR = "Action";
    public static final String ERROR_REASON_STR = "Error Reason";
    public static final String WITHDRAWN = "Withdrawn";
    public static final String UN_WITHDRAWN = "Unwithdrawn";
    public static final String REPORT_STR = "Report";
    public static final String EXPORT_STR = "Export";
    public static final String DELETED_STR = "Deleted";

    public static final String CPC_FAMILY_VALIDATION_ERROR_FIRST_WITH_INVENTIVE =
            "cpc.symbol.validation.noncombi.first.isInventive";

    public static final String CPC_FAMILY_VALIDATION_ERROR_ONE_FIRST = "cpc.symbol.validation.noncombi.one.first";
    public static final String CPC_FAMILY_VALIDATION_ERROR_NO_FIRST = "cpc.symbol.validation.noncombi.first.missing";
    public static final String CPC_FAMILY_VALIDATION_ERROR_COMBI_HAS_FIRST = "cpc.symbol.validation.combi.no.first";

    public static final String INTEL_RHF_REPORT = "intelrhf";
    public static final String ADMIN_RHF_REPORT = "adminrhf";
    public static final String EPO_OWNED_ALLOCATION_STR = "EPO-Owned Allocation";
    public static final String CO_OWNED_ALLOCATION_STR = "Co-Owned Allocation created by EPO";
    public static final String RHF_BY_USPTO_STR = "RHF by USPTO";
    public static final String RHF_BY_EPO_STR = "RHF by EPO";

    public static final String ALLOCATION_OWNER_STR = "ALLOCATION OWNER";
    public static final String ALLOC_TYPE_STR = "ALLOC TYPE";

    public static final String DESIGNATED_FAMILY_ID_STR = "DESIGNATED FAMILY ID";
    public static final String DOCUMENT_NO_STR = "DOCUMENT NO";
    public static final String FULL_SYMBOL_TX_STR = "FULL SYMBOL TX";
    public static final String SYMBOL_STATUS_CD_STR = "SYMBOL STATUS CD";
    public static final String POSITION_STR = "POSITION";
    public static final String GROUP_NO_STR = "GROUP NO";
    public static final String RANK_NO_STR = "RANK NO";
    public static final String RAISE_HAND_DATE_STR = "RAISE HAND DATE";
    public static final String RAISE_HAND_BY_USER_STR = "RAISE HAND BY USER";
    public static final String RAISE_HAND_STATUS_CD_STR = "RAISE HAND STATUS CD";
    public static final String RECORD_CREATED_BY_USER_STR = "RECORD CREATED BY USER";
    public static final String RECORD_CREATE_DATE_STR = "RECORD CREATE DATE";
    public static final String RECORD_UPDATED_BY_USER_STR = "RECORD UPDATED BY USER";
    public static final String RECORD_UPDATE_DATE_STR = "RECORD UPDATE DATE";

    public static final String INTELLECTUAL_REPORT = "Intellectual";
    public static final String RECLASS_RHF_REPORT_FILENAME = "EPO-Owned-CoOwned_Allocations_withRHF.xlsx";
    public static final String ADMIN_REPORT = "Admin";

    public static final String XLSX_CONTENT_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    public static final String XLSX_ATTACHMENT_FILENAME = "attachment; filename=";

    public static final String ADMIN_TRANSFER_REPORT_FILENAME = "attachment;filename=AdminTransferReport.xlsx";

    public static final String ADMIN_TRANSFER_REPORT_NAME = "AdminTransferReport";

    public static final String SYMBOL_STATUS_CD_PUBLISHED = "PUBLISHED";
    public static final String CPCONLY_CODE = "CPCONLY";
    public static final String CPC_SYMBOL_LIST_BAD_INPUT = "cpc.ipc.symbol.list.badInput";

    public static final String DESIGNATED_FAMILY_ID_HEADER = "DESIGNATED_FAMILY_ID";
    public static final String PUB_IPO_CD_HEADER = "PUB_IPO_CD";
    public static final String PUB_SEQ_NO_HEADER = "PUB_SEQ_NO";
    public static final String PUB_KIND_CD_HEADER = "PUB_KIND_CD";
    public static final String FULL_SYMBOL_TX_HEADER = "FULL_SYMBOL_TX";
    public static final String POSITION_NO_HEADER = "POSITION_NO";
    public static final String SYMBOL_STATUS_CD_HEADER = "SYMBOL_STATUS_CD";
    public static final String CPC_SEARCH_STRING_BAD_INPUT = "NO DATA OR EMPTY SEARCH SYMBOLS STRING";
    public static final String CPC_PREVIOUS_SEARCH_DATE_BAD_INPUT = "BAD  OR EMPTY OR NULL PREVIOUS SEARCH DATA STRING";

}
