package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.DbConnection;

public class DBSignupServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		try {
			Connection con = DbConnection.getConnection();// connection
			PreparedStatement pstmt = con
					.prepareStatement("insert into user (firstName,email,password) values (?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(3, password);
			pstmt.setString(2, email);

			int i = pstmt.executeUpdate();// query -- db --- execute
			System.out.println(i + " record inserted...");

			con.close();
			pstmt.close();
			response.sendRedirect("DbSignup.jsp");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
