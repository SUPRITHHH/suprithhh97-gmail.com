<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
<fieldset>
<legend>Login</legend>
 <form action='./login' method='post' style="text-align:center">
 <table>
 <tr>
   <td>ID</td>
   <td><input name='id' type='number'></td>
 </tr>
 <tr>
  <td>Password</td>
   <td><input name='password' type="password"></td>
 </tr>
 <tr>
 <td><input type="reset" value="Reset"></td>
 <td><input type="submit" value="Login"></td>
 </tr>
 </table>
 </form>
 </fieldset>
 <a href="./register">Click Here To Register</a>
</body>
</html>