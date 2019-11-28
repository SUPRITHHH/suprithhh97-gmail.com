package com.testyantra.objectclass;

public class TestD {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101,"SUPRITH",94.40);
		int h1 = s1.hashCode();
		String s = s1.toString();
		System.out.println(h1);
		System.out.println(s);
	}

}
