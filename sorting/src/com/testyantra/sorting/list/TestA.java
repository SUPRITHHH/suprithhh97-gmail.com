package com.testyantra.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12,"Dimple",35.6);
		Student s2 = new Student(2,"Sweety",30.8);
		Student s3 = new Student(34,"jimmy",68.9);
		Student s4 = new Student(5,"tummy",76.6);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Before Sorting----------------->");
		displayStudentDetails(al);
		Collections.sort((List<Student>) al);
		System.out.println("After Sorting------------------>");
		displayStudentDetails(al);
		
		}
		
	static void displayStudentDetails(ArrayList<Student>al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("ID is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			
			
		}
		
	}
}
