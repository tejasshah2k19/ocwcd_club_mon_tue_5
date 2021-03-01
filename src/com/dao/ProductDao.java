package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.ProductBean;
import com.util.DbConnection;

public class ProductDao {

	public ArrayList<ProductBean> getAllProducts() {

		ArrayList<ProductBean> products = new ArrayList<>();

		try (Connection con = DbConnection.getConnection();
				PreparedStatement pstmt = con
						.prepareStatement("select productId as pid,price,productName from product");) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) { // next record -> true
				ProductBean productBean = new ProductBean();
				productBean.setProductId(rs.getInt("pid"));
				productBean.setProductName(rs.getString("productName"));
				productBean.setPrice(rs.getInt("price"));
				products.add(productBean);
			}

		} catch (Exception e) {
			System.out.println("productDao -> getAllProducts()");
			e.printStackTrace();
		}

		return products;
	}

	public boolean addProduct(ProductBean productBean) {

		try (Connection con = DbConnection.getConnection();

				PreparedStatement pstmt = con
						.prepareStatement("insert into product (productName,price) values (?,?)");) {
			pstmt.setString(1, productBean.getProductName());
			pstmt.setInt(2, productBean.getPrice());

			int records = pstmt.executeUpdate();// int -- insert update delete -- data [dml]
			if (records == 0) {
				return false;
			} else {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean deleteProduct(int productId) {

		try (Connection con = DbConnection.getConnection();

				PreparedStatement pstmt = con.prepareStatement("delete from product where productId = ? ");) {
			pstmt.setInt(1, productId);

			int records = pstmt.executeUpdate();// int -- insert update delete -- data [dml]
			if (records == 0) {
				return false;
			} else {
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}
