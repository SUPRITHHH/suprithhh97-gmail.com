package com.tyss.assignmentatmmachine;

public class IciciBank  implements AtmMachine{

	@Override
	public void validateCard() {
		System.out.println("ICICI Bank ATM Card");
	}
	
	@Override
	public void getInfo() {
		System.out.println("getInfo() method of ICICI Bank");
	}
}
