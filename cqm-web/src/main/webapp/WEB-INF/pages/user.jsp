<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page session="false" %>
<html>
<sec:authorize access="!isAuthenticated()">
    <jsp:forward page="/"/>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>CQM | Пользователи</title>

        <link href="<c:url value="/resources/css/site-style.css" />" rel="stylesheet">

    </head>
    <body>
    <div class="CafeContent">
        <table width="98%" align="center" class="CafeTable">
            <tr>
                <th width="35%">Фото профиля</th>
                <th width="40%">Имя пользователя</th>
                <th width="25%">Рейтинг</th>
            </tr>
            <c:if test="${!empty users}">
                <c:forEach items="${users}" var="user">
                    <tr>
                        <td align="center">Место для Вашего Фото</td>
                        <td align="center"><c:out value="${user.userLogin}"/></td>
                        <td align="center"><c:out value="${user.userRating}"/></td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
    </div>

    <div class="PageMenu">
        Вы зашли под именем <sec:authentication property="principal.username"/>
        <a href="<c:url value="/"/>">
            <div class="MenuButton"> Личный кабинет</div>
        </a>
        <a href="<c:url value="/reports"/>">
            <div class="MenuButton"> Отчеты</div>
        </a>
        <a href="<c:url value="/cafeterias"/>">
            <div class="MenuButton"> Информация о столовых</div>
        </a>
        <a href="<c:url value="/users"/>">
            <div class="MenuButton"> Рейтинг Пользователей</div>
        </a>
        <a href="<c:url value="/logout"/>">
            <div class="MenuButton"> Выход</div>
        </a>
    </div>
    </body>
</sec:authorize>
</html>

