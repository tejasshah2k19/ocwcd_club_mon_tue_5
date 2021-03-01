<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:include page="SessionHeader.jsp" />
<body>
	<%
		if (session == null || session.getAttribute("isLogin") == null) {
			request.setAttribute("msg", "your session was expired...please login again..");
			request.getRequestDispatcher("SessionLogin.jsp").forward(request, response);
		}
	%>



	<form action="SessionTimeoutServlet">
		Session Time out (minutes) : <input type="text" name="timeout" /><br>

		<input type="submit" value="Set My TimeOut" />
	</form>
</body>
</html>