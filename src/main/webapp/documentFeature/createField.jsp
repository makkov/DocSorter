<%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 09.10.2018
  Time: 0:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create field</title>
</head>
<body>

<form action="/category/fields/createField" method="post">
    <input hidden name="id" value="<%=request.getParameter("id")%>">
    <label>field name  <input type="nameField" name="nameField"/></label><br>
    <input type="submit">
</form>

</body>
</html>
