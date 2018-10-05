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
    <input type="nameOperator" name="nameOperator"/>
    <input type="categoryId" name="categoryId"/>
    <input type="submit">
</form>

</body>
</html>
