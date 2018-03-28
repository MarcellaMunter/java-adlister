<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%--<% String username = request.getParameter("username");--%>
        <%--String password = request.getParameter("password");%>--%>

    <%--<%if (username != null && password != null){--%>
        <%--if(username.equals("admin") && password.equals("password")){--%>
            <%--response.sendRedirect("/profile.jsp");--%>
        <%--}--%>
        <%--else{--%>
            <%--response.sendRedirect("/login.jsp");--%>
        <%--}--%>
    <%--}--%>

    <%--%>--%>

<html>
<head>
    <title>Login Form</title>
</head>
<body>

    <form method="post">
        <p>Enter your username.</p>
        <input type="text" name="username" />
        <p>Enter your password.</p>
        <input type="password" name="password" />
        <input type="submit">
    </form>


    <c:if test="${param.username != null && param.username.equals(\"admin\")
    && param.password != null && param.password.equals(\"password\")}">
        <c:redirect url="profile.jsp"/>
    </c:if>




</body>
</html>
