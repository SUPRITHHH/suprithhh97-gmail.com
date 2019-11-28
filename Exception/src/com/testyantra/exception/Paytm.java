package com.testyantra.exception;

public class Paytm {
	
	void book() {
		System.out.println("Paytm Started");
		
		IRCTC ic = new IRCTC();
	
		ic.confirm();
		
		System.out.println("Paytm Ended");
	}

}
