package com.testyantra.objectclass;

public class USBPort {

	public static void connect(Object obj) {
		
		if(obj instanceof Pendrive) {
			Pendrive p1 = (Pendrive)obj;
			p1.read();
			p1.write();
		}
		
		else if(obj instanceof Mouse) {
			Mouse m1 = (Mouse)obj;
			m1.click();
			m1.scroll();
		}
		
		else {
			System.out.println("Invalid Object");
		}
		
	}
}
