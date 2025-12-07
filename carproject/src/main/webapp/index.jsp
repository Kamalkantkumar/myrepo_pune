<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
	font-family: Arial;
	background-image:
		url("https://www.imagesjunction.com/images/img/black_background_png.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

.center1 {
	margin: 11;
	position: absolute;
	top: 50%;
	left: 50%;
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}
.center2 {
	margin: 11;
	position: absolute;
	top: 65%;
	left: 50%;
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}

.button {
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 35px;
	margin: 4px 2px;
	cursor: pointer;
}

.button1 {
	background-color: maroon;
}

.button2 {
	background-color: grey;
}
</style>
</head>
<body>

	
	<form action="./login">
		<div class="container1">
		<h2 style="text-align: center; color: white;">Choose the option</h2>
			<div class="center1">
				<button class="button button1" type="submit" >Click
					here to Login as Admin</button>
			</div>
		</div>
	</form>
	
	<form action="./getsearchbar">
		<div class="container2">
			<div class="center2">
				<button class="button button2" >Click
					here to search for cars</button>
			</div>
		</div>
	</form>
	


</body>
</html>
