package com.ty.predicate;

import java.util.function.Predicate;

import com.ty.java8features.Student;

public class TestA {

	public static void main(String[] args) {
		

		Predicate<Employee> p = s-> {
			if(s.id == 1) {
				return true;
			}else {
				return false;
			}
		};
		
		Employee s = new Employee(1,"anup",45.6);
		boolean res = p.test(s);
		System.out.println("Result "+res);
		
		Employee s1 = new Employee(2,"Suprith",46.6);
		boolean res1 = p.test(s1);
		System.out.println("Result "+res1);
	}
}
