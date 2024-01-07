<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resident sign in page</title>
<link rel="stylesheet" type="text/css" href="/static/css/Residentsignin.css">
</head>
<body>
<h1>Resident Sign-In</h1>

<a href="home"><button type="submit">Home</button></a>
<form action="singin" method="post">
			
				<label>User name:</label> 
				<input type="text"  name="Residentname" pattern="[A-Z a-z]+" minlength="8" required> 
				<h5>${model}</h5><br>
			
			
				<label>Email:</label> 
				<input type="email"  name="Residentemail" placeholder="abc@gmail.com" required> <br>
				
				<label>Contact Number:</label> 
				<input type="number" pattern="[0-9]{10}" name="Residentnumber"  required> <br>
	
				<label>Password:</label> 
				<input type="password"  name="Password" minlength="8"  required> <br>
				
				<label>Confirm Password:</label> 
				<input type="password"  name="confirmPassword" minlength="8" required> <br>
				<h5>${models}</h5><br>
			
			   <button type="submit">Register</button>
		</form>
</body>
</html>