<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
		<a href="/create">create a cookie</a>

	<%String res=(String)request.getAttribute("msg"); %>
	<%if(res!=null) {%>
	<h3 style="color:green"><%=res %></h3><%} %>
</body>
</html>