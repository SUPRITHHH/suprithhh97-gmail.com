package com.testyantra.exception;

public class TestF {

	public static void main(String[] args) {
		
       System.out.println("Main Started");
		
		String s = "hello";
		int[] a = {10,20,30};
		int b = 10;
		
		try {
			
			String s1 = s.toUpperCase();
			System.out.println(s1);		
			System.out.println(a[2]);
			System.out.println(b/0);
		}
	
			
		catch(NullPointerException ne){
			System.out.println("Dont play with Null");
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index Not Present");
		}catch(ArithmeticException ai) {
			System.out.println("Divide by Zero");
		}catch(Exception e) {
			   e.printStackTrace();
		}
		
		System.out.println("Main Ended");
	}
}
