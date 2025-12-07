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
            align-items: center;
            font-family: monospace;
            justify-content: center;
            background-color: #1d212b;
        }

</style>
</head>
<body>

<h2 style="color:white;">Employee Details</h2>


<form action="<%= request.getContextPath() %>/register" method="post" >
<table>
	<tr>
		<td><label>Enter the First Name:</label></td>
		<td><input type="text" name="firstName" maxlength="32" id="firstName" pattern="[A-Za-z]{1,32}" title="PleaseEnter Valid First Name" placeholder="Enter firstName"  required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the Last Name:</label></td>
		<td><input type="text" name="lastName" id="lastName" maxlength="32" id="firstName" pattern="[A-Za-z]{1,32}" title="Enter Valid Last Name" placeholder="Enter lastName" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the Age:</label></td>
		<td><input type="text" name="age" id="age" pattern="^[0-9]{1,3}$" title=" Please Enter Valid Age" placeholder="Enter mobileNo" placeholder="Enter age" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the MobileNumber:</label></td>
		<td><input type="text" name="mobileNo" id="mobileNo" pattern="^[0-9]{10}$" title="Please Enter Valid Mobile Number" placeholder="Enter mobileNo" required="required"></td>
	</tr>
	
	<tr><td><label style="color:#993441;"><h3>Enter the Current Address</h3></label></td></tr>
	
	<tr>
		<td><label>Enter the HouseNumber:</label></td>
		<td><input type="text" name="hno" pattern="^[0-9]{1,10}$" title="Please Enter Valid House Number" id="hno" placeholder="Enter hno" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the City:</label></td>
		<td><input type="text" name="city" id="city" placeholder="Enter city" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid City Name" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the State:</label></td>
		<td><input type="text" name="state" id="state" placeholder="Enter state" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid State Name" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the PinCode:</label></td>
		<td><input type="text" name="pincode" id="pincode" pattern="^[0-9]{6}$" title="Please Enter Valid Pin Code" placeholder="Enter pincode" required="required"></td>
	</tr>
	
	<tr><td><label style="color:#993441;"><h3>Enter the Permanent Address</h3></label></td></tr>
	
	<tr><td><label style="color: blue;">If Permanent Address is same as Current Then Check It:</label></td>
	<td><input type="checkbox" id="checkBox" onclick="FillAddressInput()"></td>
	</tr>
	
	<tr>
		<td><label>Enter the HouseNumber:</label></td>
		<td><input type="text" name="hno1" id="hno1" pattern="^[0-9]{1,10}$" title="Please Enter Valid House Number" placeholder="Enter Current Hno" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the City:</label></td>
		<td><input type="text" name="city1" id="city1" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid City Name" placeholder="Enter Current City" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the State:</label></td>
		<td><input type="text" name="state1" id="state1" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid State Name" placeholder="Enter Current State" required="required"></td>
	</tr>
	
	<tr>
		<td><label>Enter the PinCode:</label></td>
		<td><input type="text" name="pincode1" id="pincode1" pattern="^[0-9]{6}$" title="Please Enter Valid Pin Code" placeholder="Enter Current Pincode" required="required"></td>
	</tr>
	
	
	<tr>
	<td>	
		<input type="submit" value="submit"></td>
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