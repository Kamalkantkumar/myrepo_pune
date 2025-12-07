<%@page import="com.technoelevate.shopping.dto.DetailsDto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="navigator.jsp" %>
    <%DetailsDto s=(DetailsDto) request.getAttribute("msg");  %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><marquee behavior="scroll" direction="left" style="color:inherit ;background-color:maroon;  ">Welcome To Carwala  !!!!!</marquee></h1>
<h4 style="text-align:right; color:aqua; ">Admin:<%= s.getName() %></h4>



</html>