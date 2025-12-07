<%@page import="com.te.springmvcdemo.dto.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String  msg =(String)request.getAttribute("msg"); %>
	<%if(msg!=null){ %>
	<h3 style="color:red;"><%=msg %></h3><% }%>
	
	<%List<Employee> list=(List<Employee>)request.getAttribute("result"); %>
	<%for(Employee emp2:list)
	{	
	%>
	<h2>Id :<%=emp2.getId() %></h2>
	<h2>Name :<%=emp2.getId() %></h2>
	<h2>Address:<%=emp2.getId() %></h2>
	<h2>Password :<%=emp2.getId() %></h2>
	<%} %>
</body>
</html>