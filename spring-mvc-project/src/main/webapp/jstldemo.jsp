<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
		List<Integer> nums = new ArrayList<Integer>(Arrays.asList(11, 22, 24, 34, 37, 43));
	%>
	<c:forEach var="num" items="<%=nums%>">
		<c:if test="${num%2!=0 }">
			<h3>${num }</h3>
		</c:if>
	</c:forEach>
</body>
</html>




