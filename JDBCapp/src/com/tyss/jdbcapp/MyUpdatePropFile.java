package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class MyUpdatePropFile {
	
public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("db.properties");

			Properties prop = new Properties();
			prop.load(reader);
			//Driver driver = new Driver();
			prop.getProperty("driver-class-name");
			String url = prop.getProperty("url");
			conn = DriverManager.getConnection(url,prop);
            stmt = conn.createStatement();
            String sql = prop.getProperty("update-query");
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count +"Rows updated");
			
			
		}catch(Exception e) {
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

