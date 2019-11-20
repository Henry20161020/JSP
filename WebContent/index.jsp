<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="hlx" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="hlx2" uri="henry/tags" %>
<%@ taglib prefix="hlx3" uri="henry/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Report</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form action="GeneratePatientReport" method="get">
		<label for="pid">Patient Number: 
			<input type="text" id="pid" name="pid" autocomplete="off" required>
		</label>
		<input type="submit" value="Go"><br> 
	</form>
	<p>Patient Name: </p>
	<hlx3:message class="testing">This is a really boring tag.</hlx3:message>
	<hlx:footer year="2020"/>
	<hlx2:custom-footer year="2000" />
</body>


</html>