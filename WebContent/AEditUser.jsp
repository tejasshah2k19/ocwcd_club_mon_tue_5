<%@page import="com.bean.AUserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<%
		AUserBean user = (AUserBean)request.getAttribute("user");
	%>

	<form action="AUpdateUserServlet" method="post">
		<input type="hidden" name="userId" value="${user.userId }"/>

		FirstName : <input type="text" name="firstName"
			value="<%=user.getFirstName() %>" /> <br>
			 Email : <input type="text"
			name="email" value="${user.email }" /><br> <input type="submit"
			value="Update" />

	</form>


</body>
</html>