<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px">


	<h3>Simple Form</h3>
	<hr>

	<h4>Send data to same page</h4>
	
	<form>
		Name <input text="text" name="pname"> <br> 
		Phone <input text="text" name="phone"> <br> 
		<input type="submit" />
	</form>

	<b>Name</b>
	<br>
	<%=request.getParameter("pname")%>
	<br>
	<b>Phone</b>
	<br>
	<%=request.getParameter("phone")%>

    <hr>

    <h4>Send data to Next page</h4>
    
    <form action="FormData.jsp">
        Name <input text="text" name="pname"> <br> 
        Phone <input text="text" name="phone"> <br> 
        <input type="submit" />
    </form>

    

</body>
</html>