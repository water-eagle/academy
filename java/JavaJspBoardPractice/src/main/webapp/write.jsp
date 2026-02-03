<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="common.css">

<title>글쓰기</title>
</head>
<body>
	<form action="writeproc.jsp" method="get">
		<input type="text" name="id" placeholder="아이디"><br>
		<input type="text" name="title" placeholder="제목"><br>
		<hr>
		<textarea name="content" rows="5" cols="50" placeholder="여기에 내용 입력"></textarea>
		<br> <input type="submit" value="글쓰기">
	</form>
</body>
</html>
