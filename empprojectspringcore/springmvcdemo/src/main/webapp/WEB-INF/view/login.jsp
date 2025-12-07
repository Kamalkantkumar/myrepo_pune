<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg");%>
    <%String str =(String) request.getAttribute("error"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>	
	
	<%
	if(str!=null){ %>
	<h3 style="color:red"> <%=str %></h3><%} %>
	
	<%if(msg!=null){
		%><h3 style="color:blue;"><%=msg %></h3><%} %>
	
	<fieldset>
		<legend>login form</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td><label>Enter your id :</label></td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td><label>Enter your password :</label></td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
				<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>