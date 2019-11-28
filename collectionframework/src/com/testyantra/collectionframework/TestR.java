package com.testyantra.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestR {

	public static void main(String[] args) {
       
		Vector<Teacher> a1 = new Vector<Teacher>();
		
		Teacher s1 = new Teacher(101,"ankita","DSP");
		Teacher s2 = new Teacher(102,"Salman","S&S");
		Teacher s3 = new Teacher(103,"SUPRITH","PCS");
		
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		for(int i=0;i<a1.size();i++) {
			Teacher s = a1.get(i);
			System.out.println("Id is "+s.getId());
			System.out.println("Name is "+s.getName());
			System.out.println("Percentage is "+s.getSubject());
		}
		
		
		System.out.println("=====For Each=====");
		
		for(Teacher s : a1) {
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
