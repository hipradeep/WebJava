<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- Adding JSTL Core -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body style="padding: 60px;">
	<h1>WebJava</h1>
	<h2>Welcome To JSTL</h2>

	<ul>
		<li><a href="SQLConnectivity.jsp">SQL Connectivity</a></li>

	</ul>
	<hr>

	<i>Simple Form</i>
	<br>

	<form>
		<input type="text" name="user"> <input type="submit">

	</form>
	<br>

	<!-- Printing Value -->
	<i>Print Values</i>
	<br>
	<c:out value="Hello"></c:out>
	<p>--------------</p>
	<br>


	<i>If And Else </i>
	<br>
	<!-- If Statements -->
	<c:if test="${param.user=='pradeep' }">
		<c:out value="Welcome"></c:out>
	</c:if>
	<!-- Else  -->
	<c:if test="${param.user !='pradeep' }">
		<c:out value="You Are Not Welcome"></c:out>
	</c:if>
	<p>--------------</p>
	<br>


	<i>Declare Variables</i>
	<br>
	<!-- Declare Variable -->
	<c:set var="x" value="1000"></c:set>
	<c:out value="${x}" />
	<p>--------------</p>
	<br>



	<i>For Each Loop</i>
	<br>
	<!-- For Each loop -->
	<c:forEach var="k" begin="1" end="10" step="2">
		<c:out value="${k}" />
	</c:forEach>
	<p>--------------</p>
	<br>


    <i>Send Data to Header.jsp</i>
    <br>
    <!-- Send Data to Another Page -->
	<c:url value="header.jsp" var="myURL">
		<c:param name="trackingId" value="1234" />
		<c:param name="reportType" value="Noye" />
	</c:url>
	<c:import url="${myURL}" />
	<p>--------------</p>
    <br>
    
    
	 <i>Switch Case</i>
    <br>
    <!-- Switch Case -->
	<c:set var="var1" value="${12}" />

	<c:choose>
		<c:when test="${var1==12}">
			<c:out value="Kanoy" />
		</c:when>
		<c:when test="${var1==13}">
			<c:out value="Bonny" />
		</c:when>
		<c:otherwise>
			<c:out value="Kog" />
		</c:otherwise>
	</c:choose>


 
   
</body>
</html>