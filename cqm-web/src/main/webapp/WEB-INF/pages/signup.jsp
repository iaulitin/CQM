<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>CQM | Регистрация</title>

    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/signin.css"/>" rel="stylesheet">
    <link href="<c:url value="/resources/css/jumbotron-narrow.css" />" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="jumbotron" style="margin-top: 20px;">
        <p1>Пожалуйста, заполните поля</p1>
        <input type="text" class="form-control" placeholder="Имя пользователя" required value="">
        <input type="text" class="form-control"  placeholder="email" required value="">
        <input type="password" class="form-control" placeholder="Пароль" required value="">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Зарегистрироваться</button>
    </div>
</div>
</body>
</html>
