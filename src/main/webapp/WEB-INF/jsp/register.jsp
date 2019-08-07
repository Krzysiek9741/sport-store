<%--
  Created by IntelliJ IDEA.
  User: kfalk
  Date: 07.08.2019
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Register</title>
</head>
<body style="padding-top: 36px">
<div class="bg">
    <jsp:include page="menu.jsp"></jsp:include>
    <div class="container" style="text-align: center">

        <form method="POST" action="${path}/register">
            <p style="color: red">${error}</p>
            <p style="color: green">${message}</p>
            <br>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="username" class="lab2">Username</label>
                </div>
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="username" placeholder="Username" name="username">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="password" class="lab2">Password</label>
                </div>
                <div class="col-xs-4">
                    <input type="password" class="form-control" id="password" placeholder="Password" name="password">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="firstName" class="lab2">First name</label>
                </div>
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="firstName" placeholder="First Name" name="firstName">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="lastName" class="lab2">Last name</label>
                </div>
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="lastName" placeholder="Last Name" name="lastName">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="street" class="lab2">Street</label>
                </div>
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="street" placeholder="Street" name="street">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="houseNumber" class="lab2">House number</label>
                </div>
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="houseNumber" placeholder="House number" name="houseNumber">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="zipCode" class="lab2">Zip code</label>
                </div>
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="zipCode" placeholder="Zip code" name="zipCode">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-xs-2">
                    <label for="city" class="lab2">City</label>
                </div>
                <div class="col-xs-4">
                    <input type="text" class="form-control" id="city" placeholder="City" name="city">
                </div>
            </div>

            <%--<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">--%>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
            <button type="submit" class="btn btn-primary">Register</button>
        </form>




    </div>
    <footer class="py-5 bg-dark">
        <div class="container">
            <p class="m-0 text-center text-white"><a href="admin">Copyright &copy; Krzysztof Falkowski 2019</a></p>
        </div>
        <!-- /.container -->
    </footer>

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
