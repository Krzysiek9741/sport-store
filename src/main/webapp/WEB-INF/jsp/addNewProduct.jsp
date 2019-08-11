<%--
  Created by IntelliJ IDEA.
  User: kfalk
  Date: 05.08.2019
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Login</title>
</head>
<body style="padding-top: 36px">
<div class="bg">
    <jsp:include page="menu.jsp"></jsp:include>
    <div class="container">

        <jsp:include page="adminMenu.jsp"></jsp:include>

        <form method="POST" action="${path}/login">
            <p style="color: red">${error}</p>
            <p style="color: green">${message}</p>
            <div class="form-group">
                <label for="username" id="lab1">Enter username</label>
                <input type="text" class="form-control" id="username" placeholder="Username" name="username">
            </div>
            <div class="form-group">
                <label for="password" id="lab2">Enter password</label>
                <input type="password" class="form-control" id="password" placeholder="Password" name="password">
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">

            <button type="submit" class="btn btn-primary">Login</button>
        </form>
        <h1><a style="font-size: 30px" href="register">Register</a></h1>

        <%--<form action="${path}/login" method="post" class="form-signin">
            <p style="color: red">${error}</p>
            <p style="color: green">${message}</p>
            <p>User Name: <input type="text" name="username" placeholder="Enter User Name"/></p>
            <p>Password: <input type="password" name="password" placeholder="Enter Password"/></p>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <p><button type="submit">Login</button></p>
        </form>--%>

    </div>
    <jsp:include page="footer.jsp"></jsp:include>

    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
</div>
</body>
</html>

