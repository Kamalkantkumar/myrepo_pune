<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.te.carproject.dto.CarInfo"%>
<%@page import="java.util.List"%>
<%@ include file="customernavbar.jsp"%>

<%
	List<CarInfo> list = (List<CarInfo>) request.getAttribute("carList");

	String error = (String) request.getAttribute("error");
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
table, th, td {
	border: 1px solid black;
	column-gap: 40px;
	margin-left: auto;
	margin-right: auto;
	color: white;
}

body {
	font-family: Arial;
	background-image:
		url("https://www.imagesjunction.com/images/img/black_background_png.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

h2 {
	text-align: center;
	color: red;
	font-size: 35px;
}

* {
	box-sizing: border-box;
}

form.example input[type=text] {
	padding: 10px;
	font-size: 17px;
	border: 1px solid grey;
	float: left;
	width: 80%;
	background: #f1f1f1;
}

form.example button {
	float: left;
	width: 20%;
	padding: 10px;
	background: #2196F3;
	color: white;
	font-size: 17px;
	border: 1px solid grey;
	border-left: none;
	cursor: pointer;
}

form.example button:hover {
	background: #0b7dda;
}

form.example::after {
	content: "";
	clear: both;
	display: table;
}
</style>
</head>
<body>


	<%
		if (error != null) {
	%>

	<br>
	<br>
	<h2><%= error %></h2>
	<h2>Please search car by name ,fuel type or company name .</h2>

	<%
		}
	%>

	<p style="text-align: cente; font-size: 20px;">Search for car by Id</p>
	<form class="example" action="./searchresult" method="post"
		style="margin: auto; max-width: 900px">
		<input type="text" placeholder="Search for car.." name="userInput">
		<button type="submit">
			<i class="fa fa-search"></i>
		</button>
	</form>

	<%
		if (list != null) {

			for (CarInfo info : list) {

				String imgUrl = info.getImage_url();
				String name = info.getName();
				String company = info.getCompany();
				String fuelType = info.getFuel_type();
				String breakSys = info.getBreak_system();
				boolean powerSteering = info.isPower_steering();
				double showroomPrice = info.getShowroom_price();
				double onroadPrice = info.getOnroad_price();
				double milage = info.getMilage();
				int seatingCapacity = info.getSeating_capacity();
				int engineCapacity = info.getEngine_capacity();
				String gearType = info.getGear_type();
	%>
	<br>
	<table style="width: 90%;">
		<tr>
			<td><img src="<%=imgUrl%>" alt="<%=name%>" width="600"
				height="333"></td>
			<td style="font-size: 20px;">
				<p>
					Car Name :<%=name%>
				</p>
				<p>
					Car company :<%=company%>
				</p>
				<p>
					Car fuel type :<%=fuelType%>
				</p>
				<p>
					Car power steering :<%=powerSteering%>
				</p>
				<p>
					Car break system :<%=breakSys%>
				</p>
				<p>
					Car showroom price :<%=showroomPrice%>
				</p>
				<p>
					Car onroad price :<%=onroadPrice%>
				</p>
				<p>
					Car milage :<%=milage%>
				</p>
				<p>
					Car seating capacity :<%=seatingCapacity%>
				</p>
				<p>
					Car engine capacity :<%=engineCapacity%>
				</p>
				<p>
					Car gear type :<%=gearType%>
				</p>
			</td>
		</tr>
	</table>

	<%
		}
		}
	%>

</body>
</html>