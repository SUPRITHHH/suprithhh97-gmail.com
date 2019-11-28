package com.testyantra.collectionframework;

import java.util.ArrayList;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add("Shreya");
		
		Object obj = a1.get(0);
		String name = (String) obj;
		
		name = name.toUpperCase();
		System.out.println(name);
	}
}
