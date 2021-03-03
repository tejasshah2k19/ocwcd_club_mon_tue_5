<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<a href="DbListProductServlet">List Products</a>
	<br>
	<form action="DbUpdateProductServlet">
		<input type="hidden" name="productId" value="${productBean.productId}"/>
	
		ProductName : <input type="text" name="productName" value="${productBean.productName}" /><br> Price
		: <input type="text" name="productPrice" value="${productBean.price}" /><br> <input
			type="submit" value="Update Product" />
	</form>
	${msg }
</body>
</html>