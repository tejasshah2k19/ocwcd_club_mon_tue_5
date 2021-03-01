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
		String nameError = (String) request.getAttribute("nameError");
		String cityError = (String) request.getAttribute("cityError");
		//String salaryError = (String) request.getAttribute("salaryError");
		String designationError = (String) request.getAttribute("designationError");
		String designationValue = (String) request.getAttribute("designationValue");//HR
	%>


	<form action="AddEmployeeServlet">
		Name : <input type="text" name="name" value="${employee.name}" />
		<%=nameError == null ? "" : nameError%>

		<br> City : <input type="text" name="city"
			value="${employee.city}" />

		<%=cityError == null ? "" : cityError%>
		<br> Salary : <input type="text" name="salary"
			value="${employee.salary}" /> ${salaryError}
		<%
			// =salaryError == null ? "" : salaryError
		%>


		<br> Designation : <select name="designation">


			<option value="NA">Select Designation</option>


			<option value="Admin"
				<%=designationValue != null && designationValue.equals("Admin") ? "selected=selected" : ""%>>
				Admin</option>

			<option value="HR"
				<%=designationValue != null && designationValue.equals("HR") ? "selected=selected" : ""%>>HR</option>

			<option value="Faculty"
				<%=designationValue != null && designationValue.equals("Faculty") ? "selected=selected" : ""%>>Faculty</option>


		</select>
		<%=designationError == null ? "" : designationError%>

		<br> <input type="submit" value="AddEmployee" />



	</form>
	<%-- this is jsp comment --%>
	<!-- 	this is html comment -->

	<%
		// this is java comment
	%>


</body>
</html>