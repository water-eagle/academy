<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/member/regProc" method="get">
	<input name="id" placeholder="가입하실 아이디를 입력해주세요:"><br>
	<input name="pw" placeholder="암호를 정해주세요"><br>
	<input name="pw_re" placeholder="암호를 다시 한번 입력해주세요"><br>
	<input name="name" placeholder="이름을 입력해주세요"><br>
	<input type="submit" value="회원가입">
</form>
</body>
</html>
