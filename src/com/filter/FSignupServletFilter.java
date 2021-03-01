package com.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
public class FSignupServletFilter implements Filter {
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("init from signup servlet filter ");
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// logic
		// validation
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean isError = false;
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		}else {
			request.setAttribute("firstNameValue", firstName);
		}
		if (email == null || email.trim().length() == 0) {
			isError = true;
			request.setAttribute("emailError", "Please Enter Email");
		}
		if (password == null || password.trim().length() == 0) {
			isError = true;
			request.setAttribute("passwordError", "Please Enter Password");
		}
		if (isError == true) {
			System.out.println("=====VALIDATION ERROR=====");
			RequestDispatcher rd = request.getRequestDispatcher("FSignup.jsp");
			rd.forward(request, response);
		} else {
			System.out.println("======== VALIDATION PASS======");
			chain.doFilter(request, response);// forward --> next Filter or Servlet
		}

	}

	public void destroy() {
		System.out.println("destroy from singup servlet filter..");
	}
}
