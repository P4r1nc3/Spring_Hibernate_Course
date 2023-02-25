<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
	<head>
	
		<title>Customer Registration Form</title>
		
		<style>
			.error{colour:red;}
		</style>
		
	</head>
	<body>
		<form:form action="processForm" modelAttribute="customer">
		
			First Name: <form:input path="firstName" />
			<br><br>
			
			Last Name: <form:input path="lastName" />
			
			<form:errors parh="lastName" cssClass="error" />
			
			<br><br>
			
			<input type="submit" value="Submit" />
		</form:form>
	</body>
</html>







