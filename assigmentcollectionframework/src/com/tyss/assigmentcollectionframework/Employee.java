package com.tyss.assigmentcollectionframework;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	
	
	public Employee(int employeeId, String employeeName, String employeeDepartment) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	
	
	
	
}
