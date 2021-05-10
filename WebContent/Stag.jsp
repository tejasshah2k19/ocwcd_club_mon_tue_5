<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="stag" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:greet />
	<br>

	<s:today />
	<br>
	<s:currency amount="7500" type="usd" />
	<br>
	<s:currency amount="8500" type="gbp" />
	<br>
	<s:sum x="10" y="20" />
	<br>
	<s:sum a="5" b="10" c="15" />
	<br>
	<br>
	<bR>

	<s:select table="user" c1="firstName" c2="lastName" />
	<br>
	<br>
	<s:select table="country" c1="countryName" c2="capitalName" />


</body>
</html>