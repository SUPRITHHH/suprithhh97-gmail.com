package com.testyantra.collectionframework;

public class Employee {

	private final int eid;
	private final String ename;
	private final String  dname;
	
	public Employee(int eid, String ename, String dname) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dname=" + dname + "]";
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getDname() {
		return dname;
	}
	
	
	
	
}
