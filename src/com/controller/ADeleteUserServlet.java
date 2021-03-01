package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AUserDao;

@WebServlet("/ADeleteUserServlet")
public class ADeleteUserServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		int userId = Integer.parseInt(request.getParameter("userId"));

		AUserDao dao = new AUserDao();
		
		dao.deleteUser(userId);
		
		RequestDispatcher rd = request.getRequestDispatcher("AListUserServlet");
		rd.forward(request, response);
		
		
	}
}