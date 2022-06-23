<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignIn Account</title>
<style>
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

.formright {
	margin-left: 375px;
	margin-top: 25px;
	border-style: ridge;
	width: 600px;
	height: 200px;
}

.form {
	margin-left: 135px;
}
</style>

</head>
<body>

	<br>
	<jsp:include page="Header.jsp"></jsp:include>
	<br>

	<div class="formright">

		<h4 class="form">
			<u>SignIn Account</u>
		</h4>

		<form action="SignIn" method="post" class="form">
			<table>
				<tr>
					<td>UserID:</td>
					<td><input type="text" placeholder="Enter your User Id here"
						name="userID" required="required"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password"
						placeholder="Enter your password here" name="userPassword"
						required="required"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Sign In"></input></td>
				</tr>

			</table>
		</form>
	</div>
	<br>
	<br>
	<br>
	<br>
	<center>
		<img src='<spring:url value="/resources/images/slogan.png"></spring:url>' alt="slogan">
	</center>
	<br>
	<br>
	<br>
	<hr>
	<center>All Rights Reserved. Copyright@2022</center>

</body>
</html>