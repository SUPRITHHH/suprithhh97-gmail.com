package com.tyss.springrest.controller;


import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.tyss.springrest.dto.EmployeeResponse;

@RestControllerAdvice
public class HandleException {

	@ExceptionHandler(Exception.class)
	public EmployeeResponse getException() {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in Code");
		response.setDescription("Got an Exception");
		return response;
	}
}
