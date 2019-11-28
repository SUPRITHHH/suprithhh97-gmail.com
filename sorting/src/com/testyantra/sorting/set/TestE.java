package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
//		ts.add("SUPRITH"); ClassCast Exception
//      ts.add(null);NullPointerException
		System.out.println("**********Using For Each***************");
		for(Object obj1 : ts) {
			System.out.println(obj1);
		}
		
		System.out.println("**********Using Iterator**************");
		
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object obj2 = it.next();
			System.out.println(obj2);
		}
	}
}

