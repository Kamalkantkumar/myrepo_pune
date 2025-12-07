<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String name = (String) request.getParameter("first name");
%>
<%
String name1 = (String) request.getParameter("last name");
%>

<%
String pass = (String) request.getParameter("clg");
%>
<%
String pass1 = (String) request.getParameter("branch");
%>
<%
String pass2 = (String) request.getParameter("uid");
%>
<%
String pass3 = (String) request.getParameter("date");
%>
<%
String pass4 = (String) request.getParameter("per");
%>
<%
String pass5 = (String) request.getParameter("loc");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>details</title>
</head>
<body style="background-image:url('https://previews.123rf.com/images/prahprah/prahprah1805/prahprah180500017/100725031-3d-modern-bright-interior-isolated-on-plain-background-.jpg'); ">
	<fieldset>
		<legend>Employee Login Details</legend>
		<form action="education" method="post">
			<table>
				<tr>
					<td><label>first name is: <%=name%></label></td>
				</tr>
				<br>
				<tr>
					<td><label>last name is: <%=name1%></label></td>
				</tr>
				<br>
				<tr>
					<td><label>Password is :<%=pass%></label></td>
				</tr>
				<br>
				<tr>
					<td><label>Mobile Number is :<%=pass1%></label></td>
				</tr>
				<tr>
					<td><label>Aadhar number is :<%=pass2%></label></td>
				</tr>
				<tr>
					<td><label>date of joining is :<%=pass3%></label></td>
				</tr>
				<tr>
					<td><label>percentage is :<%=pass4%></label></td>
				</tr>
				<tr>
					<td><label>location is :<%=pass5%></label></td>
				</tr>
				
				
				
				<tr>
					<td><input type="submit" value="Back"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>