<%@page import="com.te.springmvcdemo.dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="nav.jsp" %>
    <% String error =(String) request.getAttribute("error");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br><br>
<%if(error!=null){ %>
<h3 style="color: red"><%=error %><%} %></h3>
<br><br>
	<form action="./search" method="post">
		<label>Enter the id :</label>
		<input type="number" name="empId"/>
		<input type="submit" value="search">
	</form>
	<br>
	    <%Employee employee=(Employee)request.getAttribute("msg");
    		if(employee!=null)
    		{
    		%>
	
	<h3>Your Id is :<%=employee.getId() %></h3>
	<h3>Your Name is :<%=employee.getName() %></h3>
	<h3>Your Address is :<%=employee.getAddress() %></h3>
	<h3>Your Password is :<%=employee.getPassword() %></h3><%} %>
</body>
</html>