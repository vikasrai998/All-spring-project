<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int num = 77;
	%>
	
	<c:choose>
		<c:when test="<%=num%2==0%>">
			<h1><%=num %>is Even Number</h1>
		</c:when>
		<c:otherwise>
			<h1><%=num %>is odd Number</h1>
		</c:otherwise>
	</c:choose>
</body>
</html>