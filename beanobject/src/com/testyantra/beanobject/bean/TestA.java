package com.testyantra.beanobject.bean;

import com.testyantra.beanobject.employee.Employee;

public class TestA {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(12);
		s.setName("Shivagami");
		s.setRollNo(134);
		
		Database db = new Database();
		db.receive(s);
		
		Employee e = new Employee();
		e.setId(111);
		e.setName("SUPRITH");
		e.setSalary(14600.00);
		db.save(e);
		
	}
	
}
