package com.adoit.sdk.transform;

public class NotImplementedException extends RuntimeException {

    private static final long serialVersionUID = 7928791240381665696L;

    public NotImplementedException() {
    }

    public NotImplementedException(String message) {
        super(message);
    }

    public NotImplementedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotImplementedException(Throwable cause) {
        super(cause);
    }

    public NotImplementedException(String message, Throwable cause, boolean enableSuppression, boolean
            writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
