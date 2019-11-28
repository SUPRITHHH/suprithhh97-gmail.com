package com.testyantra.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class TestF {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("anupama");
		a1.add("savita");
		a1.add("kavita");
		a1.add("sunitha");
		
		String name = a1.get(0);
		System.out.println(name.toUpperCase());
		
		Iterator<String> li = a1.iterator();
		
		while(li.hasNext()) {
			String s = li.next();
			System.out.println(s);
		}
		
		System.out.println("=====Using List Iterator=======");
		
		ListIterator<String> li1 = a1.listIterator();
		
		while(li1.hasNext()) {
			String s1 = li1.next();
			System.out.println(s1);
		}

		System.out.println("======Using For Each Loop=======");
		
		for(String n : a1) {
			System.out.println(n);
		}
		
		
		
	}
}
