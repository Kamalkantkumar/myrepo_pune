<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%String msg=(String) request.getParameter("msg"); %>

<!DOCTYPE html>
<html>
<head>
<style type="text/css">
label{
color:red;
font-family:sans-serif;  
}
h1,body{
color:yellow; 
text-align:center; 
}
table {
float:50% 	
  
}
.center {
  margin-left: auto;
  margin-right: auto;
}
</style>
<meta charset="ISO-8859-1">
<title>salary predection</title>
</head>
<body
	style="background-image: url('https://venngage-wordpress.s3.amazonaws.com/uploads/2018/09/Colorful-Circle-Simple-Background-Image-1.jpg'); background-size: 100%">

	<h1>Salary Predictor</h1>

<%if(msg!=null && !msg.isEmpty()){ %>
<h2 style="color:red;text-align:center;padding-left:470px "><%=msg%></h2>
  <%} %>


	<form action="./predict" method="post" >
		<table class="center">
			<tr>
				<td><label>Employ Id :</label></td>
				<td><input type="text" name="emp_id" placeholder="Employee Id"></td>
			</tr>
			<tr>
				<td><label>Name :</label></td>
				<td><input type="text" name="name" placeholder="Name"></td>
			</tr>

			<tr>
				<td><label>Mock1 Rating:</label></td>
				<td><select name="Mock1">
						<option>--none--</option>
						<option value="4">Excellent</option>
						<option value="3">Good</option>
						<option value="2">Above Average</option>
						<option value="1">Average</option>
						<option value="0">Below Average</option>

				</select></td>
			</tr>

			<tr>
				<td><label>Mock2 Rating:</label></td>
				<td><select name="Mock2">
						<option>--none--</option>
						<option value="4">Excellent</option>
						<option value="3">Good</option>
						<option value="2">Above Average</option>
						<option value="1">Average</option>
						<option value="0">Below Average</option>

				</select></td>
			</tr>

			<tr>
				<td><label>Mock3 Rating:</label></td>
				<td><select name="Mock3">
						<option>--none--</option>
						<option value="4">Excellent</option>
						<option value="3">Good</option>
						<option value="2">Above Average</option>
						<option value="1">Average</option>
						<option value="0">Below Average</option>

				</select></td>
			</tr>

			<tr>
				<td><label>Mock4 Rating:</label></td>
				<td><select name="Mock4">
						<option>--none--</option>
						<option value="4">Excellent</option>
						<option value="3">Good</option>
						<option value="2">Above Average</option>
						<option value="1">Average</option>
						<option value="0">Below Average</option>

				</select></td>
			</tr>
			<tr>
			<td><input type="submit" value="predict"></td>
			<td><input type="reset"></td>
			
			</tr>



		</table>
	</form>
	

</body>
</html>