<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String user = (String) session.getAttribute("user");
		String person = (String) session.getAttribute("person");
		String meet = (String) session.getAttribute("me");
	%>
	<h1>User:${user }</h1>
	<h1>Person:${person }</h1>
	<h1>me:${meet }</h1>
</body>
</html>