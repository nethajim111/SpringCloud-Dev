<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Provision Registration Successful!!!<br> Your submitted data is </b>
	<h4> uuid : ${uuid} </h4>
	<h4> fpn: ${fpan} </h4>
	<h4> Expiry Date : ${expDate} </h4>
	<br>
	<h3> SEMANTIC HUB RESULTS : ${FromSemanticHub} </h3>
	<a href="/InAppProvisionData">Provisioning</a>
	<br>
	
</html>