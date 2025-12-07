<%@page import="com.technoelevate.shopping.dto.CarClass"%>
<%@include file="navigator.jsp"%>
<%
CarClass s1 = (CarClass) request.getAttribute("key");
%>
<html>

<body
	style="background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSTFisFhZxFbPbqK9fTuA18tr8eYNWQmekd5Q&amp;usqp=CAU'); background-size: 100%">
	<h1 style="color: orange; font-family: sans-serif; text-align: center;">Insert
		car details</h1>
	<%
	if (s1 != null) {
	%>
	<h2 style="color: lime;; text-align: center;">
		Car Id No :<%=s1.getId()%>
		Added Sucessfully
	</h2>
	<%
	}
	%>
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
	 margin-left: 690px; 
	font-size: 19px;
	 padding-left: 20px;
  padding: 5px 65px; 
	size: landscape;
	border-radius: 5px;
	background-color: #555555;
	color: white;
	transform: translate(-50%, -50%);
	justify-content: center;
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
	<form action="./enter" method="post">
		<br> <br>
		<table>
			<tr>
				<td><label>car id</label></td>
				<td><input type="text" name="id" placeholder="car id"
					required="required"></td>
				<td><label>car name</label></td>
				<td><input type="text" name="name" placeholder="car name"
					required="required"></td>
				<td><label>car company</label></td>
				<td><input type="text" name="company" placeholder="car company"
					required="required"></td>
			</tr>

			<tr>
				<td><br> <br></td>
			</tr>
			<tr>
				<td><label>Fuel Type</label></td>
				<td><input type="text" name="fuel_type" placeholder="ex:petrol"></td>
				<td><label>Break System</label></td>
				<td><input type="text" name="break_system"
					placeholder="break system"></td>
				<td><label>Showroom Price</label></td>
				<td><input type="text" name="showroom_price"
					placeholder="showroom price"></td>
			</tr>

			<tr>
				<td><br> <br></td>
			</tr>

			<tr>
				<td><label>Power Steering</label></td>
				<td><input type="text" name="power_steering"
					placeholder="yes/no"></td>
				<td><label>Image Url</label></td>
				<td><input type="text" name="image_url" placeholder="image url"></td>
				<td><label>Milage</label></td>
				<td><input type="text" name="milage" placeholder="milage"></td>
			</tr>
			<br>
			<tr>
				<td><br> <br></td>
			</tr>

			<tr>
				<td><label>Seating Capacity</label></td>
				<td><input type="text" name="seating_capacity"
					placeholder="seating capacity"></td>
				<td><label>Gear type</label></td>
				<td><input type="text" name="gear_type" placeholder="gear type"></td>
				<td><label>Engine capacity</label></td>
				<td><input type="text" name="engine_capacity"
					placeholder="engine_capacity"></td>
			</tr>







		</table>

		<br> <br> <br>
		<table>
			<tr>
				<td>
					<button type="submit" class="button">add</button>
				</td>
				<!-- <td> <button  type="reset" class="button1">clear</button></td> -->
			</tr>
		</table>
	</form>
</body>


</html>