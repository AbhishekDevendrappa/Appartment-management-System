<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill Update Page</title>
<link rel="stylesheet" type="text/css" href="/static/css/Addbill.css">
</head>
<h1>Update Resident bills</h1>
<a href="adminlogout"><button type="submit">Logout</button></a>
<a href="home"><button type="submit">Home</button></a>
<a href="updatetomain"><button type="submit">Back</button></a>
<body>
<form action="bill" method="post">
<label>Resident Apartment number</label>
<input type="number" name="residents_reid" value="${model}"  readonly><br>

<label>Electricity Bill</label>
<input type="number" name="electricitybill" pattern="[0-9]" required><br>

<label>Water Bill</label>
<input type="number" name="waterebill" pattern="[0-9]" required><br>

<label>Waste management Bill</label>
<input type="number" name="wastemangebill" pattern="[0-9]" required><br>

<label>Other Maintenance Bill</label>
<input type="number" name="othermainbill" pattern="[0-9]" required><br>

<button type="submit">submit</button>
</form>
</body>
</html>