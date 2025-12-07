<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
String name = (String) request.getParameter("first name");
%>
<%
String name1 = (String) request.getParameter("last name");
%>

<%
String pass = (String) request.getParameter("password");
%>
<%
String pass1 = (String) request.getParameter("number");
%>
<%
String pass2 = (String) request.getParameter("uid");
%>
<%
String pass3 = (String) request.getParameter("date");
%>
<%
String pass4 = (String) request.getParameter("religion");
%>
<%
String pass5 = (String) request.getParameter("martial");
%>
<%
String pass6 = (String) request.getParameter("gender");
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
		<form action="personal">
			<table>
				<tr>
					<td><label>first name is:</td>  <td> <%=name%></td> </label>
				</tr>
				<br>
				<tr>
					<td><label>last name is:</td> <td> <%=name1%></td> </label>
				</tr>
				<br>
				<tr>
					<td><label>Password is :</td> <td> <%=pass%></td> </label>
				</tr>
				<br>
				<tr>
					<td><label>Mobile Number is :</td><td><%=pass1%></label>
				</tr>
				<tr>
					<td><label>Aadhar number is :</td><td><%=pass2%></label>
				</tr>
				<tr>
					<td><label>date of birth is :</td><td><%=pass3%></label>
				</tr>
				<tr>
					<td><label>religion is :</td><td><%=pass4%></label></td>
				</tr>
				<tr>
					<td><label>Martial status is :</td><td><%=pass5%></label></td>
				</tr>
				<tr>
					<td><label>gender is :</td><td><%=pass6%></label>
				</tr>



				<tr>
					<td><input type="submit" value="Back"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>