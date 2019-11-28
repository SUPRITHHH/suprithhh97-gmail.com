package com.testyantra.exception.customized.uncheckedexceptiom;

public class InvalidAgeException extends RuntimeException {

	String message = "Invalid age below 18years not alloowed";
	
	public  InvalidAgeException() {
		// TODO Auto-generated constructor stub
	}
	
	public InvalidAgeException(String message) {
		this.message=message;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "InvalidAgeException [message=" + message + "]";
//	}

	@Override
	public String getMessage() {
		return message;
	}
}
