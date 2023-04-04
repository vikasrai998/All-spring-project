<%@page import="org.jsp.usermvcapp.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%><%@ taglib
	uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<c:if test="${u!=null }">
		<h3>
			<a href="load?choice=2">Edit</a>
		</h3>
		<h3>
			<a href="view.jsp">Profile</a>
		</h3>
		<h3>
			<a href="delete?id=${u.getId() }">Delete</a>
		</h3>
		<h3>
			<a href="logout">Logout</a>
		</h3>
	</c:if>

</body>
</html>


