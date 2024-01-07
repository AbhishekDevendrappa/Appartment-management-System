<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
    <title>Payment Page</title>
    <link rel="stylesheet" type="text/css" href="/static/css/Payment.css">
</head>
<body>
    <h2>Make a Payment</h2>
    <a href="home"><button type="submit">Home</button></a>

    <form action="processPayment" method="post">
        
        <label>Bill Id:</label>
        <input type="text" name="Billid" value="${billid}" required><br>
        
        <label>Total Amount to Pay:</label>
        <input type="text"  name="totalAmount" value="${model}" readOnly><br>
        
        <label>Credit Card Number:</label>
        <input type="text" name="creditCardNumber" pattern="[0-9]{16}" required><br>

        <label >Phone Number:</label>
        <input type="text"  name="phoneNumber" pattern="[0-9]{10}" required><br>

        
        <label >Bill Payment Member Name:</label>
        <input type="text"  name="memberName" pattern="[A-Z a-z]+" required><br>


        <label>Amount Being Paid:</label>
        <input type="text"  name="paidAmount" pattern="[0-9]" required><br>

        <input type="submit" value="Submit Payment">
    </form>
</body>
</html>
