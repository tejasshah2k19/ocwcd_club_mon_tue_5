<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="ctag" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	 <c:if test="sds">
	 	sdf 
	 </c:if>
	
	<c:greet />
	<br>
	<c:sqr num="5" />
	<br>
	<c:sqr num="10"></c:sqr>
	<br>

	<c:print>hey i am from print tag</c:print><br> 
	
	
	<c:printloop count="5">Royal<br></c:printloop>
	<br>
	<c:upper>Royal educATion</c:upper>
	<br>
	Hi....




</body>
</html>