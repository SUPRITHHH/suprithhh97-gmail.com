package com.testyantra.collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class Test1A {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("SUPRITH");
		al.add("PRAMOD");
		al.add("VEENA");
		al.add("KIRAN");
		
		System.out.println("Before sort----------> "+al);
		
		Collections.sort(al);
		
		System.out.println("After sort-----------> "+al);
	}
}
