
<!-- Need To Add errorPage="ErrorPage.jsp"  -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  errorPage="ErrorPage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px">

<%
if(true){
	throw new Exception("Page Contain Error!");
}

%>

</body>
</html>