package com.testyantra.objectclass;

public class TestA {

	public static void main(String[] args) {
		
		Pendrive p1 = new Pendrive();
		USBPort.connect(p1);
		Mouse m = new Mouse();
		USBPort.connect(m);
	}
}
