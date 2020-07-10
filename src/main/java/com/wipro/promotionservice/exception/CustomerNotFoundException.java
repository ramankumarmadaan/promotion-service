package com.wipro.promotionservice.exception;



public class CustomerNotFoundException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -593471322801383728L;

	public CustomerNotFoundException(String message) {
        super(message);
    }
}
