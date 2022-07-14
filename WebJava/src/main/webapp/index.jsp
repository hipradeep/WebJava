
<!-- page directives -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- page directives to import packages -->
<%@page import="java.util.*, pack1.Dummy"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="padding: 60px">
	<h1>WebJava</h1>
	<h2>Welcome To JSP</h2>
	<hr>

	<!-- JSP Scripting Tag - to print something -->
	<%
	out.println("Hello World");
	%>
	<br>
	<%
	out.println("Pradeep Maurya");
	%>
	<%
	out.println("<h3>Heading in JSP</h3>");
	%>

	<!-- JSP Declaration Tag that declares field  -->
	<%! int data = 50;%>
	
	<!--  JSP Expression Tag is written to the output stream of the response or to say print -->
	<%="Value of the variable is:" + data%>

    <br>
	<%!int cube(int n) {
		return n * n * n;
	}%>
	<%="Cube of 3 is:" + cube(3)%>


    <!-- Include File   -->
    <%@include file="TestInclude.jsp" %><br>
    
    
    <p>-------------------</p>
    <!-- print data from java class -->
    
    <h4>Print java class data</h4>
    <%
    Dummy d=new Dummy();
    
    out.println("Sum - "+d.sum(12, 10));
    out.println(" <br>Course ID - "+d.COURSE_ID);
    
    
    %>


</body>
</body>
</html>