package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmployeeBean;

public class AddEmployeeServlet extends HttpServlet {
	int a;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 25field =>
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String salary = request.getParameter("salary");
		String designation = request.getParameter("designation");

		EmployeeBean employeeBean = new EmployeeBean();
		boolean isError = false;

		if (name == null || name.trim().length() == 0) {
			isError = true;
			request.setAttribute("nameError", "Please Enter Name");
		} else {
//			request.setAttribute("nameValue", name);
			employeeBean.setName(name);

		}

		if (city == null || city.trim().length() == 0) {
			isError = true;
			request.setAttribute("cityError", "Please Enter City");
		} else {
//			request.setAttribute("cityValue", city);
			employeeBean.setCity(city);
		}

		if (salary == null || salary.trim().length() == 0) {
			isError = true;
			request.setAttribute("salaryError", "Please Enter Salary");
		} else {
//			request.setAttribute("salaryValue", salary);
			employeeBean.setSalary(Integer.parseInt(salary));
		}

		if (designation == null || designation.equals("NA")) {
			isError = true;
			request.setAttribute("designationError", "Please Select Designation");
		} else {
			request.setAttribute("designationValue", designation);
			employeeBean.setDesignation(designation);
		}

		request.setAttribute("employee", employeeBean);

		if (isError == true) {

			// sendRedirect --> current request object destroy -- blank new object
			RequestDispatcher rd = request.getRequestDispatcher("AddEmployee.jsp");
			rd.forward(request, response);

		} else {

			RequestDispatcher rd = request.getRequestDispatcher("ViewEmployee.jsp");
			rd.forward(request, response);

		}

	}

}
