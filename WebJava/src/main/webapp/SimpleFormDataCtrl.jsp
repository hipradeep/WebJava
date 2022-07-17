<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px">

	<h3>Simple Form : Received Data </h3>
	<hr>

	<b>Name</b>
	<br>
	<%=request.getParameter("pname")%>
	<br>
	<b>Phone</b>
	<br>
	<%=request.getParameter("phone")%>
</body>
</html>