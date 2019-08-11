<%--
  Created by IntelliJ IDEA.
  User: kfalk
  Date: 09.08.2019
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Shoes</title>
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
            <div class="col-lg-9" style="padding-top: 20px">
                <div class="row">
                    <c:forEach var="shoe" items="${requestScope.shoes}">
                        <div class="col-lg-4 col-md-6 mb-4">
                            <div class="card h-100">
                                <a href="/details/shoes/${shoe.id}"><img class="card-img-top" src="<c:out value="${shoe.imageUrl}"/>"
                                                 alt=""></a>
                                <div class="card-body">
                                    <h4 class="card-title">
                                        <a href="/details/shoes/${shoe.id}">Shoes <c:out value="${shoe.mark}"/></a>
                                    </h4>
                                    <h5>$<c:out value="${shoe.price}"/></h5>
                                    <p class="card-text">Shoes <c:out value="${shoe.mark}"/> <c:out
                                            value="${shoe.model}"/>
                                        <c:out value="${shoe.discipline}"/></p>
                                </div>
                                <div class="card-footer">
                                    <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
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
