package com.testyantra.collectionframework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {

	public static void main(String[] args) {
		
		Vector li = new Vector();
		
		li.add(12);
		li.add(29.33);
		li.add("more");
		li.add(true);
		li.add(null);
		
		System.out.println("=====Using For Loop=====");
		
		for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println("=====Usinf For Each Loop======");
		for(Object obj : li) {
			System.out.println(obj);
		}
		
		
		System.out.println("======Using Iterator=========");
		
		Iterator  it = li.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
		
		
		System.out.println("=====Using List Iterator Forward======");
		
		ListIterator lt = li.listIterator();
		while(lt.hasNext()) {
			Object o1 = lt.next();
			System.out.println(o1);
		}
		
		System.out.println("======Using List Iterator Backward=====");
		while(lt.hasPrevious()) {
			Object o1 = lt.previous();
			System.out.println(o1);
		}
	}
	
}
	
	


