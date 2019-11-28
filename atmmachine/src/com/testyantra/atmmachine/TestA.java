package com.testyantra.atmmachine;

public class TestA {
	
	public static void main(String[] args) {
		
		ICICI i = new ICICI();
		HDFC h = new HDFC();
		Machine m = new Machine();
		m.slot(i);
		System.out.println("________________________");
		m.slot(h);
		System.out.println("________________________");
		SBI s = new SBI();
		m.slot(s);
	}

}
