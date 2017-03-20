<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta charset="utf-8">
    <title>职业页面</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
    <link rel="stylesheet" href="<%=basePath %>css/bootstrap.min.css">
    <script src="<%=basePath %>js/jquery.min.js"></script>
    <script src="<%=basePath %>js/bootstrap.min.js"></script>
    <link href="<%=basePath %>css/t11.css" rel="stylesheet" type="text/css">
    <link href="<%=basePath %>css/base.css" rel="stylesheet" type="text/css">
    <base href="<%=basePath %>">
</head>
