<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.8.3.js"></script>
<script src="http://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body>


	<form name="Signup" action="" method="POST">

		<table border="0px" align="center">

			<tr>
				<td>UserName:</td>
				<td><input type="text" name="username" placeholder="Name">
					<span id="username"></span></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password1"
					placeholder="Password" maxlength="6"> <span id="password1"></span></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><input type="password" name="password2"
					placeholder="Confirm Password" maxlength="6"> <span
					id="password2"></span></td>
			</tr>
			<tr>
				<td>Mail:</td>
				<td><input type="text" name="email" palceholder="EMAIL"><span
					id="email"></span></td>
			</tr>

			<tr>

				<td></td>
				<td><input type="submit" value="Submit"> <input
					type="reset" value="Reset"></td>

			</tr>

		</table>
	</form>


</body>





</html>