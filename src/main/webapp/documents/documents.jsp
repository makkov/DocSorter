<%@ page import="pojo.Document" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: maksim
  Date: 20.10.2018
  Time: 18:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Documents</title>
</head>
<body>

<H1>Документы:</H1>
<%
    List<Document> list = (List<Document>) request.getAttribute("documents");
    for (Document document : list) {%>
<a href="/documents/viewDoc?id=<%=document.getId()%>"><%=document.getId()%> <%=document.getName()%></a><BR>
<%
    }
%>

<a href="/documents/addDocument">Add document</a>

</body>
</html>
