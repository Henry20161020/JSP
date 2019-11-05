<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="hlx" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="hlx2" uri="henry/tags" %>
<%@ taglib prefix="hlx3" uri="henry/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Wow!</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<p><a href="HelloWorldServlet">Entrance to the maze</a></p>
	<hlx3:message class="testing">This is a really boring tag.</hlx3:message>
	<hlx:footer year="2020"/>
	<hlx2:custom-footer year="2000" />
</body>


</html>