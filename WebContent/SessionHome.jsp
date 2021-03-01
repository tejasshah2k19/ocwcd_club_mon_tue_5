<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>


	<%@include file="SessionHeader.jsp"%>


	<BR>
	<BR>
	<%=g%>
	<br>
	<BR>


	<%
		//	HttpSession session1 = request.getSession();
		String userName = (String) session.getAttribute("userName");
		if (session == null || session.getAttribute("isLogin") == null) {
			request.setAttribute("msg", "your session was expired...please login again..");
			request.getRequestDispatcher("SessionLogin.jsp").forward(request, response);
		}
	%>

	Welcome ,
	<%=userName%>

	<%
		String sstimeouturl = response.encodeURL("SessionSessionTimeOut.jsp");
	%>
	<br>
	<a href="<%=sstimeouturl%>">Change My Idle Time</a>
	<br>
	<a href="<%=response.encodeURL("RequestHeaderDemoServlet")%>">RequestHeader</a>
	<br>
	<a href="SessionLogoutServlet">Logout</a>

</body>
</html>