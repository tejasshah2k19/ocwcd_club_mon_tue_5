<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" session="false"  info="jsp page info"   buffer="8kb" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%//session%>

	<%!int a;//instance --class level

	public void jspInit() {
		System.out.print("init method called ...from ALogin.jsp");
	}

	void add() {

	}%>

	<%
		int a;//service
	%>

	<h2>Login</h2>

	Email :
	<input type="text" name="email" />
	<br> Password :
	<input type="password" name="pwd" />
	<br>

	<input type="submit" value="Login" />

	<br> ${msg}

</body>
</html>