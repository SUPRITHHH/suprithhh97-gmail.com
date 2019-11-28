package com.tyss.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class UpdateWithTryResource {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
		
		try {
			
			reader = new FileReader("db.properties");

			Properties prop = new Properties();
			prop.load(reader);
			//Driver driver = new Driver();
			prop.getProperty("driver-class-name");
			String url = prop.getProperty("url");
			String sql = prop.getProperty("update-query");
	        try(Connection conn = DriverManager.getConnection(url, prop);
					Statement stmt = conn.createStatement()){
			  int i = stmt.executeUpdate(sql);
	        System.out.println(i+" Rows updated");
	        }
	        }catch(Exception e) {
				e.printStackTrace();
	        }
		}

}

