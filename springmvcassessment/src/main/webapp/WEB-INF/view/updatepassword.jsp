<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./logout" style="float:right;">Logout</a>
<a href="./home">Home</a>
<fieldset>
<legend>ChangePassword</legend>
 <form action='./changepassword' method='post' style="text-align:center">
 <table>
 <tr>
  <td>ChangePassword</td>
   <td><input name='password' type="password"></td>
 </tr>
 <tr>
  <td>RetypePassword</td>
   <td><input name='confirmpassword' type="password"></td>
 </tr>
 <tr>
 <td><input type="reset" value="Reset"></td>
 <td><input type="submit" value="ChangePassword"></td>
 </tr>
 </table>
 </form>
 </fieldset>
</body>
</html>