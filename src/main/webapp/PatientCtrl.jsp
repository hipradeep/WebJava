<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- page directives to import packages -->
<%@page import="java.util.*, pack1.Patient"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Data</title>
</head>
<body style="padding: 60px">

	<h3>Patient Form : Received Data</h3>
	<hr>
	<!-- Send Data To Model Class  -->
    <!-- Creating Session to Send Data to Another Page, For same page no need to create session -->
	<jsp:useBean id="p" class="pack1.Patient" scope="session">

		<%-- Set all values at once --%>
		<jsp:setProperty name="p" property="*" />

		<%-- or we can set individual values  --%>
		<%--  <jsp:setProperty name="p" property="id" />
		<jsp:setProperty name="p" property="pname" />
		<jsp:setProperty name="p" property="phone" /> --%>

	</jsp:useBean>



	<!-- Accessing Data To Model Class using getProperties -->
	ID - 
	<jsp:getProperty property="id" name="p" /><br>
	Name - 
	<jsp:getProperty property="pname" name="p" /><br>
	Phone - 
	<jsp:getProperty property="phone" name="p" /><br>
	Address - 
	<jsp:getProperty property="address" name="p" /><br><br>
	
	<a href="ViewPatientData.jsp"> Access Patient Data To Next Page</a>

	<p>-------------------</p>

	<!-- Accessing Data To Model Class  -->
	<h4>Get Data From Model Class</h4>
	<%
	int id = p.getId();
	String name = p.getPname();
	String phone = p.getPhone();
	String address = p.getAddress();

	out.println("Id - " + id + " <br>Name - " + name + "<br>Phone - " + phone + "<br>Address - " + address);
	%>

	<p>-------------------</p>

	<!-- Accessing Data From Form-->
	<h4>Get Data From Patient Form</h4>
	<%
	String id1 = request.getParameter("id");
	String name1 = request.getParameter("pname");
	String phone1 = request.getParameter("phone");
	String address1 = request.getParameter("address");

	out.println("Id - " + id1 + " <br>Name - " + name1 + "<br>Phone - " + phone1 + "<br>Address - " + address1);
	%>


</body>
</html>