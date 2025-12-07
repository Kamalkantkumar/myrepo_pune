<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Amit</title>
</head>
<body>
<h1>AMit</h1>
<% int a = 344 ;%>
<%= a %>
<form action="/PracticeJSP/LearningJSP" method="post">

Name:<input type="text" name="username"> <br><br>
Password:<input type="password" name="password"> <br><br>

Submit:<input type="submit" value="SUBMIT">

</form>

</body>
</html>