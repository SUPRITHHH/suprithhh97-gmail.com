package com.tyss.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.mysql.jdbc.Driver;

public class DynamicDeleteQuery {
	
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
			conn = DriverManager.getConnection(url); 

			String sql = "delete from employee_info where id = ?";
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setInt(1,Integer.parseInt(args[0]) );
			
			int count = pstmt.executeUpdate();

			System.out.println(count+" Rows deleted");

		}catch(Exception e) {
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

