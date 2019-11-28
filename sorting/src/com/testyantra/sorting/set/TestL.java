package com.testyantra.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestL {

	public static void main(String[] args) {
		
		Comparator<Employee1> comp = (e7,e8)->{
			if(e7.height > e8.height) {
				return 1;
			}else if(e7.height < e8.height) {
				return -1;
			}else {
				return 0;
			}
		};
		
		TreeSet<Employee1> e1 = new TreeSet<Employee1>(comp);
		
		Employee1 e2 = new Employee1(4, "Niki", 5.6);
		Employee1 e3 = new Employee1(1,"Baskar",5.2);
		Employee1 e4 = new Employee1(5, "Suresh", 5.1);
		Employee1 e5 = new Employee1(2, "Dinesh", 4.5);
		
		e1.add(e2);
		e1.add(e3);
		e1.add(e4);
		e1.add(e5);
		
		System.out.println("*********Using Iterator***********");
		Iterator<Employee1> it = e1.iterator();
		while(it.hasNext()) {
			Employee1 e6 = it.next();
			System.out.println("Name is "+e6.name);
			System.out.println("Id is "+e6.id);
			System.out.println("Height is "+e6.height);
			System.out.println("==============================");
			
		}
		
		
	}
}
