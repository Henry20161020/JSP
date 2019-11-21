<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="hlx" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="hlx2" uri="henry/tags" %>
<%@ taglib prefix="hlx3" uri="henry/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
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
		<input type="submit" value="Search"> 
	</form>
	<p>Patient Name: ${sessionScope.patientName} </p>
	<p>Care Centre Name: ${sessionScope.careCentreName}</p>
	<p>Name of Nurse-in-Charge: ${sessionScope.nurseName}</p>
	<table>
	  <tr>
	    <th>Treatment ID</th>
	    <th>Treatment Name</th>
	    <th>Physician ID</th>
	    <th>Date</th>
	  </tr>
	  <c:forEach var="treatment" items="${sessionScope.treatments}" >    
		<tr>

			<td>${treatment[0]}</td>
			<td>${treatment[1]}</td>
			<td>${treatment[2]}</td>
			<td>${treatment[3]}</td>

		</tr>
	  </c:forEach>
	</table>

  	<hlx3:message class="testing"> </hlx3:message>
<!-- 
	<hlx:footer year="2020"/>-->
 
	<hlx2:custom-footer /> 
</body>


</html>