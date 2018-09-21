package com.ngocnv.com.ngocnv.cleanCode.exception;

public class NoCatchException extends RuntimeException {

    public NoCatchException(String message) {
        super(message);
    }

    public NoCatchException(Throwable cause) {
        super(cause);
    }

    public NoCatchException(String message, Throwable cause) {
        super(message, cause);
    }
}
