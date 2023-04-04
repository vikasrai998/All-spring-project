<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${message!=null }">
		<h2>${ message}</h2>
	</c:if>
	<form action="loginuser" method="post">
		<input type="tel" name="phone" placeholder="Enter Your Phone Number"><br>
		<input type="password" name="password"
			placeholder="Enter Your Password"><br> <input
			type="submit" value="LOGIN">
	</form>
	<h3>
		<a href="load?choice=1">Click Here To Register</a>
	</h3>
</body>
</html>