<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Members Page</title>
<link rel="stylesheet" href= "https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css">


</head>
<body>

<h1>List of Current Member</h1>

<%--${members} --%> <!-- not sure what the EL tag is for since it didnt work with "members"-->



<table border ="1">

	<c:forEach var="a" items="${members}">
	<tr> 
		<!--  left out title on purpose --> 
			<td> ${a.membername} </td>
			
		<td><a href = "update?id=${a.memberid}">Edit</a></td>
			<td><a href = "delete?id=${a.memberid}">Delete</a></td>
		
		
	</tr>
	
	
	</c:forEach>
</table>






</body>
</html>