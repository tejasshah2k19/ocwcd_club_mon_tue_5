<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="AddTwoNumbersServlet" method="post">

		N1: <input type="text" name="n1" value="<c:out value='${n1Value}'></c:out>"  />
		<c:out value="${n1Error}"></c:out>
		<br> N2:<input type="text" name="n2" />
		<c:out value="${n2Error}"></c:out>
		<br> <input type="submit" value="add" />
	</form>
	<br>
</body>
</html>