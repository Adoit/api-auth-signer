package com.baiwang.cloud.auth.sign;

public class AuthSignException extends RuntimeException {

    private static final long serialVersionUID = 4116568303414562017L;

    public AuthSignException() {
        super();
    }

    public AuthSignException(String message) {
        super(message);
    }

    public AuthSignException(String message, Throwable cause) {
        super(message, cause);
    }

    public AuthSignException(Throwable cause) {
        super(cause);
    }

    protected AuthSignException(String message, Throwable cause, boolean enableSuppression, boolean
            writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
