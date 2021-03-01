package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AUserBean;
import com.dao.AUserDao;

@WebServlet("/ASignupServlet")
public class ASignupServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("pwd");

		// validation
		AUserBean user = new AUserBean();
		user.setFirstName(firstName);
		user.setEmail(email);
		user.setPassword(password);

//		int userId = (int)(Math.random()*100000000);//02521 
//		user.setUserId(userId);
//		
		AUserDao dao = new AUserDao();
		dao.insertUser(user);

		request.setAttribute("msg", "Signup done...");
		RequestDispatcher rd = request.getRequestDispatcher("AListUserServlet");
		rd.forward(request, response);

	}
}
