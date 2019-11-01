package com.axiomtelecom.assignment.exception;

public class MobileNotFoundException extends RuntimeException {
	

	    private static final long serialVersionUID = 1L;

	    public MobileNotFoundException(String param) {
	        super(" please check the attributes or its value " + param);
	    }
	

}
