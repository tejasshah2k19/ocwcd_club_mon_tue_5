<%@page import="com.bean.AUserBean"%>
<%@page import="java.util.ArrayList"%>
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
		ArrayList<AUserBean> users = (ArrayList<AUserBean>) request.getAttribute("users");
	%>


	<%
	/* 	for (int i = 0; i < users.size(); i++) {

			AUserBean user = users.get(i);
			out.print(user.getFirstName() + " | " + user.getEmail() + " | " + user.getPassword() + "<br>");

		} */
	%>
	<h3>All Users</h3>
	
	<table border="1">
		<tr>
			<th>UserId</th>
			<th>FirstName</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
	
	<%
		for (AUserBean user : users) {
			out.print("<tr>");
			out.print("<td>"+user.getUserId()+"</td><td>"+user.getFirstName() + "</td><td>" + user.getEmail() + "</td><td> " + user.getPassword()+"</td>" );
			out.print("<td><a href='ADeleteUserServlet?userId="+user.getUserId()+"'>Delete</a> | ");
			out.print("<a href='AEditUserServlet?userId="+user.getUserId()+"'>Edit</a></td>");
			
			out.print("</tr>");
		}
	%>mm

</table>

<br>
<a href="ASignup.jsp">Add User</a>

</body>
</html>