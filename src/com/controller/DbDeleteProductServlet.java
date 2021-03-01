package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProductDao;

public class DbDeleteProductServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));

		ProductDao productDao = new ProductDao();
		productDao.deleteProduct(productId);
		request.setAttribute("msg", "Product deleted");
		//response.sendRedirect("DbListProductServlet");
		request.getRequestDispatcher("DbListProductServlet").forward(request, response);
	}

}
