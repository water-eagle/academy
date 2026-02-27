<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<hr>
<h1>[Spring][1+2개발]</h1>
<a href="/test/getOnePlusTwo">1+2 확인하러가기</a>
<a href="/test/insertDoodle">문제 2</a> <!-- 문제 2 -->
<a href="/test/tbl_test_del">문제 3</a> <!-- 문제 3 -->
<hr>

<h1>[Spring][방명록]</h1>
<a href="/guest/getList">방명록</a>
<a href="/guest/read?bno=1">방명록 1번 글 보기</a>
<a href="/guest/del?bno=1">방명록 1번 글 삭제</a>
<a href="/guest/write">방명록 작성</a>

</body>
</html>
