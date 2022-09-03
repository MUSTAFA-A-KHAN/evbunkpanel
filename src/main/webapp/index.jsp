<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>ChatBot</title>
</head>
<body>
<h1> login form</h1>

<form name="loginform" method="post" action="Hello">
	UserName:<input type="text" name="username"/><br>
	Password:<input type="password" name="password"/> <br>
	<input type="submit" value="Login"/>
</form>
<form name="loginform" method="get" action="Hello">
	
	<input type="submit" value="Login"/>
</form>
<form name="newloginform" method="post" action="loginservlet">

	 UserName:<input type="text" name="username"/><br>
	 Password:<input type="password" name="password"/> <br>
	<input type="submit" value="sessionout"/>
</form>
<form name="newloginform" method="post" action="loginservlet">

	 UserName:<input type="text" name="username"/><br>
	 Password:<input type="password" name="password"/> <br>
	<input type="submit" value="sessionout"/>
</form>
</body>
</html>