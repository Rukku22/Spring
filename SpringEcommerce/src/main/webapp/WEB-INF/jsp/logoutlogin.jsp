<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head></head>

<body style="background-color: pink;">
	<form action="login">

		<div
			style="background-color: white; box-shadow: 0px -5px 10px 0px rgba(0, 0, 0, 0.5); width: 512px; padding: 72px; margin-left: 700px;">
			<img style="width:508px; margin-left: -71px; margin-top: -71px;"
				src="https://images.meesho.com/images/marketing/1661417516766.webp"><br>
			<br>
			<h2>Sign Up to view your profile</h2>
			<table>
				<tr>
					<td>Username:</td>
					<td><input type="FirstName"  name="FirstName" /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"/></td>
				</tr>

				<tr>
					<td><input type="submit" value="Submit" /></td>
				</tr>


			</table>
			<br> <br> <br> <br> <br> <br> <br>
			<div style="text-align: center;">
				<h5>By continuing ,you agree to meesho's</h5>
				<h5 style="color: hotpink;">Terms and Conditions & privacy
					policy</h5>
			</div>
			<br> <br> <a href="register">Existing User?Register</a>
		</div>

	</form>
</body>
</html> 

<%-- <html>
<head></head>
<body>

<form action="login">


<table>
<tr>

<td>Name</td>
<td><input type="text" name="FirstName"></td>
</tr>
<tr>
<td>email</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td><input type="submit" value="Login"></td>
</tr>

</table>

</form>


</body>

</html> --%>