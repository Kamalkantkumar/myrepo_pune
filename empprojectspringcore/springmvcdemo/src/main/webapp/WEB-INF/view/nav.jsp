<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nav Bar</title>
	<style type="text/css">
	nav{
		background-color:rgba(0,0,0,0.5);
		padding :8px;
		}
		a{
			text-decoration: none;
			margin-left: 55px;
			font-size: 15px;
			color :whitesmoke;
					
		}
		a:hover{
			text-decoration: none;
			margin-left: 55px;
			font-size: 15px;
			color :orange;
		}
	</style>
</head>
<body>
	
	<nav>
		<a href="./addData">add Employee</a>
		<a href="./search">see Employee Details</a>
		<a href="./allDetails">see All Details</a>
		<a href="./update">update Employee</a>
		<a href="./delete">delete Employee</a>
		<a href="./logout">logout</a>
	</nav>
</body>
</html>