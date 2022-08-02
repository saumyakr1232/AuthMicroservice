package com.cts.authmicroservice.exceptions;

public class LoginException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public LoginException(String exceptionMessage) {
        super(exceptionMessage);
    }

}
