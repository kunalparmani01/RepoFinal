<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.jda.model.UserModel"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>

<body>
	<form action="logout" method="post">


		<button type="submit">Logout</button>
	</form>
	<%
		String userName = "";
	response.setHeader("cache-control","no-cache, no-store, must-revalidate");
		if (request.getSession().getAttribute("user") != null) {
			UserModel user = (UserModel) request.getSession().getAttribute("user");
			userName = user.getFirstName() + " " + user.getLastName();
		}else{
			response.sendRedirect("index.jsp");
		}
	%>
	Welcome:
	<%=userName%>
</body>
</html>