package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CLoginServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		if (password.equals("123")) {

			// userWise
			// HttpSession session = request.getSession();//session => server-> new
			// security
			// privacy
			// credit cvv otp password
			// session.setAttribute("creditCardNum", "1212121121212121");

			Cookie c = new Cookie("email", email);
			response.addCookie(c);

			request.getRequestDispatcher("CHome.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Invalid Credentials");
			request.getRequestDispatcher("CLogin.jsp").forward(request, response);

		}

	}

}
