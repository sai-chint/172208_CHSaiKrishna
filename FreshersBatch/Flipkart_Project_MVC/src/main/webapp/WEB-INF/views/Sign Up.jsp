<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<style>
body{
	background-color: lightblue
}
</style>
</head>
<body>

<h1>Welcome User !!!</h1>
	<form   action ="SignUp"   method ="post">
		<div style="text-align:center"> 
			<h3>Register yourself.</h3>
		</div>
<table style="width:70%">
	
	<tr>
		<td>FirstName:</td>
		<td><div style="text-align:center">
				<input type="text" style="width:70%" name="FirstName" required>
			</div><br>
		</td>	
	</tr>
	
	<tr>
		<td>LastName:</td>
		<td><div style="text-align:center">
				<input type="text" style="width:70%" name="LastName" required>
			</div><br> 
		</td>
	</tr>
		
	<tr>
		<td>Email:</td>
		<td><div style="text-align:center">
				<input type="email" style="width:70%" name="Email" required>
			</div><br>
		</td>
	</tr>
	
	<tr>
		<td>Password:</td>
		<td><div style="text-align:center"> 
				<input type="password" style="width:70%" name="Password" required>
			</div><br>
		</td>
	</tr>
	
	<tr>
		<td>Retype Password:</td>
		<td><div style="text-align:center"> 
				<input type="password" style="width:70%" name="Re-Password" required>
			</div><br>
		</td>
	</tr>
	
	<tr>
		<td>Mobile Number:</td>
		<td><div style="text-align:center"> 
				<input type="number" style="width:70%" name="Mobile Nmber" required>
					<!-- minlength="10" maxlength="10" size="10" -->
			</div><br>
		</td>
	</tr>
			
	<tr>		
		<td>Gender:</td>
		<td><div style="text-align:center"> 
				<input type="radio" name="Gender" value="Male" required>Male</input>
				<input type="radio" name="Gender" value="Female" required>Female</input>
			</div><br>
		</td>
	</tr>
	
</table>
			<div style="text-align:center"> 
				<input type="submit" value="Submit">
			</div><br>
			
			<div style="text-align:center">
				<a href="Login">Already a User? Login</a>
			</div>
			
	</form>
</body>
</html>