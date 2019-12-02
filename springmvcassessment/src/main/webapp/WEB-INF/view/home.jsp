
<%@page import="com.tyss.springmvcassessment.beans.ProductBean"%>
<%@page import="com.tyss.springmvcassessment.beans.RetailerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%
      RetailerBean bean = (RetailerBean)session.getAttribute("bean");
    %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./updatepassword">Update Password</a>

<a href="./logout" style="float:right;">Logout</a>
<h2>Welcome <%=bean.getName() %></h2>
<fieldset>
   <legend>Search Product</legend>
   <form action="./search">
   <table>
   <tr>
    <td>ID:</td>
    <td><input type="number" name="id"></td>
    <td><input type="submit" value="Search"></td>
   </tr>
   </table>
   </form>
</fieldset>
<%
   ProductBean productbean =(ProductBean)request.getAttribute("bean");
%>
<%
if(productbean!=null){
%>

<table>
<tr>
<th>ID</th>
<th>Product Name</th>
<th>Price</th>

</tr>
<tr>
<td><%=productbean.getPid() %></td>
<td><%=productbean.getPname() %></td>
<td><%=productbean.getPriceperunit() %></td>
<a href="./order">order</a>
</tr>
</table>
<%
}
%>

<h3>${msg}</h3>
</body>
</html>