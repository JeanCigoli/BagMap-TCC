package com.maps.bagmap.service.exceptions;

public class StateNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public StateNotFoundException(String message) {
		super(message);
	}

}
