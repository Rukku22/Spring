
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head></head>
<body style="background-color: white;">
	<div
		style="background-color: hotpink; height: 700px; width: 682px; padding: 206px; margin-left: 605px;">
		<h1>Register Form</h1>
		<form  method="GET" action="save">
			<table>
				<tr>
					<td>Id:</td>
					<td><input type=id name="id" required /></td>
				</tr>
				<tr>
					<td>FirstName :</td>
					<td><input type=text name="FirstName"  required/></td>
				</tr>
				<tr>
					<td>LastName :</td>
					<td><input type=text name="LastName" required/></td>
				</tr>
				<tr>
					<td>Email-Id :</td>
					<td><input type=email name="email" required/></td>
				</tr>
				<tr>
					<td>Mobile.No :</td>
					<td><input type=text name="mobileNo" required/></td>
				</tr>
				<tr>
					<td>Country :</td>
					<td><input type=text name="country" required/></td>
				</tr>

				<td></td>
				<td><jsp:include page="successmsg.jsp"></jsp:include></td>
				</tr>
				</div>
			</table>
		</form>
		<br>
		<br>
		<div class="link">
			<a style="text-decoration: none;" href="Login2">if already
				registered?Login</a>
		</div>
	</div>
</body>
 </html>
 