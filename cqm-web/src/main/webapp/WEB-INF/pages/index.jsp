<%@ page import="org.springframework.security.core.context.SecurityContextHolder" %>
<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CQM | Главная</title>

    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/site-style.css" />" rel="stylesheet">

</head>
<body>
<sec:authorize access="!isAuthenticated()">
    <div class="jumbotron" style="margin-top: 20px; padding: 5%;">
        <h1 align="center">Cafeteria Queues Monitoring</h1>
        <p class="lead" align="center">
            Cafeteria Queues Monitoring - сервис, обеспечивающий вас информацией о загруженности столовых Физтеха
        </p>
        <p class="lead" align="center">
            Вы должны войти, чтобы использовать CQM
        </p>
        <p align="center"> <a class="btn btn-lg btn-success" href="<c:url value="/login" />" role="button">Вход</a>
        <a class="btn btn-lg btn-success" href="<c:url value="/signup" />" role="button">Регистрация</a> </p>
    </div>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <jsp:forward page="/profile"/>
</sec:authorize>
</body>
</html>
