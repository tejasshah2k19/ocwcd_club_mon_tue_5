package com.filter;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FSignupServletFilterRegex implements Filter {

	public void init(FilterConfig arg0) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		String email = request.getParameter("email");

		// XXX@xxx.xxx
		// ^[A-Za-z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}$"

		String regex = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}$";
		Pattern p = Pattern.compile(regex);

		// Pattern
		// Matcher
		Matcher m = p.matcher(email);
		if (m.matches() == false) {
			request.setAttribute("emailError", "Please Enter Valid Email");
			request.setAttribute("emailValue", email);
			request.getRequestDispatcher("FSignup.jsp").forward(request, response);

		} else {
			chain.doFilter(request, response);
		}
	}

	public void destroy() {

	}
}
