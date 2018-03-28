<%--
  Created by IntelliJ IDEA.
  User: markmunter
  Date: 3/28/18
  Time: 9:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name Page</title>
</head>
<body>

    <form method="post" action="/name">
        <p>Enter your name.</p>
        <input type="text" name="name"/>
        <input type="submit">
    </form>


</body>
</html>
