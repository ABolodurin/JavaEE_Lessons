<%@ page import="java.util.Date" %>
<%@ page import="logic.TestClass" %><%--
  Created by IntelliJ IDEA.
  User: Леночка
  Date: 30.10.2022
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test Jsp</title>
</head>
<body>
<% String name = request.getParameter("name");
    if (name == null)
        name = "";
    else name = "for " + name; %>
<h1>Testing Jsp <%=name%>
</h1>
<p>
    <% Date date = new Date();
        String str = "Текущая дата" + date;
    %>

    <%= date
    %>

    <% out.println(TestClass.getInfo());
    %>
</p>
</body>
</html>
