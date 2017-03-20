<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>首页</title>
    <link href="<%=basePath %>css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <link href="../bootstrap-3.3.5-dist/css/bootstrap.css">
    <link href="<%=basePath %>css/Untitled-3.css" rel="stylesheet" type="text/css">
    <link href="<%=basePath %>css/Untitled-1base.css" rel="stylesheet" type="text/css">
    <base href="<%=basePath %>">
</head>