package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

public class DbUpdateProductServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		String productPrice = request.getParameter("productPrice");

		int productPricI = Integer.parseInt(productPrice);

		ProductBean productBean = new ProductBean();
		productBean.setProductId(productId);
		productBean.setProductName(productName);
		productBean.setPrice(productPricI);

		ProductDao productDao = new ProductDao();

		if (productDao.updateProduct(productBean)) {
			request.setAttribute("msg", "product updated");
		} else {
			request.setAttribute("msg", "product not updated");
		}

		request.getRequestDispatcher("DbListProductServlet").forward(request, response);

	}

}
