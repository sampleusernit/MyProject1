<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%-- <%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>ShipmentType</title>
</head>
<body>
	<h3>Welcome To Shipment Type Register Page</h3>
	<form:form action="save" method="POST" modelAttribute="shipmentType">
		<pre>Shipment Mode:
<form:select path="shipMode">
<form:option value="">-----Select------</form:option>
<form:option value="Air">Air</form:option>
<form:option value="Truck">Truck</form:option>
<form:option value="Ship">Ship</form:option>
<form:option value="Train">Train</form:option>
</form:select>
Shipment Code:
<form:input path="shipCode" />
Enable Shipment:
<form:select path="shipEnb">
<form:option value="">-----Select------</form:option>
<form:option value="Yes">Yes</form:option>
<form:option value="No">No</form:option>
</form:select>
Shipment Grade:
<form:radiobutton path="shipGrade" value="A" />A
<form:radiobutton path="shipGrade" value="B" />B
<form:radiobutton path="shipGrade" value="C" />C
Description:
<form:textarea path="shipDesc" />
<input type="submit" value="CREATE SHIPMENT">

	</pre>
	</form:form>
	${message}
</body>
</html>