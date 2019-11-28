<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page session="false" %>
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"/>
<%

 String id = "";
 Cookie[] cookies = request.getCookies();
 if(cookies!=null) {
  for(Cookie cookie : cookies) {
	if(cookie.getName().equals("alwaysRemember")) {
		id = cookie.getValue();
	}
 }
}

%>
<body>
<h4><%=msg%></h4>
<form action='./login' method='post'>
<table>
 <tr>
   <td>ID</td>
   <td><input name='id' type='number' value='<%=id%>'></td>
 </tr>
  <tr>
    <td>Password</td>
    <td><input name='password' type='password'></td>
  </tr>
  <tr>
    <td><input type='checkbox' name='RememberMe' value='checked' >Remember Me</td>
   </tr>
   <tr>
     <td><input type='reset' value='reset' name='reset'></td>
     <td><input type='submit'  value='login' name='login'></td>
   </tr>
   </table>
   </form>
     <a href='./register.html'>Register</a>
</body>
</html>