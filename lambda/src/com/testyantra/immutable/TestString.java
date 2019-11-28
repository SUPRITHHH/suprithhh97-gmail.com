package com.testyantra.immutable;

public class TestString {

	public static void main(String[] args) {
		
		MyString ms = new MyString(12,"RENU");
		System.out.println(ms.getname());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		ms.changeContent(20,"REENU");
		System.out.println(ms.getname());
		System.out.println(ms.getRollNo());
	}
}
