<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TradingPlatform</title>
<style>
.body {
	background-color: white;
}

.topDiv {
	border-width: 3px;
	border-bottom-style: ridge;
	width: 100%;
	height: 50px;
	display: flex;
}

.logo {
	margin-left: 80px;
}

.navbar {
	margin-left: 550px;
	margin-top: 10px;
}

.btn {
	border-radius: 1px;
	border-color: white;
	background-color: white;
	color: rgb(102, 100, 100);
	height: 45px;
	width: 75px;
	margin-left: 50px;
}

.btn:hover {
	color: rgb(67, 67, 184);
}

.btn1 {
	border-radius: 2px;
	border-color: rgb(84, 101, 173);
	background-color: rgb(84, 101, 173);
	color: white;
	height: 40px;
	width: 350px;
	margin-left: 25px;
	margin-top: 25px;
}

.btn1:hover {
	background-color: white;
	color: rgb(84, 101, 173);
}

.bt {
	margin-left: 275px;
}
</style>
</head>
<body class="body">
	<br>
	<jsp:include page="Header.jsp"></jsp:include>
	<br>


	<center>
		<img
			src='<spring:url value="/resources/images/image.png"></spring:url>' alt="img" height="250" width="400">
        <br>
        <br>
        <img src='<spring:url value="/resources/images/slogan.png"></spring:url>' alt="slogan">
    </center>

    <div class="bt">
        <button class="btn1"><a href="Register.jsp" class="btn1">Open Demat Account</a></button>
        <button class="btn1"><a href="Login.jsp" class="btn1">SignIn Account</a></button>

    </div>

    <br>
    <br>
    <hr >
    <center>All Rights Reserved. Copyright@2022</center>
</body>

</html>