package com.testyantra.exception;



public class TestD {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int[] a = {10,20,30};
		int b = 10;
		
		try {
	     	System.out.println(a[4]);	
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("array index not present");
		}
		
		try {
		  System.out.println(b/0);
		}catch(ArithmeticException ai) {
			System.out.println("Number divided by zero");
		}
		
		System.out.println("Main Ended");
	}
}
