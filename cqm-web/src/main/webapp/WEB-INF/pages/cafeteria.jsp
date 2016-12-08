<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false"%>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Manage Cafeteria</title>

    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/cafeteria_table.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/jumbotron-narrow.css" />" rel="stylesheet">

    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
</head>

<body>
<h3>Cafeteria List</h3>
<table class="tg">
    <tr>
        <th width="80">ID</th>
        <th width="120">CafeName</th>
        <th width="120">Address</th>
    </tr>
    <c:if test="${!empty cafeterias}">
        <c:forEach items="${cafeterias}" var="cafeteria">
            <tr>
                <td><c:out value="${cafeteria.cafeId}"/></td>
                <td><c:out value="${cafeteria.cafeName}"/></td>
                <td><c:out value="${cafeteria.cafeAddress}"/></td>
            </tr>
        </c:forEach>
    </c:if>
</table>

</body>
</html>
