<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="teamxfunction" prefix="t"%>
<%@taglib uri="adminfunction" prefix="a"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	${t:lappinoz()} , Tejas shah
	<br> ${a:upperConvertor(param.email)}
	<br>
	<br> ${t:len(param.email) }
  

<upper>email</upper>


</body>
</html>