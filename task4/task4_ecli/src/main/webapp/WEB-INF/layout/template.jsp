<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
   <tiles:insertAttribute name="title"/>
</head>
<body>
    <tiles:insertAttribute name="header"/>
	<tiles:insertAttribute name="body"/>
	<tiles:insertAttribute name="footer"/>
</body>
</html>