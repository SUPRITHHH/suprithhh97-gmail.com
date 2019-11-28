package com.testyantra.sorting.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Vector;

public class TestK {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		v1.add(12);
		
		System.out.println(v1.capacity());
		Object o1[] = v1.toArray();
		System.out.println(o1);
		List l = Arrays.asList(o1);
		System.out.println(l);
		
		
		PriorityQueue<Integer> p1 = new PriorityQueue<>();
		
		p1.add(12);
		p1.add(24);
		p1.add(35);
		p1.add(35);
		p1.offer(1);
		
		System.out.println("Before poll "+p1);
		System.out.println("*****Using Iterator********");
		
		System.out.println("");
		Iterator<Integer> it = p1.iterator();
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}
