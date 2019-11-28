package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(34);
		ls.add("Nikitha");
		ls.add(89.9);
		ls.add(34);
		ls.add("Bhavya");
		ls.add(null);
		ls.add(null);
		
		System.out.println("********Using For Each************");
		for(Object o : ls) {
			System.out.println(o);
		}
		
		System.out.println("********Using Iterator************");
		Iterator it = ls.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
	}
}
