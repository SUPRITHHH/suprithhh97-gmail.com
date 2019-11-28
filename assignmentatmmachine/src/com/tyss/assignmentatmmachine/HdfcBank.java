package com.tyss.assignmentatmmachine;

public class HdfcBank implements AtmMachine {

	@Override
	public void validateCard() {
		System.out.println("HDFC Bank Atm Card");
	}
	
	@Override
	public void getInfo() {
		System.out.println("getInfo() method of HDFC Bank");
	}
}
