<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Enumeration<String> headerNames = (Enumeration<String>) request.getAttribute("headerNames");
	%>

	<%
		while (headerNames.hasMoreElements()) {
			String name = headerNames.nextElement();
			out.print(name + " : " + request.getHeader(name) + "<br>");
		}
	%>


</body>
</html>