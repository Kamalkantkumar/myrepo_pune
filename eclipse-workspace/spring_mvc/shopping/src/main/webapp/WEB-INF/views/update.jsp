<%@page import="com.technoelevate.shopping.dto.CarClass"%>
<%@include file="navigator.jsp"%>
<%
CarClass s1 = (CarClass) request.getAttribute("key");
%>
<%
String car = (String) request.getAttribute("mes");
%>
<%
CarClass car1 = (CarClass) request.getAttribute("messageobj");
%>
<html>

<body
	style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTFisFhZxFbPbqK9fTuA18tr8eYNWQmekd5Q&amp;usqp=CAU'); background-size: 100%">
	<h1 style="color: orange; font-family: sans-serif; text-align: center;">Update
		car details</h1>
	<%-- <%
	if (s1 != null) {
	%>
	<h2 style="color: lime;; text-align: center;">
		Car Id No :<%=s1.getId()%>
		Added Sucessfully
	</h2>
	<%
	}
	%> --%>
	<style>
input {
	width: 310px;
	padding: 0 12px;
	border-radius: 5px;
}

input, input::-webkit-input-placeholder {
	font-size: 12px;
	line-height: 2;
}

label {
	width: 350px;
	padding: 0 15px;
	color: red;
}

label, label::-webkit-input-placeholder {
	font-size: 15px;
	line-height: 2;
}

.center {
	margin: 0;
	float: center;
	top: 50%;
	left: 50%;
	-ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%);
}

.button {
	margin: 0;
	float: center;
	top: 50%;
	left: 60%;
	/* -ms-transform: translate(-50%, -50%);
	transform: translate(-50%, -50%); */
	justify-content: center;
	/*   transform: translate(100%, 100%); */
	margin-left: 690px; font-size : 19px; padding-left : 20px; padding :
	5px 65px;
	size: landscape;
	border-radius: 5px;
	background-color: #555555;
	color: white;
	transform: translate(-50%, -50%);
	justify-content: center;
	font-size: 19px;
	padding-left: 20px;
	padding: 5px 65px;
}
/* .button1 {
  margin: 0;
 float:center;
  top: 50%;
  left: 50%;
  -ms-transform: translate(-50%, -50%);
  transform: translate(-50%, -50%);
  justify-content: center;
  margin-left: 670px;
  font-size:19px;
  padding: 5px 55px;
  border-radius:5px;
} */
</style>
<%if(car1!=null){ %>
	<form action="./updatef" method="post">
		<br> <br>
		<table>
			<tr>

				<td><label>car name</label></td>
				<td><input type="text" name="name" value="<%=car1.getName()%>"></td>
				<td><label>car company</label></td>
				<td><input type="text" name="company"
					value="<%=car1.getCompany()%>"></td>
				<td><label>Fuel Type</label></td>
				<td><input type="text" name="fuel_type"
					value="<%=car1.getFuel_type()%> "></td>
			</tr>

			<tr>
				<td><br> <br></td>
			</tr>
			<tr>

				<td><label>Break System</label></td>
				<td><input type="text" name="break_system"
					value="<%=car1.getBreak_system()%>"></td>
				<td><label>Showroom Price</label></td>
				<td><input type="text" name="showroom_price"
					value="<%=car1.getShowroom_price()%>"></td>
				<td><label>Power Steering</label></td>
				<td><input type="text" name="power_steering"
					value="<%=car1.getPower_steering()%>"></td>
			</tr>

			<tr>
				<td><br> <br></td>
			</tr>

			<tr>

				<td><label>Image Url</label></td>
				<td><input type="text" name="image_url" vlaue="<%=car1.getImage_url()%>"></td>
				<td><label>Milage</label></td>
				<td><input type="text" name="milage" value="<%=car1.getMilage()%>"></td>
				<td><label>Seating Capacity</label></td>
				<td><input type="text" name="seating_capacity"
					value="<%=car1.getSeating_capacity()%>"></td>
			</tr>
			<br>
			<tr>
				<td><br> <br></td>
			</tr>

			<tr>

				<td><label>Gear type</label></td>
				<td><input type="text" name="gear_type" value="<%=car1.getGear_type()%>"></td>
				<td><label>Engine capacity</label></td>
				<td><input type="text" name="engine_capacity"
					value="<%=car1.getEngine_capacity()%>"></td>
					<td><label>id</label></td>
				<td><input type="text" name="id" value="<%=car1.getId()%>"></td>
			</tr>







		</table>

		<br> <br> <br>
		<table>
			<tr>
				<td>
					<button type="submit" class="button">update</button>
				</td>
				<!-- <td> <button  type="reset" class="button1">clear</button></td> -->
			</tr>
		</table>
		<%} %>
	</form>
	<%if(car!=null && !car.isEmpty()){ %>
<h2 style="color:red;text-align:center;padding-left:420px  "><%=car%></h2>
  <%} %>
</body>


</html>