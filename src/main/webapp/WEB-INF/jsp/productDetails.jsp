<%--
  Created by IntelliJ IDEA.
  User: kfalk
  Date: 09.08.2019
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Product details</title>
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

                <div class="card mt-4">
                    <img class="card-img-top img-fluid" src="<c:out value="${requestScope.product.imageUrl}"/>" alt="">
                    <div class="card-body">
                        <c:if test="${requestScope.type.equals('cloth')}">
                            <h3 class="card-title"><c:out value="${requestScope.product.clothType}"/> <c:out
                                    value="${requestScope.product.mark}"/></h3>
                        </c:if>
                        <c:if test="${requestScope.type.equals('shoes')}">
                            <h3 class="card-title">Shoes <c:out value="${requestScope.product.mark}"/></h3>
                        </c:if>
                        <c:if test="${requestScope.type.equals('equipment')}">
                            <h3 class="card-title"><c:out value="${requestScope.product.name}"/> <c:out
                                    value="${requestScope.product.mark}"/></h3>
                        </c:if>

                        <h4>$<c:out value="${requestScope.product.price}"/></h4>
                        <c:if test="${requestScope.type.equals('cloth')}">
                            <p class="card-text"><c:out value="${requestScope.product.clothType}"/> <c:out
                                    value="${requestScope.product.mark}"/> <c:out
                                    value="${requestScope.product.model}"/>
                                <c:out value="${requestScope.product.discipline}"/> Size: <c:out
                                        value="${requestScope.product.clothSize}"/></p>
                        </c:if>
                        <c:if test="${requestScope.type.equals('shoes')}">
                            <p class="card-text">Shoes <c:out value="${requestScope.product.mark}"/> <c:out
                                    value="${requestScope.product.model}"/>
                                <c:out value="${requestScope.product.discipline}"/> Size: <c:out
                                        value="${requestScope.product.shoesSize}"/></p>
                        </c:if>
                        <c:if test="${requestScope.type.equals('equipment')}">
                            <p class="card-text"><c:out value="${requestScope.product.name}"/> <c:out
                                    value="${requestScope.product.mark}"/> <c:out
                                    value="${requestScope.product.model}"/>
                                <c:out value="${requestScope.product.discipline}"/> <c:out
                                        value="${requestScope.product.description}"/></p>
                        </c:if>
                        <span class="text-warning">&#9733; &#9733; &#9733; &#9733; &#9734;</span>
                        4.0 stars
                        <form method="post" action="/addToCart">
                            <div id="buyDiv">
                                Quantity: <input type="number" name="quantity">
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
                                <input type="hidden" class="form-control" name="prodType" value="${requestScope.type}">
                                <input type="hidden" class="form-control" name="prodId"
                                       value="${requestScope.product.id}">
                                <br>
                                <button class="btn btn-success" type="submit" id="buy">Add to cart</button>
                                <br>
                            </div>
                        </form>
                    </div>
                </div>

                <!-- /.card -->

                <%--<div class="card card-outline-secondary my-4">
                    <div class="card-header">
                        Product Reviews
                    </div>
                    <div class="card-body">
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore,
                            similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat
                            laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                        <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                        <hr>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore,
                            similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat
                            laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                        <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                        <hr>
                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Omnis et enim aperiam inventore,
                            similique necessitatibus neque non! Doloribus, modi sapiente laboriosam aperiam fugiat
                            laborum. Sequi mollitia, necessitatibus quae sint natus.</p>
                        <small class="text-muted">Posted by Anonymous on 3/1/17</small>
                        <hr>
                        <a href="#" class="btn btn-success">Leave a Review</a>
                    </div>
                </div>--%>
                <!-- /.card -->

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
