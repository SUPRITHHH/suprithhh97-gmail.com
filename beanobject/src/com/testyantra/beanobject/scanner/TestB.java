package com.testyantra.beanobject.scanner;

import java.util.Scanner;

public class TestB {
	
	public static void main(String[] args) {
		System.out.println("Scanner Class");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age =");
		int age= sc.nextInt();
		System.out.println("Age is "+age);
       	System.out.println("Enter Name");
	    String s = sc.next();
	    System.out.println("The Name is "+s);
	   
	    System.out.println("Are you a Male");
	    boolean a = sc.nextBoolean();
	    System.out.println(a);
	}

}
