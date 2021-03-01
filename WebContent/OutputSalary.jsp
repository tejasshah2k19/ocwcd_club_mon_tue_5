<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		//request 
		String userName = (String)request.getAttribute("userName");
		int basic = (Integer)request.getAttribute("bs");
		int hra = (Integer) request.getAttribute("hra");
		int da = (Integer) request.getAttribute("da");
		int ts = (Integer)request.getAttribute("ts");
		
	%>


	<h3>Salary Information</h3>
	Name :  <%=userName %> <BR>
	BasicSalart : <%=basic %> <BR>
	HRA : <%=hra %> <BR>
	DA : <%=da %> <BR> 
	TotalSalary : <%=ts %> <BR> 
	
</body>
</html>