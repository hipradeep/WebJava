<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px">

    <h3>Patient Form : Received Data </h3>
    <hr>


 
    <br>
    <%
    String id= request.getParameter("id");
    String name= request.getParameter("pname");
    String phone= request.getParameter("phone");
    String address= request.getParameter("address");
    
    out.println("Id - "+ id+" <br>Name - "+ name+"<br>Phone - "+phone+"<br>Address - "+ address);
    
    
    %>


</body>
</html>