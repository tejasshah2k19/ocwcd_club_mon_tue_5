package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CAddToCartServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pname = request.getParameter("pname");
		Cookie c[] = request.getCookies(); // it will gives you all cookies of current request
		String email = "";
		for (Cookie x : c) {
			if (x.getName().equals("email")) {

				email = x.getValue();
			}
		}

		System.out.println("user -> " + email + " -> added " + pname + " in cart....");
		response.sendRedirect("CHome.jsp");
	}

}
