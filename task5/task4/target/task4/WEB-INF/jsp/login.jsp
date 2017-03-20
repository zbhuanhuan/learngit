<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false"  pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Login</h1>
<form action="login/in" method="post">
    <input type="text" required="required" placeholder="用户名" name="name"></input>
    <input type="password" required="required" placeholder="密码" name="password"></input>
    <button class="but" type="submit">登录</button>
</form>



