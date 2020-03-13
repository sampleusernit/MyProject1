<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>WhUserType</title>
</head>
<body>
	<h3>Welcome To WhUserType Register Page</h3>
	<form:form action="save" method="POST" modelAttribute="whUserType">
<pre>
UserType: <form:radiobutton path="userType" value="Vendor" />Vendor <form:radiobutton path="userType" value="Customer" />Customer

User Code:<form:input path="userCode" />
User For:<form:input path="userFor" value="Purchase/Sale"/>
User Email:<form:input path="userEmail" />
User Contact:<form:input path="userContact" />

UserIdType:<form:select path="userIdType">
<form:option value="">-----Select------</form:option>
<form:option value="Pan Card">Pan Card</form:option>
<form:option value="Aadhar Card">Aadhar Card</form:option>
<form:option value="Voter Id">Voter Id</form:option>
<form:option value="Other">Other</form:option>
</form:select>

*If Other : <form:input path="userIfOther"/>
Id Number : <form:input path="userIdNumber"/>

<input type="submit" value="CREATE WhUserType">

	</pre>
	</form:form>
	${message}
</body>
</html>