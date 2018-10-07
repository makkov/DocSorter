<%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 07.10.2018
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<form action="/registration" method="post">
     <label>login <input type="loginOfOperator" name="loginOfOperator"/></label><br>
        <label>password <input type="password" name="password"/></label><br>
        <label>name <input type="nameOperator" name="nameOperator"/></label><br>
        <input type="submit">
</form>
</body>
</html>
