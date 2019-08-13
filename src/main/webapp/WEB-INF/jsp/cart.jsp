<%--
  Created by IntelliJ IDEA.
  User: kfalk
  Date: 12.08.2019
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Shopping cart</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="/css/style.css" rel="stylesheet">
</head>
<body style="padding-top: 56px">
<div class="bg">
    <jsp:include page="menu.jsp"></jsp:include>
    <div class="container">

        <div class="row">

            <jsp:include page="itemMenu.jsp"></jsp:include>

            <div class="col-lg-9">

                <br>
                <table class="table">
                    <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Mark</th>
                        <th scope="col">Model</th>
                        <th scope="col">Price</th>
                        <%--<th scope="col">Street</th>
                        <th scope="col">City</th>
                        <th scope="col"></th>--%>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="product" items="${requestScope.products}">
                        <tr>
                            <td>
                                <c:out value="${product.id}"/>
                            </td>
                            <td>
                                <c:out value="${product.mark}"/>
                            </td>
                            <td>
                                <c:out value="${product.model}"/>
                            </td>
                            <td>
                                $<c:out value="${product.price}"/>
                            </td>
                            <%--<td>
                                <c:out value="${user.address.street} ${user.address.houseNumber}"/>
                            </td>
                            <td>
                                <c:out value="${user.address.city}"/>
                            </td>
                            <td>
                                <a href="/delete/${user.id}">Delete</a>
                            </td>--%>

                        </tr>
                    </c:forEach>

                    </tbody>
                </table>
                <br>
                <div id="myCartDiv">
                    <br><a class="btn btn-success" href="#" role="button" style="font-size: 20px">PAY</a><br>
                </div>

            </div>
            <!-- /.col-lg-9 -->

        </div>

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
