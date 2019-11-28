package com.testyantra.exception;

public class TestB {

	public static void main(String[] args) {
		
		System.out.println("Main Started");

		int a=10;
		int b=0;
		
		try {
			b=10/0;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Hello Diwali");
			
		}catch(ArithmeticException ae) {
			System.out.println("Number Is Divided By Zero");
		}
		
		
		
		System.out.println("Main Ended");
	}
}
