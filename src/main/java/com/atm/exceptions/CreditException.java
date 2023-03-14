package com.atm.exceptions;

public class CreditException extends RuntimeException {

    public CreditException() {
    }

    public CreditException(String message) {
        super(message);
    }

    public CreditException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreditException(Throwable cause) {
        super(cause);
    }

    public CreditException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
