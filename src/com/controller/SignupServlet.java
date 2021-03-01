package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//controller 

//Servlet --- interface 
//GenericServlet ---class 
//HttpServlet -- class 
public class SignupServlet extends HttpServlet {

	// init
	// constructor

	public SignupServlet() {
		System.out.println("SignupServlet Constructor....");
	}

	public void init() throws ServletException {
		System.out.println("init() - SignupServlet");
		// open connection
	}

	// http web
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("singnup request received.....");

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");
		String lang[] = request.getParameterValues("lang");
		String country = request.getParameter("country");

		System.out.println("FirstName => " + firstName);
		System.out.println("Email => " + email);
		System.out.println("Password => " + password);

//		System.out.println("Length===========");
//		System.out.println(firstName.length());
//		System.out.println(firstName.trim().length());

		boolean isError = false;
		String error = "";
		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter FirstName<br>";
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter Email<br>";
		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter Password<br>";

		}

		if (lang == null) {
			isError = true;
			error = error + "Please Enter Language<br>";

		}

		// validation
		// dbinsert -->
		// connection => insert

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");// MIME
		out.print("<html>");
		out.print("<body>");

		if (isError == false) {
			out.print("Welcome.......<br>");
			out.print("FirstName = " + firstName);
			out.print("<br>Email = " + email);
			out.print("<br>Language = ");
			for (String x : lang) {
				out.print(x + ", ");
			}
			out.print("<br>Country = " + country);
		}else {
			out.print(error);
		}

		out.print("</body>");
		out.print("</html>");

	}

	public void destroy() {
		System.out.println("destroy() ---SignupServlet");
		// connection => close
	}

}

//extends Thread
//run 	