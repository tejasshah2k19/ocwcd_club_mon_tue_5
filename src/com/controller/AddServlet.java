package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {

	
	
	
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		
		
		
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		String choice  = request.getParameter("choice");
		int no1 = Integer.parseInt(n1);
		int no2 = Integer.parseInt(n2);

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.print("<html><body>");
		
		if(choice.equals("add")) {
			pw.print("Addition = " + (no1 + no2));
		}else if(choice.equals("sub")) {
			pw.print("Subtraction = " + (no1 - no2));
		}
		pw.print("</body></html>");

	}
}
