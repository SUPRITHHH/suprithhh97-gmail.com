package com.testyantra.wrapperclasses;

public class TestA {
	
	public static void main(String[] args) {
		int a = 10;
		System.out.println("a is "+a);
		//autoboxing
		Integer i = a;
		System.out.println("i is "+i);
		
		Integer x = 10;
		System.out.println("x is "+x);
		int y = x;  //unboxing or auto unboxing
		System.out.println("y is "+y);
		
		int value = Integer.parseInt("1245");
		System.out.println("Value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is "+result);
		
		long value1 = Long.parseLong("12345");
		System.out.println("Value is "+value1);
		
		float value2 = Float.parseFloat("26.345025");
		System.out.println("value is "+value2);
		
		
	}
}
