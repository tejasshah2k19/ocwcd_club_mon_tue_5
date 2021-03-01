<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String firstNameError = (String) request.getAttribute("firstNameError"); //null
		String emailError = (String) request.getAttribute("emailError");
		String passwrodError = (String) request.getAttribute("passwordError");
	%>


	<form action="saveuser2">
		FirstName : <input type="text" name="firstName" />
		<%=firstNameError == null ? "" : firstNameError%>

		<br> Email : <input type="text" name="email" />
		<%=emailError == null ? "" : emailError%>

		<br> Password : <input type="password" name="pwd" />
		<%=passwrodError == null ? "" : passwrodError%>
		<br> Language : English :<input type="checkbox" name="lang"
			value="eng" /><br> Hindi : <input type="checkbox" name="lang"
			value="hindi" /><br> Gujarati : <input type="checkbox"
			name="lang" value="guj" /><br> Country : <select name="country">
			<option value="-1">Select Country</option>

			<option value="in">India</option>

			<option value="us">USA</option>
			<option value="uk">UK</option>

		</select> <br> <input type="submit" value="Signup" />

	</form>

	<br>


</body>
</html>