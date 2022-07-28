<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!-- Adding JSTL Core -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- Adding JSTL SQL -->
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="padding: 60px;">
    <h2>Welcome To JSTL</h2>
    <hr>
    
     <i>SQL Connection, Insert Data</i>
    <br>
    
    <form id="bookform">
    ISBN <input type="text" name="ISBN" /><br>
    Book Name <input type="text" name="bname" /><br>
    Author Name <input type="text" name="aname" /><br>
    Price <input type="text" name="price" /><br>
    Quantity <input type="text" name="qty" /><br>
    <input type="submit">
   
    </form>
    
    <script type="text/javascript">
    
    document.getElementById("bookform").reset();
    
    </script>
    
    
    
    <!-- SQL Connection And Access Data -->
    <sql:setDataSource var="con" driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/org1" user="root" password="1234" />
       
     <c:if test="${not empty param.ISBN  }">
      
    
    <sql:update dataSource="${con}" var="rs">
    insert into books(ISBN, bname, aname, price, qty) values(?, ?, ?, ? ,?)
    
    <sql:param  value="${param.ISBN}"/>
    <sql:param  value="${param.bname}"/>
    <sql:param  value="${param.aname}"/>
    <sql:param  value="${param.price}"/>
    <sql:param  value="${param.qty}"/>
 
    </sql:update>
    </c:if>
    
      <br>  <br>  <br>
    <i>SQL Connection, Access Data</i>
    <br>
    <!-- SQL Connection And Access Data -->
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