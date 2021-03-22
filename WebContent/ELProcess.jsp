<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	Welcome , ${param.email }<br>
	
	N1: ${param.n1 }<br>
	N2: ${param.n2 }<br>
	 
	Addition = ${param.n1 + param.n2}<br>
	Grater = ${param.n1 gt  param.n2}<br>
	Less = ${param.n1 lt  param.n2}<br>
	Concate =>  ${param.n1}${param.n2}<br>
	JSESSIONID :=>  
	${cookie.JSESSIONID.value }<br>
	
	
	
	
	


</body>
</html>