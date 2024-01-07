<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login page</title>
<link rel="stylesheet" type="text/css" href="/static/css/Adminlogin.css">
</head>
<body>
<h1>Admin Login</h1>
<a href="home"><button type="submit">Home</button></a>
<form action="Adminlogin" method="get">
	<label>Admin Id</label> 
		<input type="text" name="adminid" pattern="[A-Z a-z]+" minlength="8" required> 
	<label>Password</label>
		<input type="password" name="password" required>
	<h4>${wrongpass}</h4>
	<button type="submit">Login</button>
</form>
</body>
</html>