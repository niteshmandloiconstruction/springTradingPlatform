<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Open Demat Account</title>
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
        
        .formright{
        margin-left: 375px;
        	margin-top: 25px;
        	border-style: ridge;
        	width: 600px;
        	height: 300px;
        }
        
        .form{
        margin-left: 135px;
        }
</style>

</head>
<body>

 <br>
   <jsp:include page="Header.jsp"></jsp:include>
    <br>

<div class="formright">
	
		<h4 class="form"><u>Open Demat Account</u></h4>
		
		<form action="Registration" method="post" class="form">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" placeholder="Enter your name here"
						name="name" required="required"></td>
				</tr>
				<tr>
					<td>Address:</td>
					<td><input type="text" placeholder="Enter your Address here"
						name="add" required="required"></td>
				</tr>
				<tr>
					<td>DOB:</td>
					<td><input type="text" placeholder="Enter your DOB here"
						name="dob" required="required"></td>
				</tr>

				<tr>
					<td>UserID:</td>
					<td><input type="text" placeholder="Enter your User Id here"
						name="uid" required="required"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password"
						required="required" placeholder="Enter your password here" name="pwd"></td>
				</tr>
				
				<tr>
					<td>PAN Card No.:</td>
					<td><input type="text" required="required"
						placeholder="Enter your PAN here" name="pan"></td>
				</tr>

				<tr>
					<td></td>
					<td><input type="submit" value="Sign Up"></input>
				</tr>
				</td>
			</table>
		</form>
	</div>
	<br>
	
	<center><img src="slogan.png" alt="slogan"></center>
	<br>
	 <hr >
    <center>All Rights Reserved. Copyright@2022</center>


</body>
</html>