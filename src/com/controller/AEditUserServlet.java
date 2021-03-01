package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AUserBean;
import com.dao.AUserDao;


@WebServlet("/AEditUserServlet")
public class AEditUserServlet extends HttpServlet{

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AUserDao userDao = new AUserDao();
		int userId = Integer.parseInt(request.getParameter("userId"));
		
		 
		AUserBean user	=	userDao.getDataByUserId(userId);
		
		request.setAttribute("user", user);
		RequestDispatcher rd = request.getRequestDispatcher("AEditUser.jsp");
		rd.forward(request, response);
		
	}
}
