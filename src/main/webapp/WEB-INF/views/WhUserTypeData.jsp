<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WhUserTypeDataPage</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Type</th>
					<th>Code</th>
					<th>For</th>
					<th>Email</th>
					<th>Contact</th>
					<th>IdType</th>
					<th>ifOther</th>
					<th>idNumber</th>
				</tr>
				<!--for(ShipmentType ob:list){} -->
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.userId}</td>
						<td>${ob.userType}</td>
						<td>${ob.userCode}</td>
						<td>${ob.userFor}</td>
						<td>${ob.userEmail}</td>
						<td>${ob.userContact}</td>
						<td>${ob.userIdType}</td>
						<td>${ob.userIfOther}</td>
						<td>${ob.userIdNumber}</td>
						<td><a href="delete?sid=${ob.userId}">Delete</a>	
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