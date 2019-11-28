package com.testyantra.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortByName1 sb1 = new SortByName1();
		
		TreeSet<Customer> t = new TreeSet<Customer>(sb1);
		
		Customer c1 = new Customer("SUPRITH", 101, 500000);
		Customer c2 = new Customer("VEEM", 102, 40000);
		Customer c3 = new Customer("HEM", 103, 100000);
		Customer c4 = new Customer("POMY", 104, 60000);
		
		t.add(c1);
		t.add(c2);
		t.add(c3);
		t.add(c4);
		
		
		System.out.println("*********Using Iterator***********");
		
		Iterator<Customer> it = t.iterator();
		while(it.hasNext()) {
			 Customer b5 = it.next();
			System.out.println("Name is "+b5.name);
			System.out.println("PinCode is "+b5.id);
			System.out.println("MICR is "+b5.salary);
			System.out.println("==============================");
		}
	}
	
}
