package com.testyantra.objectclass;

public class TestE {

public static void main(String[] args) {
		
		Car c1 = new Car(5600,"BENZ","Black");
		int h2 = c1.hashCode();
		String s1 = c1.toString();
		System.out.println("The Cost is "+h2);
		System.out.println(s1);
	}

}
