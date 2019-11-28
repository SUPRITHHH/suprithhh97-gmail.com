package com.testyantra.exception;

public class TestH {

	public static void main(String[] args) {
		System.out.println("Main Started");
		Paytm p1 = new Paytm();
		try {
		p1.book();
		}catch(ArithmeticException ae){
			System.out.println("Exception caught in main");
		}finally {
			System.out.println("Executing Finally");
		}
		System.out.println("Main Ended");
	}
}
