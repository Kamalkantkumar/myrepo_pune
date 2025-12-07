<%@page import="com.te.jspmvc.bean.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <p> you have login successfully!!!!</p>
   <% StudentBean bean=(StudentBean)request.getAttribute("bean"); 
   out.print("welcom"+bean.getName());
   %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>