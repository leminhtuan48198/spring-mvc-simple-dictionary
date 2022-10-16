<%--
  Created by IntelliJ IDEA.
  User: lemin
  Date: 10/16/2022
  Time: 9:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Translator</title>
</head>
<body>
<form action="/translate" method="post">
    <input type="text" name="word">
    <button>translate</button>
    <c:if test="${empty mean}">Not found </c:if>
    <c:if test="${ not empty mean}"><c:out value="${mean}"></c:out> </c:if>
</form>
</body>
</html>
