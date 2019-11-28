package com.testyantra.collectionframework;

import java.util.ArrayList;

public class TestB {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(29.7);
		a1.add(true);
		a1.add(true);
		a1.add("chinna");
		
		for(Object obj : a1) {
			System.out.println(obj);
		}
		
	}
	

}
