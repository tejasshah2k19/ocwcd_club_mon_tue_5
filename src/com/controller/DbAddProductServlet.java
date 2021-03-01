package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;
import com.util.DbConnection;

public class DbAddProductServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productName = request.getParameter("productName");
		String productPrice = request.getParameter("productPrice");

		// validation

		// convert nonprimit -> primitive
		// nonprimit -> nonprimit
		int productPricI = Integer.parseInt(productPrice);

		ProductBean productBean = new ProductBean();
		productBean.setProductName(productName);
		productBean.setPrice(productPricI);

		ProductDao productDao = new ProductDao();
		if (productDao.addProduct(productBean)) {
			request.setAttribute("msg", "product added");
		} else {
			request.setAttribute("msg", "product not added");
		}

		request.getRequestDispatcher("DbListProductServlet").forward(request, response);
	}

}
