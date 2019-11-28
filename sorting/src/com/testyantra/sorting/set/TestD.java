package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> s1 = new LinkedHashSet<Double>();
		s1.add(12.3);
		s1.add(25.6);
		s1.add(1.5);
		s1.add(67.5);
		s1.add(34.8);
		
		System.out.println("*********Using For Each*************");
		for(Object Ob : s1) {
			System.out.println(Ob);
		}
		
		System.out.println("*******Using Iterator***************");
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
