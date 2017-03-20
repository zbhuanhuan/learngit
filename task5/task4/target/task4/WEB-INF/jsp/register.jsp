<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="register/in" method="post">
        <input type="text" required="required" placeholder="用户名" name="name"/>
        <input type="password" required="required" placeholder="密码" name="password"/>
        <button class="but" type="submit">注册</button>
    </form>
</body>
</html>
