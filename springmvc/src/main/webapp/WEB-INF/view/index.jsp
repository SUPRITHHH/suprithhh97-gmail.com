

<%
  String s = (String)request.getAttribute("msg");
%>
<html>
<body>
<h2 style="color:red">${msg}</h2>
<h2 style="color:green"><%=s %></h2>
<h2 style="color:yellow">${name}</h2>
<h2 style="color:orange">${id}</h2>
</body>
</html>
