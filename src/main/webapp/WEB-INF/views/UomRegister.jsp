<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Uom</title>
</head>
<body>
	<h3>Welcome To Uom Register Page</h3>
	<form:form action="save" method="POST" modelAttribute="uom">
		<pre>Uom Type:
<form:select path="uomType">
<form:option value="">-----Select------</form:option>
<form:option value="Packing">Packing</form:option>
<form:option value="No Packing">No Packing</form:option>
<form:option value="-NA-">-NA-</form:option>
</form:select>

Uom Model:
<form:textarea path="uomMode" />

Description:
<form:textarea path="uomDesc" />

<input type="submit" value="CREATE UOM">

	</pre>
	</form:form>
	${message}
</body>
</html>