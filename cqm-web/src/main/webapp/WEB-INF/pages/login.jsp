<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<sec:authorize access="isAuthenticated()">
    <jsp:forward page="/"/>
</sec:authorize>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CQM | Вход </title>

    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/jumbotron-narrow.css" />" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="jumbotron" style="margin-top: 20px;">
        <c:url value="/j_spring_security_check" var="loginUrl"/>
        <form action="${loginUrl}" method="post">
            <h2 class="form-signin-heading">Пожалуйста, войдите</h2>
            <input type="text" class="form-control" name="j_username" placeholder="User login" required autofocus
                   value="lopez">
            <input type="password" class="form-control" name="j_password" placeholder="Password" required value="qw12">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
        </form>
    </div>
</div>
</body>
</html>
