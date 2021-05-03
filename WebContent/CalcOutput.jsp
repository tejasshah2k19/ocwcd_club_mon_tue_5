<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- page request session
	app|user userwise copy userName application app|general 1 copy applicationName -->


	<c:url value="Calc.jsp" var="myurl"></c:url>
	<br>
	<BR>
	<a href="${myurl}">Calc</a>
	<br><br>
	
	<c:catch var="e">
		<c:choose>
			<c:when test='${param.operation ==   "add" }'>
				<c:out value="${param.n1 + param.n2}"></c:out>
			</c:when>

			<c:when test='${param.operation == "-"}'>
				<c:out value="${param.n1 - param.n2}"></c:out>
			</c:when>


			<c:when test='${param.operation == "*"}'>
				<c:out value="${param.n1 * param.n2}"></c:out>
			</c:when>

			<c:when test='${param.operation == "/"}'>
				<c:out value="${param.n1 / param.n2}"></c:out>
			</c:when>

			<c:otherwise>
			Please Select Operation
		</c:otherwise>
		</c:choose>

		<br>
		<Br>


		<c:if test='${param.operation ==   "add" }'>
			<c:out value="${param.n1 + param.n2}"></c:out>
		</c:if>


	</c:catch>
	<br>
	<br>
	<c:if test="${e != null}">
		<b>Error:${e}</b>
		<br>
		<b>Error: ${e.message}</b>
	</c:if>



</body>
</html>