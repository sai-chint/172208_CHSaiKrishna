<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

<style>
body{
	background-color: lightblue
}
</style>

</head>
<body>

<h1>Welcome User !!!</h1><br>
<form action="Login" method = "post">
<table style="width:75%">
	<tr>
		<td>Email :</td>
		<td><div style="text-align:center" >
				<input type="text" style="width:55%" name="Email" required>
			</div><br>
		</td>
	</tr>
	
	<tr>
		<td>Password :</td>	
		<td><div style="text-align:center">
				<input type="password" style="width:55%" name="Password" required>
			</div><br>
		</td>
	</tr>
		
</table>		
<div style="text-align:center"> 
		<a href = "Home"><button type="submit" >Login</button></a>
	</div>
<br>		
<div style="text-align:center">
	<a href="Sign Up">New User? Sign Up</a>
</div>		
</form>
</body>
</html>