
	<%@page import="com.technoelevate.salarypredictor.dto.Salary"%>
    <% Salary s=(Salary) request.getAttribute("msg"); %>
<%Integer i=s.getSalary(); %>
<%Integer j= i/12; %>
<%Integer k= (j/10); %>
<%Integer ins=500; %>
<%Double tax=j*0.05; %>
<%Double sal=j-(ins+tax+k); %>

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
<body>


<h1  style="color:red;text-align:center ">Welcome to Technoelevate</h1>

<table id=cars>

<tr>
<th>Name</th>
<th>Annual Salary</th>
<th>Monthly Salary</th>
<th>Provident Fund</th>
<th>Insurance</th>
<th>Taxes</th>
<th>Hand Salary</th>
</tr>

<tr>
<td>  <%=s.getName() %></td>
<td> <%=s.getSalary() %></td>
 <td><%=s.getSalary()/12 %></td>
  <td><%= k %></td>
   <td><%= ins %></td>
     <td><%= tax %></td>
          <td><%= sal %></td>
</tr>

</table>

</body>

</html>