package com.tyss.assignmentatmmachine;

public class SbiBank implements AtmMachine {

	@Override
	public void validateCard() {
		System.out.println("SBI Bank ATM Card");
	}
	
	@Override
	public void getInfo() {
		System.out.println("getInfo() method of SBI Bank");
	}
}
