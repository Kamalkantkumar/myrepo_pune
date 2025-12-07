<%@page import="com.technoelevate.shopping.dto.DetailsDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="navigator.jsp" %>
    <%DetailsDto dto=(DetailsDto) request.getAttribute("msg"); %>
    <%String s=dto.getUrl(); %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table, th, td {
  border: 1px solid black;
  border-radius:15px;
  color:white;  
}
.center {
  margin-left: auto;
  margin-right: auto;
  background-image:url('https://wallpapercave.com/wp/wp2577110.jpg');
}
</style>
<meta charset="ISO-8859-1">
<title>profile</title>
</head>
<body>
<%-- <img src="<%=s %>" style="height:180px; border-radius: 50%; border: 8px solid #FEDE00;padding-left:500px " 
alt="This is a small profile image of Digital Ocean’s mascot, a blue smiling shark."> --%>

<table class="center"  >
<tr>
<th colspan="2"><img alt="" src="<%=s %>" height="300cm" width="300cm"></th>
</tr>

<tr>
<td><h3>Name:</h3></td>
<td><h3> <%=dto.getName() %></h3> </td>
</tr>
<tr>
<td><h3>Number:</h3></td>
<td><h3> <%=dto.getNumber() %></h3> </td>
</tr>
<tr>
<td><h3>Email:</h3></td>
<td><h3> <%=dto.getEmail() %></h3> </td>
</tr>
<tr>
<td><h3>Date of Birth :</h3></td>
<td><h3> <%=dto.getDob()%></h3> </td>
</tr>
<tr>
<td><h3>Gender :</h3></td>
<td><h3> <%=dto.getGender() %></h3> </td>
</tr>



</table>


</body>
</html>