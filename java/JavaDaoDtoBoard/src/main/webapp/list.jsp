<%@page import="com.watereagle.board.Db"%>
<%@page import="com.watereagle.board.Board"%>
<%@page import="com.watereagle.board.Dao"%>
<%@page import="com.watereagle.board.Dto"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판-리스트</title>
<link rel="stylesheet"
	href="css/list.css?ver<%=System.currentTimeMillis()%>">
</head>
<body>
	<a href="/">홈으로</a>
	<a href="/board/list">list로</a>
	<a href="write.jsp">작성하기</a>
	<hr>

	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>날짜</th>
			<th>조회수</th>
		</tr>
		<%
		ArrayList<Dto> posts = (ArrayList<Dto>) request.getAttribute("posts");

		/* 게시판 글 리스트 표시 */
		for (int i = 0; i < posts.size(); i++) {
		%>
		<tr>
			<td><%=posts.get(i).no%></td>
			<td><a href="/board/read?no=<%=posts.get(i).no%>"><%=posts.get(i).title%></a></td>
			<td><%=posts.get(i).id%></td>
			<td><%=posts.get(i).datetime%></td>
			<td><%=posts.get(i).hit%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
