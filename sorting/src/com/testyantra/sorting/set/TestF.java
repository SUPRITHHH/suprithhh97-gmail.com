package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Roopa");
		ts.add("Jaya");
		ts.add("Sushma");
		ts.add("SUPRITH");
		ts.add("Sheela");
		System.out.println("***************************");
		for(Object obj : ts) {
			System.out.println(obj);
		}
		
		System.out.println("****************************");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object obj1 = it.next();
			System.out.println(obj1);
 		}
	}
}
