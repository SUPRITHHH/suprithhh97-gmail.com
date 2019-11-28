package com.testyantra.collectionframework;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();
		
		a1.add(10);
		a1.add(45.6);
		a1.add("SUPRITH");
		a1.add(true);
		
		ListIterator li = a1.listIterator();
		
		System.out.println("-------------Forward");
		while(li.hasNext()) {
			Object obj1 = li.next();
			System.out.println(obj1);
		}
		
		System.out.println("------------Backward");
		while(li.hasPrevious()) {
			Object obj = li.previous();
			System.out.println(obj);
		}
		
	}
}
