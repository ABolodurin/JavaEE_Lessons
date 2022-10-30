<%--
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
        <h1>Testing Jsp</h1>
        <p>
            <% java.util.Date date = new java.util.Date();
                String str = "Текущая дата" + date;
            %>
            <%=  date %>

            <% out.println("What the..");
            %>
        </p>
</body>
</html>
