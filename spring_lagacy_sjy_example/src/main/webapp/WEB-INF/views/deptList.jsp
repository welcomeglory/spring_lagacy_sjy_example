<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>table</title>
</head>
<body>
	<table border="1">
		<tr>
			<th scope="col">직원번호</th>
			<th scope="col">직원이름</th>
			<th scope="col">월급</th>
		</tr>
		<c:forEach var="dept" items="${depts}">
			<tr>
				<td>${ dept.deptno }</td>
				<td>${ dept.dname }</td>
				<td>${ dept.loc}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>