<%@page import="com.watereagle.board.Dto"%>
<%@page import="com.watereagle.board.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
// 글 가져오기
Dto dto = (Dto) request.getAttribute("post");
%>
<title>Insert title here</title>
</head>
<body>
	<a href="/board/list?no<%=dto.no%>">리스트로</a><br>

	<form action="/board/edit_proc">
		<input type="hidden" name="no" value="<%=dto.no%>"><br>
		<input type="text" name="title" placeholder="제목" value="<%=dto.title%>"><hr>
		<input type="text" name="text" placeholder="내용" value="<%=dto.text%>"><hr>
		<input type="submit" value="수정">
	</form>
</body>
</html>
