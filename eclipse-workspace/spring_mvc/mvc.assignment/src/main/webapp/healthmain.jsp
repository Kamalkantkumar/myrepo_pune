<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String name = (String) request.getParameter("first name");
%>
<%
String name1 = (String) request.getParameter("last name");
%>

<%
String pass = (String) request.getParameter("uid");
%>
<%
String pass1 = (String) request.getParameter("bgroup");
%>
<%
String pass2 = (String) request.getParameter("bp");
%>
<%
String pass3 = (String) request.getParameter("temp");
%>
<%
String pass4 = (String) request.getParameter("sugar");
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
		<form action="health">
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
					<td><label>Aadhar number is :<%=pass%></label></td>
				</tr>
				<br>
				<tr>
					<td><label>Aadhar Number is :<%=pass1%></label></td>
				</tr>
				<tr>
					<td><label>blood group is :<%=pass2%></label></td>
				</tr>
				<tr>
					<td><label>blood presure is :<%=pass3%></label></td>
				</tr>
				<tr>
					<td><label>temparature is :<%=pass4%></label></td>
				</tr>
								
				
				
				<tr>
					<td><input type="submit" value="Back"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>