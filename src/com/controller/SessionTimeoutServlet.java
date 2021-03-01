package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionTimeoutServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int timeOut = Integer.parseInt(request.getParameter("timeout"));// 10 minutes 

		HttpSession session = request.getSession();

		session.setMaxInactiveInterval(60 * timeOut);// timeOut inactive...
		// request.setAttribute --> forward
		// forward [rd]
		response.sendRedirect("SessionHome.jsp");//current request destroy - and generate new 
	}

}
