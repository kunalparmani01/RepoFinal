<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<form action="resetpassword" method="post"modelattribute = "UserModel">
		<table style="with: 50%">
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
			     <br>
			</tr>
		</table>
		<input type="submit" value="Submit" /></form>
</body>
</html>