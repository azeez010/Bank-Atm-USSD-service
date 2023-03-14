package com.atm.exceptions;

public class SigninException extends RuntimeException{

    public SigninException() {
    }

    public SigninException(String message) {
        super(message);
    }

    public SigninException(String message, Throwable cause) {
        super(message, cause);
    }

    public SigninException(Throwable cause) {
        super(cause);
    }

    public SigninException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
