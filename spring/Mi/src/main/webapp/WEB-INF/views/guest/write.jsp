<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" /><!-- el변수 cp에 경로저장 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<body>
	<h1>글 작성</h1>

	<form action="${root}/guest/write" method="post">
		<textarea rows="3" name='btext' placeholder="여기에 글 내용을 입력"></textarea><br>
		<input type="submit" value="작성">
	</form>
</body>
</html>
