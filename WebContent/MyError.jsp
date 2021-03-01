<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		//9 implicit 
		//application [ ServletContext]
		//config     [ServletConfig ]
		//exception  [ Exception ]
		//out    [ PrintWriter ]
		//page   [ local ]
		//pageContext [this]
		//request [HttpServletRequest]
		//response [HttpServleResponse]
		//session [HttpSession]
	%>
	<h2>Something Went wrong please try after some-time</h2>
	<br>
	<br>
	<%=exception.getMessage()%>
	<br>
	<br>
	<br>
	<%=exception.getClass().getName()%><br>
	<br>
	<BR>

	<%
		//sendMailToDeveloper(exception); 
		if (exception.getClass().getName().equals("java.lang.ArithmeticException")) {
			out.print("Please dont enter zero in division operation");
		} else if (exception.getClass().getName().equals("java.lang.NullPointerException")) {

			out.print("Some resources are not available please try after sometimes....");
		}
	%>

</body>
</html>