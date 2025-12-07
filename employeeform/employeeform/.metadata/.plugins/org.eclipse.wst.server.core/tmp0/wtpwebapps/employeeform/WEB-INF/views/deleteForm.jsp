<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="nav.jsp" %>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
 background-image: linear-gradient(
      115deg,
      rgba(58, 58, 158, 0.8),
      rgba(136, 136, 206, 0.7)
    ),
    url(https://cdn.freecodecamp.org/testable-projects-fcc/images/survey-form-background.jpeg);
    background-size: cover;
    overflow: hidden;
}
 form {
 			margin-top:0px;
            display: flex;
            font-family: 'Poppins', sans-serif;
            justify-content: center;
            
        }
        </style>

</head>
<body>

<form action="<%= request.getContextPath() %>/delete">
<table>

	<tr>
		<td><label style="color:white;">Enter the Emp_id:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="empId" id="empId" placeholder="empId"  required="required"></td>
	</tr>
	
	<tr>
	<td>	
		<input type="submit" style="height: 40px; border-radius: 20px; margin-top: 10px; width: 100px;" value="Delete" ></td>
		
	</tr>
	
	
	</table>
	
</form>

</body>
</html>