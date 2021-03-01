package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CAddCookie extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cname = request.getParameter("cname");
		String cvalue = request.getParameter("cvalue");

		Cookie c = new Cookie(cname, cvalue);
		c.setMaxAge(60 * 60 * 24);// second
		//default - 1year 
		response.addCookie(c);

		response.sendRedirect("CInputCookie.jsp");

	}

}
