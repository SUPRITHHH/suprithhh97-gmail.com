package com.tyss.jdbcapp;

import java.sql.*;

import com.mysql.jdbc.Driver;



public class ExecuteInsertQuery {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			
			String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url);
			
			String sql = "insert into employee_info values(70,'shweta',20000,'female')";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count +"Rows inserted");
			
			
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

