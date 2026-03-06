<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="root" value="${pageContext.request.contextPath}" /><!-- el변수 cp에 경로저장 -->
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<img src="/resources/cat.jpg"> <!-- 고양이 예시용(출력 안 되는 게 정상) -->
<P>  The time on the server is ${serverTime}. </P>
<hr>
	<div id="[Spring][1+2개발]" style="display: none">
		<h1>[Spring][1+2개발]</h1>
		<a href="${root}/test/getOnePlusTwo">1+2 확인하러가기</a>
		<a href="${root}/test/insertDoodle">문제 2</a> <!-- 문제 2 -->
		<a href="${root}/test/tbl_test_del">문제 3</a> <!-- 문제 3 -->
		<hr>
	</div>

	<div id="[Spring][방명록]">
		<img src="/resources/cat.jpg">
		<h1><a href="${root}/guest/getList?currentPage=1">[Spring][방명록]</a></h1>
	</div>

</body>
</html>
