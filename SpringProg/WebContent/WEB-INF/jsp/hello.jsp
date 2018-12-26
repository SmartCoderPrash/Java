<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Prog.</title>
</head>
<body>
<h3>Submitted Form Data</h3>
<table>
	<tr>
		<td>Name : </td>
		<td>${student1.s_nm}</td>
	</tr>
	<tr>
		<td>Hobbey : </td>
		<td>${student1.s_hobby}</td>
	</tr>
	<tr>
		<td>Mobile : </td>
		<td>${student1.mobile}</td>
	</tr>
	<tr>
		<td>DOB : </td>
		<td>${student1.DOB}</td>
	</tr>
	<tr>
		<td>Street : </td>
		<td>${student1.s_info.street}</td>
	</tr>
	<tr>
		<td>City : </td>
		<td>${student1.s_info.city}</td>
	</tr>
	<tr>
		<td>State : </td>
		<td>${student1.s_info.state}</td>
	</tr>
	<tr>
		<td>PinCode : </td>
		<td>${student1.s_info.pincode}</td>
	</tr>
	
</table>
</body>
</html>