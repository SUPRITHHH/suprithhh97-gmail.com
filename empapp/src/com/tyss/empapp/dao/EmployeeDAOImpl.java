package com.tyss.empapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tyss.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeData() {

		String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			rs = stmt.executeQuery(sql);
			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>();
			while(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id = rs.getInt("id");
				bean.setId(id);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);

				result.add(bean);
			}
			return result;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try{
				if(conn != null) {
					conn.close();
				}if(stmt != null) {
					stmt.close();
				}if(rs != null) {
					rs.close();
				}
			}catch(Exception e) {

			}
		}

	}
	
	
	public EmployeeBean searchEmployeeData(int id) {

		String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
		String sql = "select * from employee_info where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			pstmt.setInt(1,id);
			rs = pstmt.executeQuery(sql);


			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();
				int id1 = rs.getInt("id");
				bean.setId(id1);
				String name = rs.getString("name");
				bean.setName(name);
				int sal = rs.getInt("sal");
				bean.setSal(sal);
				String gender = rs.getString("gender");
				bean.setGender(gender);

				return bean;
			}else {
				return null;
			}

		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try{
				if(conn != null) {
					conn.close();
				}if(pstmt != null) {
					pstmt.close();
				}if(rs != null) {
					rs.close();
				}
			}catch(Exception e) {

			}
		}
	}
	
	
	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
		String sql = "insert into employee_info values (?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Id");
			int id = scn.nextInt();
			pstmt.setInt(1, id);
			
			System.out.println("Enter Name");
			String name = scn.next();
			pstmt.setString(2, name);
			
			System.out.println("Enter Salary");
			int sal = scn.nextInt();
			pstmt.setInt(3, sal);
			
			System.out.println("Enter Gender");
			String gender = scn.next();
			pstmt.setString(4, gender);
			
			int count = pstmt.executeUpdate();
			return count;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public int updateEmployeeData(EmployeeBean bean) {
		String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
		String sql = "update employee_info set name=?,sal=?,gender=? where id = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			pstmt = conn.prepareStatement(sql);
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter Id");
			int id = scn.nextInt();
			pstmt.setInt(4, id);
			
			System.out.println("Enter Name");
			String name = scn.next();
			pstmt.setString(1, name);
			
			System.out.println("Enter Salary");
			int sal = scn.nextInt();
			pstmt.setInt(2, sal);
			
			System.out.println("Enter Gender");
			String gender = scn.next();
			pstmt.setString(3, gender);
			
			int count = pstmt.executeUpdate();
			return count;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	@Override
	public int deleteEmployeeData(int id) {
		
		String url = "jdbc:mysql://localhost:3305/ust_ty_db?user=root&password=root";
		String sql = "delete from employee_info where id = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url);
			pstmt.setInt(1,id);
		     
			int count = pstmt.executeUpdate();
			return count;

		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}finally {
			try{
				if(conn != null) {
					conn.close();
				}if(pstmt != null) {
					pstmt.close();
				}
			}catch(Exception e) {
                  e.printStackTrace();
			}
		}
		
	  }
	}

