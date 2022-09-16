package com.example.assignment.exception;

import org.springframework.http.HttpStatus;

/**
 * Custom Exception class for Data Api Exception
 */
public class DataApiException extends RuntimeException {

    private static final long serialVersionUID = -6593330219878485669L;

    private final HttpStatus status;
    private final String message;

    public DataApiException(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;
    }

    public DataApiException(HttpStatus status, String message, Throwable exception) {
        super(exception);
        this.status = status;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}