package com.wipro.promotionservice.exception;



public class ProductNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7092104846232177385L;

	public ProductNotFoundException(String message) {
        super(message);
    }
}
