package com.tyss.assignmentbeanobject.employee;

import com.tyss.assignmentbeanobject.student.Student;

public class DataBase {

	public void searchStudent(Student s) {
		System.out.println("ID is --"+s.getId());
		System.out.println("Name is --"+s.getName());
		System.out.println("RollNumber is --"+s.getRollno());
	}
	
	public void searchEmployee(Employee e) {
		System.out.println("EmployeeId is --"+e.getEmployeeId());
		System.out.println("EmployeeName is --"+e.getEmployeeName());
		System.out.println("EmployeeSalary is --"+e.getSalary());
		System.out.println("EmployeeDepartment is --"+e.getDepartment());
		System.out.println("EmployeeDesignation is --"+e.getDesignation());
	}
}
