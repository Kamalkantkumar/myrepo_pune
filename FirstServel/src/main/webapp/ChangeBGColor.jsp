<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
String bgcolor=request.getParameter("bgcolor");
if(bgcolor==null || bgcolor.equals(""))
	bgcolor="white";
%>


<body bgcolor="<%=bgcolor%>">
<form>
Bgcolor:<input type="text" name="bgcolor"><br>
Submit:<input type="submit" value="submit">
</form>

</body>
</html>