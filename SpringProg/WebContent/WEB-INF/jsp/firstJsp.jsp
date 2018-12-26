<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
<form:errors path="student1.*"/> <!-- TO SEE THE BINGING RELATED ERROR -->
<h2>Student Infomation</h2>
<form action="submitForm.html" method="post">
<table>
	<tr>
	<!-- USE THE NAME AS THE SAME AS THE POJO ATTRIBUTE -->
		<td>Enter the Name : </td>
 		<td><input type name ="s_nm" ></td>
 	</tr>
 	<tr>
		<td>Enter the Hobby : </td>
 		<td><input type name ="s_hobby" ></td>
 	</tr>
 	<tr>
		<td>Enter the Mobile : </td>
 		<td><input type name ="mobile" ></td>
 	</tr>
 	<tr>
		<td>Enter the DOB : </td>
 		<td><input type name ="DOB" ></td>
 	</tr>
 	<tr>
		<td>Skill Set : </td>
 		<td>
 			<select name ="s_skill" multiple>
 			<option value="Java">Java</option>
 			<option value="iOS">iOS</option>
 			<option value="Android">Android</option>
 			</select>
 		</td>
 	</tr>
 	
 </table>
 
 <table>
 		<tr><td><h4>Student Address</h4></td></tr>
 		<tr>
 			<!-- HERE WE PASS OBJECT OF ADDRSSS CLASS and then use its attribute val.-->
 			<td>Street : <input type name="s_info.street"></td>
 			<td>City : <input type name="s_info.city"></td>
 			<td>State : <input type name="s_info.state"></td>
 			<td>Pin-Code : <input type name="s_info.pincode"></td>
 		</tr>
 		<tr>
 		<td>
 			<input type="submit" value="click here">
 		</td>
 	</tr>
 </table>
 </form>
</body>
</html>