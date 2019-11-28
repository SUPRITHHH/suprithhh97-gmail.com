package com.tyss.empwebapp.util;

import com.tyss.empwebapp.dao.EmployeeDAO;
import com.tyss.empwebapp.dao.EmployeeDAOJdbcImpl;

public class EmployeeDAOManager {

	private EmployeeDAOManager() {}
	
	public static EmployeeDAO getEmployeeDAO() {
		
		return (EmployeeDAO) new EmployeeDAOJdbcImpl();
	}
}
