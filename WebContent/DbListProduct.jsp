<%@page import="com.bean.ProductBean"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
		<tr>
			<th>ProductId</th>
			<th>ProductName</th>
			<th>Price</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${products}" var="p">
			<tr>
				<td>${p.productId}</td>
				<td>${p.productName}</td>
				<td>${p.price}</td>
				<td>Edit | Delete</td>
			</tr>
		</c:forEach>
	</table>

	<%-- 
	<%
		ArrayList<ProductBean> products = (ArrayList<ProductBean>) request.getAttribute("products");
	%><br> ${msg}
	<br>
	<br>
	<a href="DbAddProduct.jsp">Add Product</a>
	 
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
					| <a href="DbEditProductServlet?productId=<%=p.getProductId()%>">
						Edit</a> |</td>
			</tr>

			<%
				}
			%>

	</form>
 --%>







</body>
</html>