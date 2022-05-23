package com.derteuffel.farcd.exceptions;

import org.springframework.http.HttpStatus;

public class FardcAPIException extends RuntimeException {

    private HttpStatus status;
    private String message;

    public FardcAPIException(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public FardcAPIException(String message, HttpStatus status, String message1) {
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
