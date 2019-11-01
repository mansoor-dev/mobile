package com.axiomtelecom.assignment.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.axiomtelecom.assignment.exception.MobileError;
import com.axiomtelecom.assignment.exception.MobileNotFoundException;

@ControllerAdvice
public class ExceptionAdvice {
@ExceptionHandler
	public ResponseEntity<MobileError> mapException(MobileNotFoundException ex){
		MobileError error=new MobileError(HttpStatus.INTERNAL_SERVER_ERROR.value(),ex.getMessage());
		return new ResponseEntity<MobileError>(error,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
