<%--
  Created by IntelliJ IDEA.
  User: markmunter
  Date: 3/28/18
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Background Color</title>
    <style>
        body{
            background-color: ${param.color};
        }
    </style>
</head>
<body>
    <h1>${param.color} is your favorite color!</h1>
</body>
</html>
