<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="nav.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("msg");
	%>
	<%if(name!=null){ %><h1>Welcome  to  Employee Menu &nbsp;<%=name%></h1><%} %>
	<br>
	<%String msg=(String)request.getAttribute("msg1"); %>
		<%if(msg!=null){ %>
			<h1 style="color:green"><%=msg %></h1>
			<%} %>
</body>
</html>