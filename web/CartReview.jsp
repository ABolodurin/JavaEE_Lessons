<%@ page import="SessionUserData.Cart" %><%--
  Created by IntelliJ IDEA.
  User: Леночка
  Date: 31.10.2022
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
</head>
<body>
    <% Cart cart = (Cart) session.getAttribute("c");%>
    <p> Наименование :<%= cart.getName() %> </p>
    <p> Количество :<%= cart.getQuantity() %> </p>

</body>
</html>
