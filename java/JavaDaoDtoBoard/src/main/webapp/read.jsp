<%@page import="com.watereagle.board.Dto"%>
<%@page import="com.watereagle.board.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
Dto d = (Dto) request.getAttribute("post");
%>
<title> <%--=d.title--%> 글 읽기 - 자유게시판</title> <%-- TODO: 제목 가져오기 기능 오류 수정하기 --%>
</head>
<body>
	<a href="/list.jsp">리스트로</a>
	<br>

	<%=d.no%><br>
	<%=d.id%><br>
	<%=d.title%><hr>
	<%=d.text%><br>

	<a href="/edit.jsp?no=<%=d.no%>">수정</a>
	<a href="/board/del?no=<%=d.no%>">삭제</a>
</body>
</html>
