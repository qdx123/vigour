package org.r.framework.thrift.client.core.exception;

import java.security.PrivilegedActionException;

/**
 * date 2020/6/23 下午2:12
 *
 * @author casper
 **/
public class ChannelOpenFailException extends Exception {
    public ChannelOpenFailException() {
    }

    public ChannelOpenFailException(String message) {
        super(message);
    }

    public ChannelOpenFailException(String message, Throwable cause) {
        super(message, cause);
    }

    public ChannelOpenFailException(Throwable cause) {
        super(cause);
    }

    public ChannelOpenFailException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}