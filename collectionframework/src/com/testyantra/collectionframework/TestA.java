package com.testyantra.collectionframework;

import java.util.ArrayList;

public class TestA {
	
	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add(12);
		a1.add(22.5);
		a1.add("chinu");
		a1.add(true);
		a1.add(null);
		a1.add('A');
		
		Object obj1 = a1.get(2);
		System.out.println(obj1);
		
		for(int i=0;i<6;i++) {
			Object obj = a1.get(i);
			System.out.println(obj);
		}
	}

	
	
}
