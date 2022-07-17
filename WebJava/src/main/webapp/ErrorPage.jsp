<!-- Need To Enable isErrorPage="true"  -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isErrorPage="true"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body style="padding: 60px">

	<h3>Error Page</h3>

	<%
	out.println(exception.getMessage());
	%>

</body>
</html>