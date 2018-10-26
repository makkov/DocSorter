<%@ page import="pojo.Value" %>
<%@ page import="java.util.List" %>
<%@ page import="pojo.Document" %>
<%@ page import="repository.dao.DocumentDao" %><%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 20.10.2018
  Time: 19:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Document</title>
</head>
<body>

<H1>Документы:</H1>
<%
    List<Value> list = (List<Value>) request.getAttribute("valueList");
    for (Value value : list) {%>
<%=value.getId()%><%=value%></a><BR>
<%
    }
%>

</body>
</html>
