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
<link rel="stylesheet" href="list.css">
</head>
<body>
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
		<!-- </table> -->

		<%
		String pageNum = request.getParameter("page");
		if (pageNum == null) {
			pageNum = "1";
		}

		Dao dao = new Dao();
		int totalPage = 0;
		ArrayList<Dto> posts = null;
		String searchWord = request.getParameter("word");
		if (searchWord == null || searchWord.equals("null")) { // case1. 검색어가 없으면
			posts = dao.list(pageNum);
			totalPage = dao.getTotalPageCount(); // 총 페이지 수 구하기
		} else { // case2. 검색어가 있으면
			posts = dao.listSearch(searchWord, pageNum);
			totalPage = dao.getSearchTotalPageCount(searchWord); // 총 페이지 수 구하기
		}

		/* 게시판 글 리스트 표시 */
		for (int i = 0; i < posts.size(); i++) {
		%>
		<tr>
			<td><%=posts.get(i).no%></td>
			<td><a href="read.jsp?no=<%=posts.get(i).no%>"><%=posts.get(i).title%></a></td>
			<td><%=posts.get(i).id%></td>
			<td><%=posts.get(i).datetime%></td>
			<td><%=posts.get(i).hit%></td>
		</tr>
	</table>
	<hr>
	<%
	}
	%>

	<%
	/* 페이지 수 표시 */
	for (int i = 1; i <= totalPage; i++) {
	%>
	<a href="list.jsp?page=<%=i%>&word=<%=searchWord%>"> [<%=i%>]
	</a>
	<%
	}
	%>
	<!-- 검색 표시 -->
	<div id="search">
		<form action="list.jsp">
			<input name="word"> <input type="submit" value="검색">
		</form>
	</div>

	<hr>
	<fieldset id="log">
		<legend>로그</legend>
		전체 페이지 수:
		<%=totalPage%><br> 현재 페이지 번호:
		<%=pageNum%><br>
	</fieldset>
</body>
</html>
