<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px">

    <h1>Welcome</h1>
    <!-- This Tag will send values of jap:param to NextPage.jsp, 
    but Content of this page will not be show, we moved to NextPage -->
    <jsp:forward page="NextPage.jsp">
   
    <jsp:param value="1234" name="code"/>
    <jsp:param value="abc" name="password"/>
    </jsp:forward>

    
    
    

</body>
</html>