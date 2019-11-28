package com.ty.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {

	public static void main(String[] args) {
		
		Employee s1 = new Employee(2,"Divya",67.89);
		Employee s2 = new Employee(1,"Santosh",68.89);
		Employee s3 = new Employee(3,"Suprith",69.89);
		Employee s4 = new Employee(4,"Pramod",69.99);
		Employee s5 = new Employee(5,"Surya",67.89);
		Employee s6 = new Employee (6,"Tree",67.77);
		Employee s7 = new Employee(7,"Tree1",68.77);
		Employee s8 = new Employee(8,"Tree2",66.77);
		Employee s9 = new Employee(9,"Tree3",65.77);
		Employee s10 = new Employee(10,"Trees4",65.88);
		
ArrayList<Employee> a1 = new ArrayList<Employee>();
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
ArrayList<Employee> al1 = new ArrayList<Employee>();
		
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
        ArrayList<Employee> al2 = new ArrayList<Employee>();
		
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<>();
		hm.put("John", a1);
		hm.put("William", al1);
		hm.put("Lucy", al2);
		
        ArrayList<Employee> ae = hm.get("John");
		
		Iterator<Employee> it = ae.iterator();
		
	
		System.out.println();
		
	
		
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.salary);
			System.out.println("===========================");
		}
		
		
	}
}
