<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resident login page</title>
<link rel="stylesheet" type="text/css" href="/static/css/Residentlogin.css">
</head>
<body>
<h1>Resident Login</h1>
<h3>${biilnull}</h3>
<a href="home"><button type="submit">Home</button></a>
<form action="residentlogin" method="get">
	<label>Resident name</label> 
		<input type="text" name="Residentname" pattern="[A-Z a-z]+" required> 
	<label>Password</label>
		<input type="password" name="Password" required>
	<h4>${notcorrect}</h4>
	<button type="submit">Login</button>
</form>
<a href="register"><button>sing up</button></a>

</body>
</html>