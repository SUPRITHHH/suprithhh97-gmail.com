package com.testyantra.lambda;

public class TestGreet {

	public static void main(String[] args) {
		
		GreetInterface  g1 = (message) -> {
			System.out.println("Hello");
			System.out.println(message);
			return message;
		};
		
		String g2 = g1.greet("HI"); 
		System.out.println("Message is "+g2);
	}
}
