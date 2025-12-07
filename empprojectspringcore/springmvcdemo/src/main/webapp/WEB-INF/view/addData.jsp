<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Data</title>
</head>
<body>
	<fieldset>
		<legend>Fill the form </legend>
		<form action="./addData" method="post">
		<table >
			<tr>
				<td><label>Enter the id :</label></td>
				<td><input type="number" name="id"/></td>
			</tr>
			
			<tr>
				<td><label>Enter the name :</label></td>
				<td><input type="text" name="name"/></td>
			</tr>
			
			<tr>
				<td><label>Enter the address :</label></td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td><label>Enter the password :</label></td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
			<td><input type="submit" value="Click Here"/></td>
			</tr>
		</table>
		
	</form>
	</fieldset>
</body>
</html>