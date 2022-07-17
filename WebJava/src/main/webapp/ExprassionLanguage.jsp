<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ page isELIgnored="false" %>

<%-- 
<%@ page isELIgnored="true" %> 

it will not evaluate any of EL 

--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expression Language</title>
</head>
<body style="padding: 60px">


	<h2>Welcome To JSP Expression Language(EL)</h2>


	<form>
		Name <input text="text" name="pname"> <br> 
		Phone <input	text="text" name="phone"> <br> 
		<input type="submit" />
	</form>
	<br>

	<b>Name</b>
	<br>
	<%--  <%=request.getParameter("pname")%> --%>
	${param.pname }
	<br>
	<b>Phone</b>
	<br>
	<%--   <%=request.getParameter("phone")%> --%>
	${param.phone }
	
	
	<br>
	<!--Conditional  -->
		
	${10 eq 10 ? "Pradeep" : "Maurya" }
	
	<br>
	
	
	 \${"This Sentance Will Not Evaluate, Print as it is"}
	
	
	<!-- References -->
	<br><a href="https://www.javatpoint.com/EL-expression-in-jsp">References</a>
	
	
</body>
</html>