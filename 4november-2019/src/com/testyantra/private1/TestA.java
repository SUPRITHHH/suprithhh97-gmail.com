package com.testyantra.private1;

public class TestA extends Private1 {

    @Override
	private void name() {
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		
		TestA n1 = new TestA();
		
		n1.name();
	}
}
