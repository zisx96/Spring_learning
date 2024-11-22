package com.SpringLearning.exceptions;

public class TouristNotFoundException extends RuntimeException {
	
	public TouristNotFoundException(String msg) {
		
		super(msg);
	}
}
