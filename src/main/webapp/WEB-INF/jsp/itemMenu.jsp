<%--
  Created by IntelliJ IDEA.
  User: kfalk
  Date: 09.08.2019
  Time: 16:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-lg-3">

    <h1 class="my-4">PODLASIE</h1>
    <div class="list-group">
        <a href="/clothes" class="list-group-item">Clothes</a>
        <a href="/shoes" class="list-group-item">Shoes</a>
        <a href="/equipment" class="list-group-item">Equipment</a>
    </div>
<c:if test="${pageContext.request.userPrincipal.name != null}">
    <div id="myCartDiv">
        <br><a class="btn btn-success" href="/myCart" role="button" style="font-size: 20px">Shopping cart</a><br>
    </div>
</c:if>

</div>
