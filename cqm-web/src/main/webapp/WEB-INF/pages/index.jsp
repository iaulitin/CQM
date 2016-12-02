<%@ taglib prefix="spring" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% response.setStatus( 403 ); %>
<html>
<head>
    <title>The main page</title>
    <spring:url value="resources/css/bootstrap.css" var="bootstrap"/>
    <spring:url value="/resources/css/bootstrap-theme.css" var="bootstrap_theme"/>
    <spring:url value="resources/js/bootstrap.js" var="bootstrap_jsp"/>.
    <link href="${bootstrap}" rel="stylesheet"/>
    <link href="${bootstrap_theme}" rel="stylesheet"/>
    <link href="${bootstrap_jsp}" rel="stylesheet"/>
</head>
<body>
    <h1>Here goes some text: ${message}.</h1>
</body>
</html>
