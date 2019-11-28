package com.testyantra.collectionframework;

import java.util.ArrayList;

public class TestJ {

	public static void main(String[] args) {
		
		ArrayList<Student> a1 = new ArrayList<Student>();
		
		Student s1 = new Student(101,"ankita",45.55);
		Student s2 = new Student(102,"Salman",90.00);
		Student s3 = new Student(103,"SUPRITH",94.40);
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for(int i=0;i<a1.size();i++) {
			Student s = a1.get(i);
			System.out.println("Id is "+s.getId());
			System.out.println("Name is "+s.getName());
			System.out.println("Percentage is "+s.getPercentage());
		}
		
		
		System.out.println("=====For Each=====");
		
		for(Student s : a1) {
			System.out.println(s);
		}
	}
}
