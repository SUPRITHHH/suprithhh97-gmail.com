package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuerry {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "update employee_info set name = 'SANTOSH', sal = 15000 , gender ='male' where id = 70";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count +" Row affected");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}if(stmt != null) {
					stmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		

	}
}
