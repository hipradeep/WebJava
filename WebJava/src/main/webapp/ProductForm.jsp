<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding:60px">

    <h2>DAO - Data Access Object</h2>
    <h3>Product Form</h3>
    <hr>

	<form action="ProductCtrl.jsp" method="post">

		Product Id <input type="text" name="pid" /><br> 
		Product Name <input type="text" name="pname" /><br> 
		Company <input type="text" name="company" /><br>
		Price <input type="text" name="price" /><br>
		Vendor<input type="text" name="vendor" /><br> 
		<input type="submit" /><br>

	</form>
</body>
</html>