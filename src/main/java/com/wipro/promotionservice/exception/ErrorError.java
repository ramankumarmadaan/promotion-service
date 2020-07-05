package com.wipro.promotionservice.exception;

public class ErrorError {

    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public ErrorError() {
    }

    public ErrorError(Error error) {
        this.error = error;
    }
}
