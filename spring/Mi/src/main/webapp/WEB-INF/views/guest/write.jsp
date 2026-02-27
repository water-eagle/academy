<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<body>
	<h1>글 작성</h1>

	<form action="/guest/write" method="post">
		<textarea rows="3" name='btext' placeholder="여기에 글 내용을 입력"></textarea><br>
		<input type="submit" value="작성">
	</form>
</body>
</html>
