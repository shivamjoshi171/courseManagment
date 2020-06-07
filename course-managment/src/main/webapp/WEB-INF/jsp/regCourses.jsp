<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<h1>Courses Registred</h1>
<h1>${noreg}</h1>

<table>
<th>Course Name</th><th>Credits</th><th>Teacher</th>
 <c:forEach var="listValue" items="${courseList}">
 <tr>
				<td>${listValue.getCourseName()}</td>
				<td>${listValue.getCredits()}</td>
				<td>${listValue.getTeacher()}</td>
				
</tr>
			</c:forEach>


</table>
</body>
</html>