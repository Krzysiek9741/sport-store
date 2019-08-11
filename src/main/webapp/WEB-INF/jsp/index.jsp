<%--
  Created by IntelliJ IDEA.
  User: kfalk
  Date: 05.08.2019
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Podlasie - sport store</title>
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

                <div id="carouselExampleIndicators" class="carousel slide my-4" data-ride="carousel">
                    <ol class="carousel-indicators">
                        <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                        <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner" role="listbox">
                        <div class="carousel-item active">
                            <img class="d-block img-fluid" src="https://wia.id/wmedia/wp-content/uploads/2015/01/29.png"
                                 alt="First slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block img-fluid"
                                 src="http://ae01.alicdn.com/kf/HTB1Ogt2KXYqK1RjSZLeq6zXppXaE.jpg" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block img-fluid"
                                 src="https://www.squashtime.pl/images/7S487250_Rq%20W14%20Prince%20Airlite%20125%20TEAM_02.jpg"
                                 alt="Third slide">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>

                <div class="row">

                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="/details/cloth/${clothes[0].id}"><img class="card-img-top"
                                             src="<c:out value="${requestScope.clothes[0].imageUrl}"/>" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="/details/cloth/<c:out value="${requestScope.clothes[0].id}"/>"><c:out value="${requestScope.clothes[0].clothType}"/> <c:out
                                            value="${requestScope.clothes[0].mark}"/></a>
                                </h4>
                                <h5>$<c:out value="${requestScope.clothes[0].price}"/></h5>
                                <p class="card-text"><c:out value="${requestScope.clothes[0].mark}"/> <c:out
                                        value="${requestScope.clothes[0].model}"/>
                                    <c:out value="${requestScope.clothes[0].discipline}"/></p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="/details/equipment/${equipment[0].id}"><img class="card-img-top"
                                             src="<c:out value="${requestScope.equipment[0].imageUrl}"/>" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="/details/equipment/${equipment[0].id}"><c:out value="${requestScope.equipment[0].name}"/> <c:out
                                            value="${requestScope.equipment[0].mark}"/></a>
                                </h4>
                                <h5>$<c:out value="${requestScope.equipment[0].price}"/></h5>
                                <p class="card-text"><c:out value="${requestScope.equipment[0].mark}"/> <c:out
                                        value="${requestScope.equipment[0].model}"/>
                                    <c:out value="${requestScope.equipment[0].discipline}"/><br><c:out
                                            value="${requestScope.equipment[0].description}"/></p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="/details/shoes/${shoes[0].id}"><img class="card-img-top"
                                             src="<c:out value="${requestScope.shoes[0].imageUrl}"/>" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="/details/shoes/${shoes[0].id}">Shoes <c:out value="${requestScope.shoes[0].mark}"/></a>
                                </h4>
                                <h5>$<c:out value="${requestScope.shoes[0].price}"/></h5>
                                <p class="card-text">Shoes <c:out value="${requestScope.shoes[0].mark}"/> <c:out
                                        value="${requestScope.shoes[0].model}"/><br>
                                    <c:out value="${requestScope.shoes[0].discipline}"/></p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="/details/cloth/${clothes[1].id}"><img class="card-img-top"
                                             src="<c:out value="${requestScope.clothes[1].imageUrl}"/>" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="/details/cloth/${clothes[1].id}"><c:out value="${requestScope.clothes[1].clothType}"/> <c:out
                                            value="${requestScope.clothes[1].mark}"/></a>
                                </h4>
                                <h5>$<c:out value="${requestScope.clothes[1].price}"/></h5>
                                <p class="card-text"><c:out value="${requestScope.clothes[1].mark}"/> <c:out
                                        value="${requestScope.clothes[1].model}"/>
                                    <c:out value="${requestScope.clothes[1].discipline}"/></p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="/details/shoes/${shoes[1].id}"><img class="card-img-top"
                                             src="<c:out value="${requestScope.shoes[1].imageUrl}"/>" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="/details/shoes/${shoes[1].id}">Shoes <c:out value="${requestScope.shoes[1].mark}"/></a>
                                </h4>
                                <h5>$<c:out value="${requestScope.shoes[1].price}"/></h5>
                                <p class="card-text">Shoes <c:out value="${requestScope.shoes[1].mark}"/> <c:out
                                        value="${requestScope.shoes[1].model}"/><br>
                                    <c:out value="${requestScope.shoes[1].discipline}"/></p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 mb-4">
                        <div class="card h-100">
                            <a href="/details/equipment/${equipment[1].id}"><img class="card-img-top"
                                             src="<c:out value="${requestScope.equipment[1].imageUrl}"/>" alt=""></a>
                            <div class="card-body">
                                <h4 class="card-title">
                                    <a href="/details/equipment/${equipment[1].id}"><c:out value="${requestScope.equipment[1].name}"/> <c:out
                                            value="${requestScope.equipment[1].mark}"/></a>
                                </h4>
                                <h5>$<c:out value="${requestScope.equipment[1].price}"/></h5>
                                <p class="card-text"><c:out value="${requestScope.equipment[1].mark}"/> <c:out
                                        value="${requestScope.equipment[1].model}"/>
                                    <c:out value="${requestScope.equipment[1].discipline}"/><br><c:out
                                            value="${requestScope.equipment[1].description}"/></p>
                            </div>
                            <div class="card-footer">
                                <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                            </div>
                        </div>
                    </div>

                </div>
                <!-- /.row -->

            </div>
            <!-- /.col-lg-9 -->

        </div>
        <!-- /.row -->

    </div>
    <!-- /.container -->

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
