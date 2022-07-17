<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px">
   
      <h3>Next Page</h3>
    <h2>Getting Data from Forward Tag</h2>
    <%
    
    String code = request.getParameter("code");
    String password = request.getParameter("password");
    out.println("Code - " + code + " <br>Password - " + password );
    %>

</body>
</html>