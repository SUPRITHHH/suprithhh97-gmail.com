package com.testyantra.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add(23);
		a1.add(98.77);
		a1.add(true);
		a1.add("Good Evening");

		Iterator it = a1.iterator();
		Object o1 = it.next();
		System.out.println("obj1 "+o1);
		
		Object o2 = it.next();
		System.out.println("obj2 "+o2);
		
		Object o3 = it.next();
		System.out.println("obj3 "+o3);
		
		Object o4 = it.next();
		System.out.println("obj4 "+o4);
		
		boolean b = it.hasNext();
		System.out.println("Has Next "+b);
		

//		Object o5 = it.next();
//		System.out.println("obj5 "+o5);
//      No such element exception		
		
		
		for(int i=0;i<a1.size();i++) {
			Object obj = a1.get(i);
			System.out.println(obj);
		}
		
		ArrayList al1 = new ArrayList();
		
		al1.add(12);
		al1.add(233.44);
		al1.add("momo");
		al1.add(false);
		
		Iterator it1 = al1.iterator();
		
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}
		
//		System.out.println("_________Using For Loop");
		
//		for(;it1.hasNext();) {
//			Object o = it1.next();
//			System.out.println(o);
//		}
	}
}
