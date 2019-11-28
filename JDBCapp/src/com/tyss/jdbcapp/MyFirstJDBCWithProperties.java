package com.tyss.jdbcapp;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.mysql.jdbc.Driver;


public class MyFirstJDBCWithProperties {

	public static void main(String[] args) throws IOException {

		Connection conn = null; 
		Statement stmt = null;
		ResultSet rs = null;
		FileReader reader = null;
		try {

			reader = new FileReader("db.properties");

			Properties prop = new Properties();
			prop.load(reader);
//			Driver driver = new Driver();
			prop.getProperty("driver-class-name");
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
			stmt = conn.createStatement();
			String sql = prop.getProperty("select-query");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int sal = rs.getInt("sal");
				String gender = rs.getString("gender");

				System.out.println("id = "+id);
				System.out.println("name = "+name);
				System.out.println("salary = "+sal);
				System.out.println("gender = "+gender);

			}
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}

				if(stmt != null){
					stmt.close();
				}if(rs != null) {
					rs.close();
				}if(reader != null) {
					reader.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}




	}

}

