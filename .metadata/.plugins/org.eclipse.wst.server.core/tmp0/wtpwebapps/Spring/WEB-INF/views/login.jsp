<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<form action="login" method="post"modelattribute = "UserModel">
		<table style="with: 50%">
 
			<tr>
				<td>UserName</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
			     <%
			           String passwordError = "";
			            if(request.getAttribute("passwordError") != null){
			            	passwordError = request.getAttribute("passwordError").toString();
			            }
			     %>
			     <p><%=passwordError %></p>
			     <br>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
			     <%
			           String usernameError = "";
			            if(request.getAttribute("usernameError") != null){
			            	usernameError = request.getAttribute("usernameError").toString();
			            }
			     %>
			     <p><%=usernameError %></p>
			     <br>
			</tr>
		</table>
		<input type="submit" value="Login" /></form>
		<a href="registrationform"><p>Create New Account</p></a>
				<a href="forgotpasswordform"><p>Forget Password</p></a>
		
		
</body>
</html>