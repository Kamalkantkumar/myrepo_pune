<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Information</title>
<style type="text/css">
 body {
            display: flex;
            font-family: 'Poppins', sans-serif;
            justify-content: center;
            background-position:center;
            background-image: linear-gradient(
      115deg,
      rgba(58, 58, 158, 0.8),
      rgba(136, 136, 206, 0.7)
    ),
    url(https://cdn.freecodecamp.org/testable-projects-fcc/images/survey-form-background.jpeg);
    background-size: cover;
  
        }
.mar{
margin-top: 50px;
}
</style>
</head>
<body>

<form action="<%= request.getContextPath() %>/register" method="post" >
<h1 style="color:white;" align="center">Employee Details</h1>
<table  class="mar">
	<tr>
		<td><label style="color:white;">Enter the First Name:</label></td>
		<td><input type="text" name="firstName" id="firstName" placeholder="firstName"  required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the Last Name:</label></td>
		<td><input type="text" name="lastName" id="lastName" id="lastName" placeholder="LastName" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the Age:</label></td>
		<td><input type="text" name="age" id="age" pattern="^[0-9]{1,3}$" title=" Please Enter Valid Age" placeholder="Age" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the MobileNumber:</label></td>
		<td><input type="text" name="mobileNo" id="mobileNo" pattern="^[0-9]{10}$" title="Please Enter Valid Mobile Number" placeholder="MobileNo" required="required"></td>
	</tr>
	<tr><td><label style="color:white;"><h2>Address</h2></label></td></tr>

	<tr><td><label style="color:white;" ><h3>Enter the Current Address</h3></label></td></tr>
	
	<tr>
		<td><label style="color:white;">Enter the HouseNumber:</label></td>
		<td><input type="text" name="hno" pattern="^[0-9]{1,10}$" title="Please Enter Valid House Number" id="hno" placeholder="Hno" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the City:</label></td>
		<td><input type="text" name="city" id="city" placeholder="City" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid City Name" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the State:</label></td>
		<td><input type="text" name="state" id="state" placeholder="State" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid State Name" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the PinCode:</label></td>
		<td><input type="text" name="pincode" id="pincode" pattern="^[0-9]{6}$" title="Please Enter Valid Pin Code" placeholder="Pincode" required="required"></td>
	</tr>
	
	<tr><td><label style="color:white;"><h3>Enter the Permanent Address</h3></label></td></tr>
	
	<tr><td><label style="color: yellow;">If Permanent Address is same as Current:</label></td>
	<td><input type="checkbox" id="checkBox" onclick="FillAddressInput()"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the HouseNumber:</label></td>
		<td><input type="text" name="hno1" id="hno1" pattern="^[0-9]{1,10}$" title="Please Enter Valid House Number" placeholder="Hno" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the City:</label></td>
		<td><input type="text" name="city1" id="city1" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid City Name" placeholder="City" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the State:</label></td>
		<td><input type="text" name="state1" id="state1" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid State Name" placeholder="State" required="required"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Enter the PinCode:</label></td>
		<td><input type="text" name="pincode1" id="pincode1" pattern="^[0-9]{6}$" title="Please Enter Valid Pin Code" placeholder="Pincode" required="required"></td>
	</tr>
	
	
	<tr>
	<td>	
		<input type="submit" style="height: 40px; border-radius: 20px; margin-top: 20px; width: 100px;" value="submit"></td>
	</tr>
	
</table>
</form>

<%-- here Automatically fill the Permanent Address According to the Current Address By Clicking the Check Box --%>

<script type="text/javascript">
	function FillAddressInput() {
		let checkBox=document.getElementById('checkBox');
	
		let hno=document.getElementById("hno");
		let city=document.getElementById("city");
		let state=document.getElementById("state");
		let pincode=document.getElementById("pincode");
	
		let hno1=document.getElementById("hno1");
		let city1=document.getElementById("city1");
		let state1=document.getElementById("state1");
		let pincode1=document.getElementById("pincode1");
	
		if(checkBox.checked==true){

			let hnoLine=hno.value;
			let cityLine=city.value;
			let stateLine=state.value;
			let pincodeLine=pincode.value;
		
			hno1.value=hnoLine;
			city1.value=cityLine;
			state1.value=stateLine;
			pincode1.value=pincodeLine;
		
		}
		else{
			hno1.value="";
			city1.value="";
			state1.value="";
			pincode1.value="";
	}
	
}
</script>
</body>
</html>