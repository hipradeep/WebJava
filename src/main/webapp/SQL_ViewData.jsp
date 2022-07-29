<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Adding JSTL Core -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Adding JSTL SQL -->
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px;">
	<h2>Welcome To JSTL</h2>
	<hr>



	<i>SQL Connection, Access Data</i>
	<br>
	<!-- SQL Connection And Access Data -->
	<sql:setDataSource var="con" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/org1" user="root" password="1234" />

	<sql:query dataSource="${con}" var="rs">select * from books </sql:query>
	<table border=2 >
		<c:forEach items="${rs.rows}" var="x">

			<tr>
				<td><c:out value="${x.id}" /></td>
				<td><c:out value="${x.ISBN}" /></td>
				<td><c:out value="${x.bname}" /></td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>