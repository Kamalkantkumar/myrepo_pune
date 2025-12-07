<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
* {
	box-sizing: border-box;
}

body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color:black;
}

.topnav a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: white;
}

.topnav a.active {
	background-color: #2196F3;
	color: white;
}

.topnav input[type=text] {
	float: right;
	padding: 8px;
	margin-top: 8px;
	margin-right: 16px;
	border: 10px;
	font-size: 17px;
}

@media screen and (max-width: 600px) {
	.topnav a, .topnav input[type=text] {
		float: none;
		display: block;
		text-align: left;
		width: 100%;
		margin: 0;
		padding: 14px;
	}
	.topnav input[type=text] {
		border: 1px solid #ccc;
	}
}
</style>
</head>
<!--  <body style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTFisFhZxFbPbqK9fTuA18tr8eYNWQmekd5Q&amp;usqp=CAU'); background-size: 100%"><!--  -->

<body
	style="background-imae: url('https://media.istockphoto.com/photos/round-podium-or-pedestal-with-blue-background-picture-id1226478932?b=1&amp;k=20&amp;m=1226478932&amp;s=170667a&amp;w=0&amp;h=hXsvxQilNanpKx7QC_tIsFUOKPl8fdIDfJ_QSKXesGE='); background-size: 100%">

	<div class="topnav">
		<form action="./adminfind" method="post">
			<a class="active"
				href="http://localhost:8888/mvcproject/customersearch.jsp">Home</a>
			<a href="#news">News</a> <a href="#contact">Contact</a> <a
				href="#about">About</a>
			<li><a href="./login">ADMIN?Login</a></li>
			 <input type="text" placeholder="Search.." name="fuel_type">

			<!--  <input type="submit" > -->
		</form>
	</div>
</body>
</html>
