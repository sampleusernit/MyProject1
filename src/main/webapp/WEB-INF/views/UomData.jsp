<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UomDataPage</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Type</th>
					<th>Mode</th>
					<th>Desc</th>
				</tr>
				<!--for(ShipmentType ob:list){} -->
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.uomId}</td>
						<td>${ob.uomType}</td>
						<td>${ob.uomMode}</td>
						<td>${ob.uomDesc}</td>
						<td><a href="delete?sid=${ob.uomId}">Delete</a>	
					</tr>
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
		<h4>No Data Found!!</h4>
		</c:otherwise>
	</c:choose>
</body>
</html>