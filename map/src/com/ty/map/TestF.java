package com.ty.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {

	public static void main(String[] args) {
		Student s1 = new Student(2,"Divya",67.89);
		Student s2 = new Student(1,"Santosh",68.89);
		Student s3 = new Student(3,"Suprith",69.89);
		Student s4 = new Student(4,"Pramod",69.99);
		Student s5 = new Student(5,"Surya",67.89);
		Student s6 = new Student(6,"Tree",67.77);
		Student s7 = new Student(7,"Tree1",68.77);
		Student s8 = new Student(8,"Tree2",66.77);
		Student s9 = new Student(9,"Tree3",65.77);
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<>();
		hm.put("First", a1);
		hm.put("Second", al1);
		hm.put("Third", al2);
		
		ArrayList<Student> first = hm.get("Second");
		
		Iterator<Student> it = first.iterator();
		
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("===========================");
		}
		
		
		
	}
	
	
	
}
