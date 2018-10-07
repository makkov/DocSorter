<%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 05.10.2018
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create operators</title>

</head>
<body>
<form action="/operators/createOperator" method="post">
    <label>login <input type="loginOfOperator" name="loginOfOperator"/></label><br>
    <label>password <input type="password" name="password"/></label><br>
    <label>name <input type="nameOperator" name="nameOperator"/></label><br>
    <label>isActive <input type="isActive" name="isActive"/></label><br>
    <label>number of role <input type="categoryId" name="categoryId"/></label>
    <input type="submit">
</form>

</body>
</html>
