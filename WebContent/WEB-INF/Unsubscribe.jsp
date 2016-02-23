<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unsubscription</title>
<form:errors path="Unregister.*"></form:errors>
</head>
<body>
	<form name="Unsub" action="\FileUploader\OnSubmitunsubscribe"
		method="POST">

		<table border="0px" align="center">

			<tr>
				<td>Email:</td>
				<td><input type="text" name="email" placeholder="email"><span
					id="email"></span></td>
			</tr>
			<tr>

				<td></td>
				<td><input type="submit" value="Submit"> &nbsp&nbsp<input
					type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>