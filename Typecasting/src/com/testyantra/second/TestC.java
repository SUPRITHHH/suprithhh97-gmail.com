package com.testyantra.second;

import java.util.Scanner;

public class TestC {
	
	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		//we can write multiple try block using semicolon
		try (Scanner sc = new Scanner(System.in);
			 Scanner sc2 = new Scanner(System.in)){
			System.out.println("Enter Age");
			int age = sc.nextInt();
			System.out.println("age"+age);
			System.out.println(age/0);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}finally {
			System.out.println("Finally Executed");
		}
	}

}
