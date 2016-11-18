<%@ page import="java.math.BigInteger" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Test</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p>Hello, ${user}</p>
<%
    class User {
        public String name;
        public BigInteger id;
    }
%>

<%User user = new User();%>

<%=user.name%>
</body>
</html>