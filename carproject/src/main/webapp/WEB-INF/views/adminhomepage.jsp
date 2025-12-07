<%@page import="com.te.carproject.dto.AdminInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@ include file="navbar.jsp" %>
   
   <%  
   
   AdminInfo info = (AdminInfo)request.getAttribute("userInfo") ;
   
   String carAdded = (String) request.getAttribute("carAdded") ;
   
   String error = (String) request.getAttribute("error");
   
   %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home Page</title>

<style >


body {
	background-image: url("https://wallpaperbat.com/img/325579-black-car-wallpaper-top-free-black-car-background.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>


</head>
<body>

<% if( info != null){ %>

<p style="text-align: center; font-size: 20px; color: white;"><%= "Welcome to Admin page "+info.getAdmin_name() %> </p>

<% } %>

<% if( carAdded != null){ %>

<p style="color: green; text-align: center;"><%= carAdded %> </p>

<% } %>

<% if( error != null){ %>

<p style="text-align: center; "><%= error %> </p>

<% } %>


</body>
</html>