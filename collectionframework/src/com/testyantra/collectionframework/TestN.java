package com.testyantra.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class TestN {

	public static void main(String[] args) {
       
		Stack<Employee> a1 = new Stack<Employee>();
		
		Employee s1 = new Employee(101,"ankita","Testing");
		Employee s2 = new Employee(102,"Salman","Development");
		Employee s3 = new Employee(103,"SUPRITH","R&D");
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for(int i=0;i<a1.size();i++) {
			Employee s = a1.get(i);
			System.out.println("Id is "+s.getEid());
			System.out.println("Name is "+s.getEname());
			System.out.println("Percentage is "+s.getDname());
		}
		
		
		System.out.println("=====For Each=====");
		
		for(Employee s : a1) {
			System.out.println(s);
		}
		
		Iterator  it = a1.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
		
		
		ListIterator lt = a1.listIterator();
		
		while(lt.hasNext()) {
			Object o1 = lt.next();
			System.out.println(o1);
		}
		
		while(lt.hasPrevious()) {
			Object o1 = lt.previous();
			System.out.println(o1);
		}
	}
}
