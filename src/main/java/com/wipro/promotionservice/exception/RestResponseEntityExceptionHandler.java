package com.wipro.promotionservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class RestResponseEntityExceptionHandler
        extends ResponseEntityExceptionHandler {

    private static ErrorError CUSTOMER_NOT_FOUND = new ErrorError(new Error(
            "Customer not found With id", HttpStatus.NOT_FOUND));

    private static ErrorError PRODUCT_NOT_FOUND = new ErrorError(new Error(
            "Product not found With id", HttpStatus.NOT_FOUND));

    private static ErrorError RUNTIME_MESSAGE = new ErrorError(new Error(
            "There is some issue with the request", HttpStatus.BAD_REQUEST));


    @ExceptionHandler(value = CustomerNotFoundException.class)
    protected ResponseEntity<Object> handleCustomerDataNotFound(
            CustomerNotFoundException ex) {
        return new ResponseEntity<>(CUSTOMER_NOT_FOUND, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = ProductNotFoundException.class)
    protected ResponseEntity<Object> handleProductDataNotFound(
            ProductNotFoundException ex) {
        return new ResponseEntity<>(PRODUCT_NOT_FOUND, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = RuntimeException.class)
    protected ResponseEntity<Object> handleRuntime(
            RuntimeException ex) {
        return new ResponseEntity<>(RUNTIME_MESSAGE, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
