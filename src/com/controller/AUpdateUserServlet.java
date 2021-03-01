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

@WebServlet("/AUpdateUserServlet")
public class AUpdateUserServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int userId = Integer.parseInt(request.getParameter("userId"));

		String firstName = request.getParameter("firstName");

		String email = request.getParameter("email");

		AUserBean user = new AUserBean();
		user.setUserId(userId);
		user.setFirstName(firstName);
		user.setEmail(email);

		AUserDao userDao = new AUserDao();
		userDao.updateUser(user);

		RequestDispatcher rd = request.getRequestDispatcher("AListUserServlet");
		rd.forward(request, response);

	}
}
