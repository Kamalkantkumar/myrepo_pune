<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@include file="nav.jsp" %>
   <% String res=(String )request.getAttribute("msg"); %>
   <% String error=(String )request.getAttribute("error"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee Data</title>
</head>
<body>
<%if(res!=null)
	{
	%><h3 style="color:green"><%=res %></h3>
	
	<%} %>
	
	<%if(error!=null)
	{
	%><h3 style="color:red"><%=error %>
	
	</h3
	><%} %>
	<br><br>
	<form action="./delete" method="post">
		<label>Enter the Id :</label>
		<input type="number" name="empId"/>
		<input type="submit" value="delete"/>
	</form>

</body>
</html>