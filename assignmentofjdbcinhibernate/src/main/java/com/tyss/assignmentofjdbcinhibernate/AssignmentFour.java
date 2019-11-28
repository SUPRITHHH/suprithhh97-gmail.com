package com.tyss.assignmentofjdbcinhibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class AssignmentFour {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url); 

			String sql = "insert into employee_info values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			
			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);
			
			String name = args[1];
			pstmt.setString(2, name);
			
			String salary = args[2];
			int sal = Integer.parseInt(salary);
			pstmt.setInt(3, sal);
			
			String gender = args[3];
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			
		System.out.println(count+" Row inserted");

		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}if(pstmt != null) {
					pstmt.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}


	}
}
