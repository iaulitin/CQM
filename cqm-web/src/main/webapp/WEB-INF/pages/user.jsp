<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CQM | Admin User</title>

    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">

</head>
<body>
<div class="container">
    <div class="table-responsive">
        <h3 align="center">User List</h3>
        <table class="table" align="center">
            <tr>
                <th width="80">ID</th>
                <th width="120">FirstName</th>
                <th width="120">LastName</th>
                <th width="60">Login</th>
                <th width="60">Email</th>
                <th width="60">Hash</th>
                <th width="60">Salt</th>
                <th width="60">Rating</th>
                <th width="60">IsAdmin</th>
            </tr>
            <c:if test="${!empty users}">
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td><c:out value="${user.userId}"/></td>
                        <td><c:out value="${user.firstName}"/></td>
                        <td><c:out value="${user.lastName}"/></td>
                        <td><c:out value="${user.userLogin}"/></td>
                        <td><c:out value="${user.userEmail}"/></td>
                        <td><c:out value="${user.hashPassword}"/></td>
                        <td><c:out value="${user.saltPassword}"/></td>
                        <td><c:out value="${user.userRating}"/></td>
                        <td><c:out value="${user.isAdmin}"/></td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
        <div class="footer">
            <p>@ NetCracker student project 2016</p>
        </div>
    </div>
</div>
</body>
</html>

