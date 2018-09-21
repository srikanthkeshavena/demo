package com.testing.cpc.dao.exception;

import com.testing.cpc.common.constant.Constants;

public class SerializationHelperException extends RuntimeException {

    private static final long serialVersionUID = Constants.ONE_LONG;

    public SerializationHelperException(Exception e) {
        super(e);
    }

}
