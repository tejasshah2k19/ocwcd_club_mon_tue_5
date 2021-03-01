package com.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		String cEmail = config.getInitParameter("email");
		String cPassword = config.getInitParameter("password");

		String globalEmail = context.getInitParameter("email");

		if (email.equalsIgnoreCase(cEmail) && password.equals(cPassword)) {

			request.getRequestDispatcher("SHome.jsp").forward(request, response);
		} else {

			request.setAttribute("msg", "Invalid Credentials");
			request.getRequestDispatcher("SLogin.jsp").forward(request, response);

		}

	}

}
