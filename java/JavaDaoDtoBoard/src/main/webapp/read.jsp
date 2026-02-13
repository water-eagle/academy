<%@page import="com.watereagle.board.Dto"%>
<%@page import="com.watereagle.board.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	String no = request.getParameter("no");
	Dao dao = new Dao();
	Dto d = dao.read(no);
%>
<title><%=d.title%> - 자유게시판</title>
</head>
<body>
	<a href="list.jsp">리스트로</a>
	<br>

	<%=d.no%><br>
	<%=d.id%><br>
	<%=d.title%><hr>
	<%=d.text%><br>

	<a href="edit.jsp?no=<%=d.no%>">수정</a>
	<a href="/board/del?no=<%=d.no%>">삭제</a>
</body>
</html>
