<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>OrderMethod Data Page</title>
</head>
<body>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:choose>
		<c:when test="${!empty list }">
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Mode</th>
					<th>Code</th>
					<th>Type</th>
					<th>Accept</th>
					<th>Description</th>
					<th>Operations</th>
				</tr>
				<!--for(OrderMethod ob:list){} -->
				<c:forEach items="${list}" var="ob">
					<tr>
						<td>${ob.orderId}</td>
						<td>${ob.orderMode}</td>
						<td>${ob.orderCode}</td>
						<td>${ob.orderType}</td>
						<td>${ob.orderAcpt}</td>
						<td>${ob.orderDesc}</td>
						<td><a href="delete?sid=${ob.orderId}">Delete</a>	
						<a href="edit?sid=${ob.orderId}">Edit</a>
						<a href="view?sid=${ob.orderId}">View</a></td>
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