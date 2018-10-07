<%@ page import="pojo.Operator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 05.10.2018
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Operators list</title>
</head>
<body>
<H1>Список операторов:</H1>
<%
    List<Operator> list = (List<Operator>) request.getAttribute("operators");
    for (Operator operator : list) {%>
<a href="/operator?id=<%=operator.getId()%>"><%=operator.getId()%><%=operator.getName()%><%=operator.getRole()%>
</a><BR>
<%
    }
%>
<br>
<a href="/operators/createOperator">Create Operator</a><br>
<br>
<a href="/operators/changeRole">Change role of operator</a>
</body>
</html>
