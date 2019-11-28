package com.testyantra.objectclass;

public class TestG {
	
	public static void main(String[] args) {
		Employee e1 = new Employee(10,"SUPRITH",56000);
		Employee e2 = new Employee(20,"VEEN",10000);
		Employee e3 = new Employee(10,"SUPRITH",56000);
		Employee e4 = e3;
		
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		System.out.println(e3.equals(e4));
		
		System.out.println(e1);
		System.out.println(e2);
	}

}
