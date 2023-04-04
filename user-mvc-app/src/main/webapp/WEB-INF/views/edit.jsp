<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${u!=null }">
		<form:form action="edit" modelAttribute="user">
			<form:label path="id">ID</form:label>
			<form:input path="id" value="${u.getId() }" readonly="true" />
			<br>
			<form:label path="name">Name</form:label>
			<form:input path="name" value="${u.getName() }" />
			<br>
			<form:label path="age">Age</form:label>
			<form:input path="age" value="${u.getAge() }" />
			<br>
			<form:label path="phone">Phone</form:label>
			<form:input path="phone" value="${u.getPhone() }" />
			<br>
			<form:label path="password">Password</form:label>
			<form:input path="password" value="${u.getPassword() }" />
			<br>
			<form:button>Update</form:button>
		</form:form>
	</c:if>
</body>
</html>





