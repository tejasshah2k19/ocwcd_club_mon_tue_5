<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>

	<form action="DBSignupServlet" method="post">
		FirstName : <input type="text" name="firstName"
			value="${firstNameValue}" /> ${firstNameError} <br> Email : <input
			type="text" name="email" value="${emailValue}" /> ${emailError } <br>
		Password : <input type="password" name="password" /> ${passwordError }
		<br> <input type="submit" value="Signup" />

	</form>

</body>
</html>