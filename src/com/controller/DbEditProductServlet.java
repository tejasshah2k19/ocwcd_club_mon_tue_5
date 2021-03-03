package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

public class DbEditProductServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int productId = Integer.parseInt(request.getParameter("productId"));

		ProductDao productDao = new ProductDao();
		ProductBean productBean = productDao.getProductByProductId(productId);
		if(productBean == null) {
			request.setAttribute("msg", "Invalid Product");
			request.getRequestDispatcher("DbListProductSerlvet").forward(request, response);
			
		}else {
			request.setAttribute("productBean", productBean);
			request.getRequestDispatcher("DbEditProduct.jsp").forward(request, response);
			
		}
	}

}
