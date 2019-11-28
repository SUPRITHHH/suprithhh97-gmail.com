package com.tyss.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.html")

public class LoginPageServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		
		String id = "";
		Cookie[] cookies = req.getCookies();
		if(cookies!=null) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals("alwaysRemember")) {
				id = cookie.getValue();
			}
		 }
		}
		out.println("<html>");
		out.println("<form action='./login' method='post'>");
		out.println(" <table>");
		out.println(" <tr>");
		out.println(" <td>ID</td>");
		out.println("<td><input name='id' type='number' value='"+id+"'></td>");
		out.println(" </tr>");
		out.println(" <tr>");
		out.println(" <td>Password</td>");
		out.println("<td><input name='password' type='password'></td>");
		out.println("</tr>");
		out.println(" <tr>");
		out.println("<td><input type='checkbox' name='RememberMe' value='checked' >Remember Me</td>");
		out.println(" </tr>");
		out.println("<tr>");
		out.println("<td><input type='reset' value='reset' name='reset'></td>");
		out.println("<td><input type='submit'  value='login' name='login'></td>");
		out.println(" </tr>");
		out.println("</table>");
		out.println("</form>");
		out.println("<a href='./register.html'>Register</a>");
		out.println("</html>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		   doGet(req,resp);
	}
}
