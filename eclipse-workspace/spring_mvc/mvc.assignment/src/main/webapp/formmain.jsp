<%@page import="com.technoelevate.mvc.assignment.controller.BeanClass"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% BeanClass s=(BeanClass)request.getAttribute("user1"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/form" method="post">
user name :<%=s.getName() %>
</form>
</body>
</html>