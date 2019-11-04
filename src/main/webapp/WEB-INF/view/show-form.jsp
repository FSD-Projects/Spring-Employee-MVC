<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration Form</title>
</head>
<body>
	<form action="/processForm" action="post">
		<div>
			<label>Employee Name</label> <input type="text" name="empName" />
		</div>

		<div>
			<label>Corporate email</label> <input type="email" name="empEmail" />
		</div>

		<div>
			<label>Password</label> <input type="password" name="password" />
		</div>
		<input type="Submit" value="Submit" />
	</form>
</body>
</html>