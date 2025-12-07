<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="nav.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
	<%String error=(String)request.getAttribute("error"); %>
	<%if(error!=null){ %><h2 style="color:red"><%=error %></h2><%} %>
	<br><br>
	<fieldset>
		<legend>Update form</legend>
		<form action="./update" method="post">
			<tr>
			<td> <label>Enter the id :</label></td>
			<td> <input type="number" name="id"/></td>
		</tr>
		<tr>
			<td> <label>Enter the name:</label></td>
			<td> <input type="text" name="name"/></td>
		</tr>
		<tr><td> <input type="submit" value="update"/></td></tr>
		</form>
			
	</fieldset>
</body>
</html>