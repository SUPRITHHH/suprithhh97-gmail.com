package com.testyantra.exception;

public class TestG {

	public static void main(String[] args) {
		
	       System.out.println("Main Started");
			
			String s = "hello";
			int[] a = {10,20,30};
			int b = 10;
			
			try {
				
				String s1 = s.toUpperCase();
				System.out.println(s1);		
				System.out.println(a[3]);
				System.out.println(b/0);
			}catch(Exception e) {
				   e.printStackTrace();
				   System.out.println("Exception Occured");
			}
			
			System.out.println("Main Ended");
	}
}
