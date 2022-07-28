<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px">

  

    <h2>Welcome To JSP</h2>
    
      <!-- this Include tag will show NextPage2 Data on same page -->
     <jsp:include page="NextPage2.jsp">
   
    <jsp:param value="1234" name="code"/>
    <jsp:param value="abc" name="password"/>
    </jsp:include>
    
    

</body>
</html>