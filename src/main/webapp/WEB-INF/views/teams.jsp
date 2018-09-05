<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teams page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css">

</head>
<body>

	<h1>List of Teams</h1>


	<table border="1">

		<c:forEach var="per" items="${teammy}">
		
			<tr>
				<!--  left out title on purpose -->
				<td>${per.teamname}</td>

				<td><a href="update?id=${per.teamid}">Edit</a></td>
				<td><a href="delete?id=${per.teamid}">Delete</a></td>


			</tr>


		</c:forEach>
	</table>


</body>
</html>