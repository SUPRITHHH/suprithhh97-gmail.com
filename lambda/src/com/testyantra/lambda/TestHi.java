package com.testyantra.lambda;

public class TestHi {

	public static void main(String[] args) {
		
		SayHiInterface s1 = ()->
		{
			System.out.println("Hi");
			return null;
		};
		
		String s2 = s1.sayhi();
	}
}
