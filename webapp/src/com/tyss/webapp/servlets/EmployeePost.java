package com.tyss.webapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmployeePost  extends HttpServlet {

	Connection conn = null;
    PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		try {
			
			resp.setContentType("text/html");
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			String url =  "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
			Connection conn = DriverManager.getConnection(url);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from employee_info where id ="+id+"");
			PrintWriter out = resp.getWriter();
			out.println("<html><body><table border = '1'><tr><td>id</td><td>name</td><td>sal</td><td>gender</td></tr>");
			if(rs.next()) {
				int emp_id = rs.getInt("id");
				int sal = rs.getInt("sal");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				out.println("<tr><td>"+emp_id+"</td><td>"+name+"</td><td>"+sal+"</td><td>"+gender+"</td></tr>");
			}
				
			out.println("</table></body></html>");
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(conn != null) {
					conn.close();
				}
				if(pstmt != null){
					pstmt.close();
				}if(rs != null) {
					rs.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
