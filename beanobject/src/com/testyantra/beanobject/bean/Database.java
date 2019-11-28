package com.testyantra.beanobject.bean;

import com.testyantra.beanobject.employee.Employee;

public class Database {

	void receive(Student s) {
		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getname());
		System.out.println("Rollno is "+s.getRollNo());
        System.out.println("__________________________");	
        
     }
	
	void save(Employee e) {
		System.out.println("Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("Salary is "+e.getSalary());
	}
}
