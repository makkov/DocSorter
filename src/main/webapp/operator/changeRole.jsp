<%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 05.10.2018
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change role of operator</title>

</head>
<body>
<form action="/operators/changeRole" method="post">
    <input type="operatorId" name="operatorId"/>
    <input type="newRoleId" name="newRoleId"/>
    <input type="submit">
</form>

</body>
</html>
