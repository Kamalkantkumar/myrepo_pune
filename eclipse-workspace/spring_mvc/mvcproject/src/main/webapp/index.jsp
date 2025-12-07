<!DOCTYPE html>
<html>

<body
	style="background-color: aqua; background-image: url('https://c1.wallpaperflare.com/preview/811/367/789/technology-computer-creative-design.jpg'); background-size: 100%">


	<img alt="not found" src="https://technoelevate.com/images/logo.png"
		style="background-size: 15%; width: 5cm;">
	<h1
		style="padding-left: 550px; align-content: center; color: red; font: bold; font-family: monospace;">REGISTRATION
		FORM</h1>
	<form action="add" method="post">
		<fieldset
			style="padding-left: 550px; align-items: center; size: 50px; width: 50cm; border-collapse: separate; border: solid black 1px; border-radius: 6px;">
			<legend style="color: orange; font-style: italic; font: bold;">NEW
				REGISTRARTION</legend>
			<table
				style="background-image: url('https://wallpapercave.com/wp/wp6350571.jpg'); border-collapse: separate; border: solid black 1px; border-radius: 15px;">

				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">FIRST
							NAME :</label></td>
					<td><input type="text" name="user" placeholder="ex:venkatesh"
						required="required" maxlength="50" min="5" size="20"
						style="border-collapse: separate; border: solid black 1px; border-radius: 15px;"></td>
				</tr>
				
				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">LAST
							NAME :</label></td>
					<td><input type="text" name="user" placeholder="ex:balla"
						required="required" maxlength="50" min="5" size="20"
						style="border-collapse: separate; border: solid black 1px; border-radius: 15px;"></td>
				</tr>
				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">USER
							NAME :</label></td>
					<td><input type="email" name="user"
						placeholder="ex:venkatesh@gmail.com" required="required"
						maxlength="50" min="5" size="20"
						style="border-collapse: separate; border: solid black 1px; border-radius: 15px;"></td>
				</tr>

				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">PASSWORD
							:</label></td>
					<td><input type="password" name="user" placeholder="password"
						required="man " size="20"
						style="border-collapse: separate; border: solid black 1px; border-radius: 15px;"></td>
				</tr>
				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">DATE
							OF BIRTH :</label></td>
					<td><input type="date" name="dob" placeholder="dd/mm/yyyy"
						size="25"
						style="border-collapse: separate; border: solid black 1px; border-radius: 15px;"></td>
				</tr>
				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">PHONE
							NUMBER :</label></td>
					<td><input type="number" name="num"
						placeholder="+91-----------" size="10" maxlength="10" size="20"
						style="border-collapse: separate; border: solid black 1px; border-radius: 15px;"></td>
				</tr>
				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">GENDER
							:</label></td>
					<td><input type="radio" name="gender">Male <input
						type="radio" name="gender">Female <input type="radio"
						name="gender">Custom</td>
				</tr>
				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">COUNTRY:</label></td>
					<td><select name="country"">
							<option>--none--</option>
							<option value="india">india</option>
							<option>Pakistan</option>
							<option>Russia</option>
							<option>China</option>
							<option>Australia</option>
							<option>England</option>
							<option>Namibia</option>
							<option>Afganisthan</option>
							<option>America</option>
							<option>Ganada</option>
							<option>Germany</option>
							<option>Andaman islands</option>
					</select></td>
				</tr>

				<tr>
					<td><label
						style="color: lime; font-family: serif; font: bold;">UPLOAD
							PICTURE :</label></td>
					<td><input type="file" name="file" size="15"
						style="border-collapse: separate; border: solid black 1px; border-radius: 15px;"></td>
				</tr>

				<tr>
					<td><input
						style="color: red; background-color: silver; margin-right: 16px; font: oblique; align-items: center; padding-left: center; border-collapse: separate; border: solid black 1px; border-radius: 15px;"
						type="submit" name="submit"></td>
					<td><input
						style="color: red; background-color: silver; font: oblique; border-collapse: separate; border: solid black 1px; border-radius: 15px;"
						type="reset" name="reset"></td>



					</fieldset>
					<br>




					</form>
			</table>
			<table style="align-items: center;">
				<tr>
					<td><a
						href="http://localhost:7777/mvcproject/add">
							<input type="button" value="Already account? Login here"
							style="background-color: ff3ed3; color: black; font-family: sans-serif; font: bold; border-collapse: separate; border: solid black 1px; border-radius: 6px; padding-right: 15px; padding-left: center;">
					</a></td>
				</tr>
				</tr>

			</table>
</body>
</html>