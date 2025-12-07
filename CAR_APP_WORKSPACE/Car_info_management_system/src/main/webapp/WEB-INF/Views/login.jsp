<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ include file="customernavbar.jsp"%>

<%
	String error = (String) request.getAttribute("error");
%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Car</title>

<style>
body {
	background-image: url("https://wallpapercave.com/wp/wp1828672.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
</head>
<body>
	<h6 style="text-align: center;"></h6>

	<%
		if (error != null) {
	%>

	<p style="text-align: center; font-size: 20px; color: white;"><%=error%>
	</p>

	<%
		}
	%>

	<br />
	<br />
	<br />

	<fieldset>
		<legend
			style="text-align: left; font-size: 30px; color: rgb(216, 209, 208)">
			Admin Login </legend>

		<br />

		<form action="./validate" method="post">
			<table>
				<tr style="margin-top: 60px">
					<td style="color: rgb(198, 214, 238); box-sizing: border-box">
						<label
						style="text-align: left; font-size: 30px; color: rgb(173, 219, 183);">Enter
							Admin ID </label>
					</td>
					<td style="color: rgb(46, 97, 173); box-sizing: border-box"><input
						type="number" name="adminId" style="font-size: 20px" /></td>
				</tr>
				<tr>
					<td style="color: rgb(173, 219, 183); column-width: 5cm"><label
						style="text-align: left; font-size: 30px; color: rgb(173, 219, 183);">Enter
							password </label></td>
					<td style="color: rgb(46, 97, 173)"><input type="password"
						name="password" style="font-size: 20px" /></td>
				</tr>

				<tr>
					<td><input type="submit" value="Login"
						style="text-align: left; font-size: 20px" /></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>
