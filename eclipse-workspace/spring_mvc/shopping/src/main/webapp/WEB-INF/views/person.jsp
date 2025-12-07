<%@page import="com.technoelevate.shopping.dto.DetailsDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="navbar.jsp" %>
    <% DetailsDto msg=(DetailsDto)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>navigational bar</title>
</head>
<body>
<h2 style="color:red;text-align:right;  " >Welcome <%= msg.getName()%>!!!</h2>
<img alt="" src="https://technoelevate.com/images/logo.png">

</body>
</html>