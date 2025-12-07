
<html>
<body style="background-image:url('https://previews.123rf.com/images/annmaysnz/annmaysnz2002/annmaysnz200200097/141437201-pale-light-blue-plain-background-.jpg'); ">
	<fieldset style="padding-left: 500px">
		<legend style="font:bold;  ">Personal details</legend>
		<form action="personalmain.jsp" method="post">
			<table style="padding-left: 50px">
				<tr>
					<td><label>First name </label></td>
					<td><input type="text" name="first name"
						placeholder="first name"></td>
				</tr>
				<tr>
					<td><label>Last name </label></td>
					<td><input type="text" name="last name"
						placeholder="last name"></td>
				</tr>
				<tr>
					<td><label>Password </label></td>
					<td><input type="password" name="password"
						placeholder="password"></td>
				</tr>
				<tr>
					<td><label>Number </label></td>
					<td><input type="number" name="number"
						placeholder="ex:9999999999"></td>
				</tr>
				<tr>
					<td><label>UID Number </label></td>
					<td><input type="number" name="uid"
						placeholder="Ex:1234-5678-9102"></td>
				</tr>
				<tr>
					<td><label>Date of Birth </label></td>
					<td><input type="date" name="date" placeholder="dd/mm/yyyy"></td>
				</tr>
				<tr>
					<td><label>Religion :</label></td>
					<td><input type="text" name="religion" placeholder="Ex:hindhu"></td>
				</tr>
				<tr>
					<td><label>Martial Status :</label></td>
					<td><input type="text" name="martial" placeholder="ex:single"></td>
				</tr>
				<tr>
					<td><label>Gender:</label></td>
					<td><input type="radio" name="gender" value="male">Male <input
						type="radio" name="gender" value="female">Female <input type="radio"
						name="gender" value="custom">Custom</td>
				</tr>
				<td><input type="submit" name="gender"></td> 
				<td><input type="reset" name="gender"> </td>
					




			</table>
		</form>
	</fieldset>
    Redirect to main page<a href="http://localhost:6306/mvc.assignment/selection.jsp">click here </a> 

</body>

</html>