<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>--%>
<%--&lt;%&ndash;--%>
  <%--Created by IntelliJ IDEA.--%>
  <%--User: Dmitriy--%>
  <%--Date: 28.11.2016--%>
  <%--Time: 3:01--%>
  <%--To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>allUsers</title>--%>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">--%>
    <%--<link href="<c:url value='/resources/css/bootstrap.css' />" rel="stylesheet" />--%>
<%--</head>--%>
<%--<body>--%>
    <%--<table border=1>--%>
        <%--<thead>--%>
            <%--<tr>--%>
                <%--<th>user_id</th>--%>
                <%--<th>fist_name</th>--%>
                <%--<th>last_name</th>--%>
                <%--<th>login</th>--%>
                <%--<th>email</th>--%>
                <%--<th>hash</th>--%>
                <%--<th>salt</th>--%>
                <%--<th>rating</th>--%>
                <%--<th>isAdmin</th>--%>
            <%--</tr>--%>
        <%--</thead>--%>
        <%--<tbody>--%>
            <%--<c:forEach items="${users}" var="user">--%>
                <%--<tr>--%>
                    <%--<td><c:out value="${user.user_id}" /></td>--%>
                    <%--<td><c:out value="${user.first_name}" /></td>--%>
                    <%--<td><c:out value="${user.last_name}" /></td>--%>
                    <%--<td><c:out value="${user.login}" /></td>--%>
                    <%--<td><c:out value="${user.email}" /></td>--%>
                    <%--<td><c:out value="${user.hash}" /></td>--%>
                    <%--<td><c:out value="${user.salt}" /></td>--%>
                    <%--<td><c:out value="${user.rating}" /></td>--%>
                    <%--<td><c:out value="${user.isAdmin}" /></td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>
        <%--</tbody>--%>
    <%--</table>--%>
<%--</body>--%>
<%--</html>--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>
<head>
    <title>Manage User</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #8FBC8F;
        }

        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
</head>
<body>
<h3>User List</h3>
<table class="tg">
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

</body>
</html>

