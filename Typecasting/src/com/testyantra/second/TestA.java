package com.testyantra.second;

public class TestA {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		try {
			Thread.sleep(3000);
			System.out.println("Inside Try");
		} catch (InterruptedException e) {
			System.out.println("Exception Caught");
			e.printStackTrace();
		}
		
		System.out.println("Main Ended");
	}
}
