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

@WebServlet("/AListUserServlet")
public class AListUserServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		AUserDao dao = new AUserDao();
		ArrayList<AUserBean> users = dao.getAllUsers();
		request.setAttribute("users", users);

		RequestDispatcher rd = request.getRequestDispatcher("AUserList.jsp");
		rd.forward(request, response);

	}
}
