package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateSalaryServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

		String name = request.getParameter("name");
		String bs = request.getParameter("bs");

		int basic = Integer.parseInt(bs);

		int hra = (int)(basic * 0.07);
		int da = (int)(basic * 0.06);
		int totalSalary = basic + hra + da; 

		
		//set data in request scope 
		//key -- value 
		//name -- value 
		request.setAttribute("userName", name);
		request.setAttribute("bs", basic);
		request.setAttribute("hra", hra);
		request.setAttribute("da", da);
		request.setAttribute("ts", totalSalary);
		
		//Servlet --> resource --> Jsp/servlet/html 
		RequestDispatcher rd = request.getRequestDispatcher("OutputSalary.jsp");
		rd.forward(request, response);
	}
}
