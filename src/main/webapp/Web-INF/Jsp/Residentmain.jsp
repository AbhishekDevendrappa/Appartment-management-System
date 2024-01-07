<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resident main page</title>
<link rel="stylesheet" type="text/css" href="/static/css/Residentmain.css">
</head>
<body>
<h1>Well Come to Amith Apartment System</h1>
<h2>Bill Details</h2>
<a href="home"><button type="submit">Home</button></a>
<a href="residentlogout"><button type="submit">Logout</button></a>
<table>
			<tr>
				<th>billid</th>
				<th>electricitybill</th>
				<th>waterebill</th>
				<th>wastemangebill</th>
				<th>othermainbill</th>
				<th>Total amount due</th>
				<th>pay</th>
			</tr>

			<tr>
			 	
			 	<tr>
			 	<td>${model.billid}</td>
			 	<td>${model.electricitybill}.Rs only</td>
				<td>${model.waterebill}.Rs only</td>
				<td>${model.wastemangebill}.Rs only</td>
				<td>${model.othermainbill}.Rs only</td>
				<td>${models}</td>
				<td><a href="pay?no=${model.billid}">pay</a></td> 
				</tr>
				
			</tr>
		</table>
</body>
</html>