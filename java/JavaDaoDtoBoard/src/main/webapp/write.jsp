<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판-글작성</title>
</head>
<body>
	<a href="list.jsp">리스트로</a><br>

	<form action="ServletWrite">
		<input type="text" name="id" placeholder="아이디" value=""><br>
		<input type="text" name="title" placeholder="제목" value=""><hr>
		<input type="text" name="text" placeholder="내용" value=""><hr>
		<input type="submit" value="작성">
	</form>
</body>
</html>
