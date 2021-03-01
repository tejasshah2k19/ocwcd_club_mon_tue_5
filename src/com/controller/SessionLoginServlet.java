package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String userName = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("isLogin", true);
		session.setAttribute("userName", userName);
		String url = "SessionHome.jsp";
		response.sendRedirect(response.encodeURL(url));
		
	}

}
