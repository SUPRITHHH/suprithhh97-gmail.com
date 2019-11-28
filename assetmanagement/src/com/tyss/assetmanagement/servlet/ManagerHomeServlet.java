package com.tyss.assetmanagement.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/managerhome")
public class ManagerHomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession(false);
		if(session!=null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/manager.jsp");
			dispatcher.forward(req, resp);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req, resp);
		}
		
	}
	
	
	
}
