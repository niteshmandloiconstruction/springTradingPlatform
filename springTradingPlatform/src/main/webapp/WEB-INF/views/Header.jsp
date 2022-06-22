<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="topDiv">
		<div class="logo">
			<img
				src='<spring:url value="/resources/images/logo.png"></spring:url>'
				alt="logo">
		</div>

		<div class="navbar">

			<a href="Index.jsp" class="btn"><b>Home</b></a> <a href=""
				class="btn"><b>About</b></a> <a href="Register.jsp" class="btn"><b>Open
					Demat Account</b></a>

		</div>

	</div>

</body>
</html>