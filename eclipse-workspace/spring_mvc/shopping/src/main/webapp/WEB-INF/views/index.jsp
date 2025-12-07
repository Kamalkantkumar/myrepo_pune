<%@page import="java.util.Iterator"%>
<%@page import="com.technoelevate.shopping.dto.CarClass"%>
<%@page import="java.util.List"%>
<%@ include file="navigator.jsp" %>
<%
List<CarClass> list = (List) request.getAttribute("msg");
%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<style type="text/css">
#cars {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#cars td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#cars tr:nth-child(even){background-color: #f2f2f2;}

#cars tr:hover {background-color: #ddd;}

#cars th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}



</style>

</head>
<body

	style="background-image: url('https://media.istockphoto.com/photos/round-podium-or-pedestal-with-blue-background-picture-id1226478932?b=1&amp;k=20&amp;m=1226478932&amp;s=170667a&amp;w=0&amp;h=hXsvxQilNanpKx7QC_tIsFUOKPl8fdIDfJ_QSKXesGE='); background-size: 100%">
	<!-- <img alt="not found" -->
	<!-- 	src="https://www.carlogos.org/car-logos/hyundai-logo.png"
		style="width: 3cm; height: 3cm"> -->
	<%-- <h1>car details</h1>
	<%=list %>
	<h3>${msg}</h3><br> --%>
	
	
	<table id="cars" style="padding-left:500px ">
	<tr>
	<th></th>
	<th>Name</th>
	<th>Company</th>
	<th>Fuel Type</th>
	<th>Power Steering</th>
	<th>Break System</th>
	<th>Showrrom Price</th>
	<th>Onroad Price</th>
	
	<th>Mileage</th>
	<th>Seating Capacity</th>
	<th>Engine Capacity</th>
	<th>Gear Type</th>
	</tr>
	<%
	for (CarClass car : list) {
	%>
	<tr>
	<%-- <td><h2><a href="<%=car.getImage_url()%>"></a></h2></td> --%>
	<%String s=car.getImage_url(); %>
	<td><img src="<%=s %>" alt="Image not inserted" width="180cm" height="100cm"></td>
	<td><%=car.getName()%></td>
	<td><%=car.getCompany()%></td>
	<td><%=car.getFuel_type()%></td>
	<td> <%=car.getPower_steering() %> </td>
	<td><%=car.getBreak_system() %></td>
	 <td><%=car.getShowroom_price() %></td> 
	<td><%=car.getOnroad_price() %></td>
	
	<td><%=car.getMilage() %></td>
	<td><%=car.getSeating_capacity() %></td>
	<td><%=car.getEngine_capacity() %></td>
	<td><%=car.getGear_type() %></td>
	<%
	}
	%>
	</tr>
	
	</table>

</body>
</html>
