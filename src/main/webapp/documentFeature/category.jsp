<%@ page import="pojo.Category" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 07.10.2018
  Time: 22:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Category list</title>
</head>
<body>
<H1>Список категорий:</H1>
<%
    List<Category> list = (List<Category>) request.getAttribute("category");
    for (Category category : list) {%>
<a href="/category/fields?id=<%=category.getId()%>"><%=category.getId()%><%=category.getName()%>
</a><BR>
<%
    }
%>

<br>
<a href="/category/createCategory">Create category</a><br>

</body>
</html>
