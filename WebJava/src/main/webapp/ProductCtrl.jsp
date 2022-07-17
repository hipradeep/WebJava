<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="product.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<jsp:useBean id="p" class="product.Product">
		<jsp:setProperty name="p" property="*" />
	</jsp:useBean>

	<%
	
	ProductDAO dao= new ProductDAO(p);
    dao.addProduct();
    
    %>


</body>
</html>