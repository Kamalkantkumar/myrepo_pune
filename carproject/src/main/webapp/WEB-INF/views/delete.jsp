<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="navbar.jsp"%>

<%
	Boolean deleted = (Boolean) request.getAttribute("deleted");

	String error = (String) request.getAttribute("notdeleted");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
body {
	background-image:
		url("http://wallpapers.net/web/wallpapers/koenigsegg-agera-r-hd-wallpaper/thumbnail/lg.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

table {
	border-collapse: separate;
	column-gap: 40px;
	border-spacing: 0 15px;
	margin-left: auto;
	margin-right: auto;
}

</style>
</head>
<body>

	<%
		if (deleted != null) {
	%>

	<p style="text-align: center; color: green; font-size: 30px;">"Data deleted
		Successfully !!"</p>

	<%
		}
	%>

	<%
		if (error != null) {
	%>

	<p style="text-align: center; color: red; font-size: 30px;"><%=error%></p>

	<%
		}
	%>
	
	<br><br><br>

	<form action="./delete" method="post"
		style="text-align: center; color: white; height: auto; font-size: 20px;">

		<table>
			<tr>
				<td>Enter the Car Id</td>
				<td><input type="number" name="carId" style=" font-size: 20px"></td>
				<td><input type="submit" value="Delete" style=" font-size: 20px"></td>
			</tr>
		</table>

	</form>

</body>
</html>