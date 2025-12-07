<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ include file="navbar.jsp"%>

<%
	Integer carid = (Integer) request.getAttribute("found");

	String notfound = (String) request.getAttribute("notfound");
	Integer modify = (Integer) request.getAttribute("modified");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify car data</title>

<style>
body {
	background-image:
		url("https://www.wallpapertip.com/wmimgs/3-35503_full-hd-wallpapers-full-hd-background-lamborghini.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

table {
	border-collapse: separate;
	border-spacing: 0 15px;
	margin-left: auto;
	margin-right: auto;
}
</style>

</head>
<body>

	<%
		if (notfound != null) {
	%>

	<p style="text-align: center; color: white;"><%=notfound%></p>

	<%
		}
	%>

	<%
		if (modify != null) {
	%>

	<p style="text-align: center; color: green; font-size: 30px;"><%="Car ID: " + modify + " data modified Successfully !!"%></p>

	<%
		}
	%>

	<form action="./validatecar" method="post"
		style="text-align: center; color: white;">

		<table>

			<tr>
				<td>Enter the Car Id</td>
				<td><input type="number" name="carId"></td>
				<td><input type="submit" value="Search"></td>
			</tr>

		</table>

	</form>

	<%
		if (carid != null) {
	%>

	<fieldset style="text-align: center; color: white;">
		<legend>Modify car data</legend>

		<form action="./modify" method="post">
			<table>

				<tr>
					<td>Car ID:</td>
					<td><input type="text" value="<%=carid%>" name="carId"></td>
				</tr>
				<tr>
					<td>Car name:</td>
					<td><input type="text" name="carName"></td>
				</tr>

				<tr>
					<td>Car company name:</td>
					<td><input type="text" name="carCompany"></td>
				</tr>

				<tr>
					<td>Car fuel type:</td>
					<td><input type="text" name="fuelType"></td>
				</tr>

				<tr>
					<td>Power Steering:</td>
					<td><input type="text" name="steering"></td>
				</tr>

				<tr>
					<td>Car break system:</td>
					<td><input type="text" name="breakSystem"></td>
				</tr>

				<tr>
					<td>Car showroom price:</td>
					<td><input type="number" name="showroomPrice"></td>
				</tr>

				<tr>
					<td>Car onroad price:</td>
					<td><input type="number" name="onroadPrice"></td>
				</tr>

				<tr>
					<td>Car image url:</td>
					<td><input type="text" name="image"></td>
				</tr>

				<tr>
					<td>Car milage:</td>
					<td><input type="number" name="milage"></td>
				</tr>

				<tr>
					<td>Car seating capacity:</td>
					<td><input type="number" name="seatingCapacity"></td>
				</tr>

				<tr>
					<td>Engine Capacity:</td>
					<td><input type="number" name="engine"></td>
				</tr>
				<tr>
					<td>Gear type:</td>
					<td><input type="text" name="gearType"></td>
				</tr>

				<tr>
					<td><input type="submit" value="Modify"
						style="text-align: center; font-size: 30px;"></td>
				</tr>

			</table>


		</form>
	</fieldset>

	<%
		}
	%>


</body>
</html>