<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-COMPATIBLE" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Log In</title>

    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="resources/css/signin.css"/>" rel="stylesheet">
</head>
<body>
    <div class="container" style="width: 300px;">
        <c:url value="/j_spring_security_check" var="loginUrl"/>
        <form action="${loginUrl}" method="post">
            <h2 class="form-signin-heading">Please sign in</h2>
            <input type="text" class="form-control" name="j_username" placeholder="User login" required autofocus value="user">
            <input type="password" class="form-control" name="j_password" placeholder="Password" required value="12345678">
            <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
        </form>
    </div>
</body>
</html>
