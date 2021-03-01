<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false" isELIgnored="false"
	buffer="8kb" autoFlush="true"
	errorPage="MyError.jsp"	
	%>

<%@page autoFlush="true" info="this is session login jsp"
	import="java.util.Date,java.util.Scanner" import="java.util.Scanner"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%
		Date d = new Date();
		Scanner scr = null;
		int aaa = scr.nextInt();
		out.print(d + "\n\n");
		out.print(this.getClass().getSuperclass());
		int a = 90;
		int b = 0;
		int c = a / b;
		
		//ArithmeticException e 
	
	%>
	
	
	
	<br>
	<form action="SessionLoginServlet">
		UserName: <input type="text" name="userName" /><Br> <input
			type="submit" value="Let me In" />
	</form>
	${msg }
</body>
</html>