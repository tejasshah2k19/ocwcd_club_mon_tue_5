package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignupServlet2 extends HttpServlet {

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

		boolean isError = false;
		String error = "";

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter FirstName<br>";
			request.setAttribute("firstNameError","<font color='red'>Please Enter FirstName</font>");
		}

		if (email == null || email.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter Email<br>";
			request.setAttribute("emailError","Please Enter Email");

		}

		if (password == null || password.trim().length() == 0) {
			isError = true;
			error = error + "Please Enter Password<br>";
			request.setAttribute("passwordError","Please Enter Password");


		}

		if (lang == null) {
			isError = true;
			error = error + "Please Enter Language<br>";

		}

		if(isError == true) {
			//set error -> signup 
 			RequestDispatcher rd = request.getRequestDispatcher("Signup.jsp");
			rd.forward(request, response);//
		}else {
			//home.jsp 
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request, response);//
		}
		
	}

}
