<%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 23.10.2018
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add document</title>
</head>
<body>

<form action="/documents/addDocument" method="post">
    <label>operator id  <input type="operatorId" name="operatorId"/></label><br>
    <label>category id  <input type="categoryId" name="categoryId"/></label><br>
    <label>doc name  <input type="nameDoc" name="nameDoc"/></label><br>
    <input type="submit" title="ok">
</form>

</body>
</html>
