<%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 07.10.2018
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%
    if ("wrongLogin".equals(request.getParameter("errorCode"))) {
%>
<p style="color: #FF2222"> Error: wrongLogin.</p>
<%
    }
%>
<form action="/login" method="post" title="Make user">
    <label>enter the username <input type="login" name="login"/></label><br>
    <label>enter the password <input type="password" name="password"/></label>
    <input type="submit" title="ok">
</form>

</body>
</html>
