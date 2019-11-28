package com.tyss.assignmentbeanobject.student;

import com.tyss.assignmentbeanobject.employee.DataBase;
import com.tyss.assignmentbeanobject.employee.Employee;

public class Test {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1230456);
		student.setName("SUPRITH");
		student.setRollno(10);
		
		DataBase db = new DataBase();
		db.searchStudent(student);
		
		Employee employee = new Employee();
		employee.setEmployeeId(1245987);
		employee.setEmployeeName("PRAMOD");
		employee.setSalary(200000);
		employee.setDepartment("Development");
		employee.setDesignation("Software Developer");

		db.searchEmployee(employee);
	}

}
