package com.atm.exceptions;

public class DebitException extends RuntimeException {
    public DebitException() {
    }

    public DebitException(String message) {
        super(message);
    }

    public DebitException(String message, Throwable cause) {
        super(message, cause);
    }

    public DebitException(Throwable cause) {
        super(cause);
    }

    public DebitException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
