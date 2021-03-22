package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCookieServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cname = request.getParameter("cname");
		String cvalue = request.getParameter("cvalue");
		
		Cookie c = new Cookie(cname, cvalue);
		c.setMaxAge(60*60*24);
		response.addCookie(c);
		
		response.sendRedirect("InputCookie.jsp");
		
		
	
	}

}
