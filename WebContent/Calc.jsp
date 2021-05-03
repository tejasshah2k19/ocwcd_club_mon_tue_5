<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form action="CalcOutput.jsp" method="post">

		N1: <input type="text" name="n1" /> <br> N2:<input type="text"
			name="n2" /> <br> Operation : <br>Add :<input type="radio"
			name="operation" value="add"> <br>Sub :<input
			type="radio" name="operation" value="-"> <br>Mul :<input
			type="radio" name="operation" value="*"> <br>Div :<input
			type="radio" name="operation" value="/"> <br> <br>
		<input type="submit" value="GetAns" />
	</form>
	<br>

</body>
</html>