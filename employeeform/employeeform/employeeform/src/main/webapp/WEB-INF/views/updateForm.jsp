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
    overflow: hidden;
  
        }
.mar{
margin-top: 30px;
}
</style>
</head>
<body>



<br>
<form action="">
<h1 style="color:white;" align="center">Update Employee Details</h1>
<table  class="mar">

	<tr>
		<td><label style="color:white;">Enter the Emp_id:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="empId" id="empId" placeholder="empId"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">First Name:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="firstName" id="firstName" placeholder="firstName"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">Last Name:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="lastName" id="lastName" placeholder="lastName"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">DOB:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="date" name="age" id="age" placeholder="DOB" ></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">MobileNumber:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="mobileNo" id="mobileNo" pattern="^[0-9]{10}$" title="Please Enter Valid Mobile Number" placeholder="MobileNo"></td>
	</tr>
	<tr><td><label style="color:white;"><h2 style="outline: 1px; padding: 0px; margin: 0px;">Address</h2></label></td></tr>

	<tr><td><label style="color:white;" ><h3 style="outline: 1px; padding: 0px; margin: 0px;">Current Address</h3></label></td></tr>
	
	<tr>
		<td><label style="color:white;">HouseNumber</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="hno" pattern="^[0-9]{1,10}$" title="Please Enter Valid House Number" id="hno" placeholder="Hno"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">City:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="city" id="city" placeholder="City" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid City Name"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">State:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="state" id="state" placeholder="State" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid State Name"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">PinCode:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="pincode" id="pincode" pattern="^[0-9]{6}$" title="Please Enter Valid Pin Code" placeholder="Pincode"></td>
	</tr>
	
	<tr><td><label style="color:white;"><h3 style="outline: 1px; padding: 0px; margin: 0px;">Permanent Address</h3></label></td></tr>
	
	<tr>
		<td><label style="color:white;">HouseNumber:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="hno1" id="hno1" pattern="^[0-9]{1,10}$" title="Please Enter Valid House Number" placeholder="Hno"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">City:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="city1" id="city1" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid City Name" placeholder="City"></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">State:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="state1" id="state1" maxlength="32" pattern="[A-Za-z]{1,32}" title="Please Enter Valid State Name" placeholder="State" ></td>
	</tr>
	
	<tr>
		<td><label style="color:white;">PinCode:</label></td>
		<td><input style="width: 100%; border: 2px solid red; border-radius:4px;padding:3px 4px;margin:2px 0px;box-sizing: border-box;" type="text" name="pincode1" id="pincode1" pattern="^[0-9]{6}$" title="Please Enter Valid Pin Code" placeholder="Pincode" ></td>
	</tr>
	
	
	<tr>
	<td>	
		<input type="submit" style="height: 40px; border-radius: 20px; margin-top: 10px; width: 100px;" value="update"></td>
	</tr>
	
</table>
</form>


</body>
</html>