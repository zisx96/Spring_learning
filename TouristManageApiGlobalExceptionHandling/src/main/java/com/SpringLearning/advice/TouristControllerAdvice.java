package com.SpringLearning.advice;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.SpringLearning.exceptions.TouristNotFoundException;

@RestControllerAdvice
public class TouristControllerAdvice {
	
	
	@ExceptionHandler(TouristNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTouristExceptio(TouristNotFoundException e){
		
		ErrorDetails error = new ErrorDetails("404 not found", e.getMessage(), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error, HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleExceptio(Exception e){
		
		ErrorDetails error = new ErrorDetails("internal server error found", e.getMessage(), LocalDateTime.now());
		
		return new ResponseEntity<ErrorDetails>(error, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
}
