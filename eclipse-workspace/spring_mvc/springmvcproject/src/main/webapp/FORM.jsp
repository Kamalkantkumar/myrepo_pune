


<html>


<body


	style="background-color: aqua; background-image: url('https://media.istockphoto.com/photos/abstract-ray-light-background-gray-gradient-blurred-studio-room-picture-id1270080274?b=1&k=20&m=1270080274&s=170667a&w=0&h=3NFbkmzdLmEFCxrSWa8CDmZzSydUJ-ppZ959EfFd8ao='); background-size: 100%">

	<h1
		style="padding-left: 550px; align-content: center; color: red; font: bold;">REGISTRATION
		FORM</h1>
	<form action="display.jsp" name="ven" >
		<fieldset
			style="padding-left: 550px; align-items: center; size: 50px; width: 50cm;">
			<legend style="color: orange; font-style: italic; font: bold;">personal
				details</legend>
			<table>
				<tr>
					<td><label style="color: maroon;">USER NAME :</label></td>
					<td><input type="text" name="user" placeholder="user name"
						maxlength="50" min="5" size="15"></td>
				</tr>
				<tr>
					<td><label>PASSWORD :</label></td>
					<td><input type="password" name="password" placeholder="password" 
						size="15"></td>
				</tr>
				<tr>
					<td><label>DATE OF BIRTH :</label></td>
					<td><input type="date" name="dob" placeholder="dd/mm/yyyy"
						size="13"></td>
				</tr>
				<tr>
					<td><label>PHONE NUMBER :</label></td>
					<td><input type="number" name="num" placeholder="+91-----------"
						size="10" maxlength="10"></td>
				</tr>
				<tr>
					<td><label>GENDER :</label></td>
					<td><input type="radio" name="gender">Male <input
						type="radio" name="gender">Female <input type="radio"
						name="gender">Custom</td>
				</tr>
				<tr>
					<td><label>COUNTRY:</label></td>
					<td><select name="country">
							<option>--none--</option>
							<option value="india">india</option>
							<option>pakistan</option>
							<option>russia</option>
							<option>china</option>
							<option>australia</option>
							<option>england</option>
							<option>namibia</option>
							<option>afganisthan</option>
							<option>america</option>
							<option>canada</option>
							<option>germany</option>
					</select></td>
				</tr>

				<tr>
					<td><label>UPLOAD PICTURE :</label></td>
					<td><input type="file" name="file"></td>
				</tr>
				<tr>
					<td><input style="color: red;background-color:silver;font:oblique;   " type="submit" name="submit"></td>
					<td><input style="color: red;background-color:silver;font:oblique;  " type="reset" name="reset"></td>
				</tr>
				</fieldset>
				<br>
				</form>
			</table>
</body>
</html>