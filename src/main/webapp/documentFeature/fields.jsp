<%@ page import="pojo.Field" %>
<%@ page import="java.util.List" %>
<%@ page import="pojo.Category" %><%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 08.10.2018
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fields</title>
</head>
<body>

<H1>Список полей:</H1>
<%
    List<Field> list = (List<Field>) request.getAttribute("fieldList");
    for (Field field : list) {%>
<%=field.getId()%><%=field.getName()%>
</a><BR>
<%
    }
%>
<br>

<a href="/category/fields/createField?id=<%=request.getParameter("id")%>">Create field</a><br>


</body>
</html>
