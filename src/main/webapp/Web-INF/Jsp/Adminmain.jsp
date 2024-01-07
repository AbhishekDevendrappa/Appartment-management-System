<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin main page</title>
<link rel="stylesheet" type="text/css" href="/static/css/Adminmain.css">
</head>
<body>
<h1>Well come to Amith Apartment System Admin Page</h1>
<a href="adminlogout"><button type="submit">Logout</button></a>
<a href="home"><button type="submit">Home</button></a>
<h2>Residents Details</h2>
		<table>
			<tr>
				<th>Apartment Number</th>
				<th>Resident Name</th>
				<th>Resident Email</th>
				<th>Resident Number</th>
				<th>Update Bills</th>
			</tr>

			<tr>
			 	<c:forEach items="${model}" var="models">
			 	<tr>
			 	<td>${models.reid}</td>
				<td>${models.residentname}</td>
				<td>${models.residentemail}</td>
				<td>${models.residentnumber}</td>
				<td><a href="update?no=${models.reid}">Update</a></td> 
				</tr>
				</c:forEach> 
			</tr>
		</table>
</body>
</html>