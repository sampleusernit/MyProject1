<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ShipmentDataPage</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:choose>
		<c:when test="${!empty list }">
			<td><a href="excel">Excel Export</a></td>
			<td><a href="pdf">Pdf Export</a></td>
			<table border="1">
				<tr>
					<th>ID</th>
					<th>MODE</th>
					<th>CODE</th>
					<th>ENABLE</th>
					<th>GRADE</th>
					<th>NOTE</th>
					<th>Operations</th>
				</tr>
				<!--for(ShipmentType ob:list){} -->
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.shipId}</td>
						<td>${ob.shipMode}</td>
						<td>${ob.shipCode}</td>
						<td>${ob.shipEnb}</td>
						<td>${ob.shipGrade}</td>
						<td>${ob.shipDesc}</td>
						<td><a href="delete?sid=${ob.shipId}">Delete</a>	
						<a href="edit?sid=${ob.shipId}">Edit</a>
						<a href="view?sid=${ob.shipId}">View</a>
						</td>
					</tr>
				</c:forEach>
				<tr>
			</table>
		</c:when>
		<c:otherwise>
		<h4>No Data Found!!</h4>
		</c:otherwise>
	</c:choose>
</body>
</html>