<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<body>
<a href="./home">Home</a>
<a href="./logout">Logout</a>
<h4><%=msg%></h4>
<form action="./changepassword" method="post">
NewPassword:<input type="password" name="newpassword">
ChangePassword:<input type="password" name="changepassword">
<input type="submit" value="change">
</form>
</body>
</html>