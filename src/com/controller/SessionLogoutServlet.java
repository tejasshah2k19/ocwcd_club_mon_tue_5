package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionLogoutServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 HttpSession session = request.getSession();//current session 
		 session.invalidate();//destroy 
		response.sendRedirect("SessionLogin.jsp");

		// requestDispatcher

	}

}
