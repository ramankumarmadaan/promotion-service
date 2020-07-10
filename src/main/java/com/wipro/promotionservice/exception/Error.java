package com.wipro.promotionservice.exception;

import org.springframework.http.HttpStatus;

public class Error {

    public Error() {
    }


    private String message = null;

    private HttpStatus statusCode = null;


    public Error(String message, HttpStatus statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(HttpStatus statusCode) {
        this.statusCode = statusCode;
    }

}

