package com.testyantra.Typecasting;

public class TestA {

	public static void main(String[] args) {
		
		byte a = 10;
		int b = a; // Implicit Casting
		System.out.println("b is "+b);
		int p = 20;
		double q = p;
		System.out.println("q is "+q);
		System.out.println("__________________________");
		double x = 65.00;
		int y =(int)x;//Explicit Casting
		System.out.println("y is "+y);
		byte z = (byte)x;
		System.out.println("z is "+z);
		char r = (char)y;
		System.out.println("r is "+r);

	}
}
