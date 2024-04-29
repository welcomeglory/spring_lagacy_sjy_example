<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>MyBatis게시판</title>
</head>
<body>
	<table class="table table-hover ">
		<thead>
			<tr>
				<th scope="col">직원번호</th>
				<th scope="col">직원이름</th>
				<th scope="col">월급</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="emp" items="${emps}">
				<tr>
					<td>${ emp.empno }</td>
					<td>${ emp.ename }</td>
					<td>${ emp.sal}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>