package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddTwoNumbersServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String n1 = request.getParameter("n1");
		System.out.println("n1 ==> " + n1);
		String n2 = request.getParameter("n2");
		boolean isError = false;
		int no1 = 0;
		int no2 = 0;
		if (n1 == null || n1.trim().length() == 0) {
			isError = true;
			request.setAttribute("n1Error", "Please Enter N1");
		} else {
			try {
				no1 = Integer.parseInt(n1.trim());
				request.setAttribute("n1Value", n1);
			} catch (Exception e) {
				request.setAttribute("n1Error", "Please Enter Only Integers");
			}
		}

		if (n2 == null || n2.trim().length() == 0) {
			isError = true;
			request.setAttribute("n2Error", "Please Enter N2");
		} else {
			try {
				no2 = Integer.parseInt(n2.trim());
				request.setAttribute("n2Value", n2);
			} catch (Exception e) {
				request.setAttribute("n2Error", "Please Enter Only Integers");
			}
		}

		RequestDispatcher rd = null;
		if (isError) {
			rd = request.getRequestDispatcher("AddTwoNumbers.jsp");
		} else {
			rd = request.getRequestDispatcher("AddTwoNumbersOutput.jsp");
		}
		rd.forward(request, response);

	}

}
