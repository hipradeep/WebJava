<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Details</title>
</head>
<body style="padding: 60px">
	<h3>Patient Form</h3>
	
	<hr>
	<p><i>Accessing Data Using Session</i></p><br>
	
	<!-- Creating Session to Access Data -->
	<jsp:useBean id="p" class="pack1.Patient" scope="session"/>
	
	<!-- Accessing Data To Model Class using getProperties -->
	ID -
	<jsp:getProperty property="id" name="p" /><br> 
	Name -
	<%-- <jsp:getProperty property="pname" name="p" /><br> --%> 
	<%= p.getPname() %> <br>
	Phone -
	<jsp:getProperty property="phone" name="p" /><br> 
	Address -
	<%-- <jsp:getProperty property="address" name="p" /><br> --%>
	<%= p.getAddress() %> <br>
	
	Square of 4 - 
	<%= p.extraMethod(4) %> <br>
	
</body>
</html>