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
	<form action="DbAddProductServlet">
		ProductName : <input type="text" name="productName" /><br> Price
		: <input type="text" name="productPrice" /><br> <input
			type="submit" value="Add Product" />
	</form>
	${msg }
</body>
</html>