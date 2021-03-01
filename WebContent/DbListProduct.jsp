<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		ArrayList<ProductBean> products = (ArrayList<ProductBean>) request.getAttribute("products");
	%><br> ${msg}
	<br>
	<br>
	<a href="DbAddProduct.jsp">Add Product</a>
	<form action="DbDelete">
		<table border="1" cellpadding="10px">
			<tr>
				<th>ProductId</th>
				<th>ProductName</th>
				<th>Price</th>
				<th>Action</th>
			</tr>

			<%
				for (ProductBean p : products) {
			%>
			<tr>
				<td><%=p.getProductId()%></td>
				<td><%=p.getProductName()%></td>
				<td><%=p.getPrice()%></td>
				<td><a
					href="DbDeleteProductServlet?productId=<%=p.getProductId()%>">Delete</a>
					| <a href=""> Edit</a> |</td>
			</tr>

			<%
				}
			%>
		</table>

	</form>
</body>
</html>