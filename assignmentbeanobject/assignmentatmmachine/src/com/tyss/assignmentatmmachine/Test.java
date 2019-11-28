package com.tyss.assignmentatmmachine;

public class Test {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		
		HdfcBank hdfcbank = new HdfcBank();
		machine.detectCard(hdfcbank);
		System.out.println("________________________________");
		
		IciciBank icicibank = new IciciBank();
		machine.detectCard(icicibank);
		System.out.println("________________________________");
		
		SbiBank sbibank = new SbiBank();
		machine.detectCard(sbibank);
	}

}
