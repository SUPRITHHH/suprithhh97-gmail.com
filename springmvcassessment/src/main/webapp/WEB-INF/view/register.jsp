<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
<legend>Register</legend>
 <form action='./register' method='post' style="text-align:center">
 <table>
 <tr>
   <td>Name</td>
   <td><input name='name' type='text'></td>
 </tr>
 <tr>
  <td>Email</td>
   <td><input name='email' type='email'></td>
 </tr>
 <td>Password</td>
   <td><input name='password' type="password"></td>
 </tr>
 
 
 <tr>
 <td><input type="reset" value="Reset"></td>
 <td><input type="submit" value="Register"></td>
 </tr>
 </table>
 </form>
 </fieldset>
 <a href="./login">Click Here For Login</a>
</body>
</html>