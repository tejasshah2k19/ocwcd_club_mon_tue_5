<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		int totalAmount = 0;
	%>

	<c:set var="userName" value="${session.user.userName}">

	</c:set>


	welcome,${userName } welcome,
	<c:out value="${userName}"></c:out>

	<c:set var="name" value="royal">
	</c:set>
	<c:out value="name"></c:out>
	<br>

	<c:if test="${5 gt 3 }">
	
		5 is greater 3 
	</c:if>
	<c:if test="${5 lt 3 }">
	
		5 is less than 3 
	</c:if>

	<br>


	<c:choose>
		<c:when test="a">
		</c:when>
		<c:when test="b">
		</c:when>
		<c:when test="c">
		</c:when>
		<c:otherwise>
		</c:otherwise>
	</c:choose>


	<c:forEach var="i" begin="1" end="5" step="1">
		<c:out value="${i}"></c:out>
	</c:forEach>

	<c:forEach items="${products}" var="p">
		${p.productName}
		<c:set var="totalAmount" value="${totalAmount + p.amount}"></c:set>
	</c:forEach>


	<c:forTokens items="1,2,3,4,5,6,7,8" delims="," var="i">
			${i}
	</c:forTokens>








</body>
</html>