<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	 <%@ include file="navbar.jsp" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Add Car Data </title>

<style>
table {
	border-collapse: separate;
	border-spacing: 0 15px;
}

body {
	background-image: url("https://wallpapercave.com/wp/wp1953232.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

input{

font-size: 20px ;

}
</style>

</head>
<body>

	<fieldset style="font-size: 20px ; color:red;" >
		<legend>Enter car data</legend>

		<form action="./addCar" method="post" style=" color:white;">

			<table>

				<tr>
					<td>Car ID:</td>
					<td><input type="number" name="carId"></td>
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

			</table>
			
			<input type="submit" value="Submit" style="text-align: center; font-size: 30px;">
		</form>
	</fieldset>


</body>
</html>