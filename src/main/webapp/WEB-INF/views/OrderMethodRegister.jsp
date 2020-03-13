<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>OrderMethod</title>
</head>
<body>
	<h3>Welcome To OrderMethod Register Page</h3>
	<form:form action="save" method="POST" modelAttribute="orderMethod">
<pre>
OrderMode: <form:radiobutton path="orderMode" value="Sale" />Sale <form:radiobutton path="orderMode" value="Purchase" />Purchase

Order Code:<form:input path="orderCode" />

OrderType:<form:select path="orderType">
<form:option value="">-----Select------</form:option>
<form:option value="FIFO">FIFO</form:option>
<form:option value="LIFO">LIFO</form:option>
<form:option value="FCFO">FCFO</form:option>
<form:option value="FEFO">FEFO</form:option>
</form:select>

Order Accept:
<form:checkbox path="orderAcpt" value="Multi-Model" />Multi-Model 
<form:checkbox path="orderAcpt" value="Accept Return" />Accept Return

Description:<form:textarea path="orderDesc" />

<input type="submit" value="Create OrderMethod">

	</pre>
	</form:form>
	${message}
</body>
</html>