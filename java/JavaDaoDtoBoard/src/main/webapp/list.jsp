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
		int count = dao.getPostCount();

		// 총 페이지 수 구하기
		int totalPage = 0;
		if (count % 3 == 0) {
			totalPage = count / 3; // 나머지 없음
		} else {
			totalPage = count / 3 + 1; // 나머지가 있어서 추가 페이지가 필요한 경우
		}

		ArrayList<Dto> posts = dao.list(pageNum);
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
	
	<a href="write.jsp">작성하기</a>
	<hr>
	<%
	for (int i = 1; i <= totalPage; i++) {
	%>
	<a href="list.jsp?page=<%=i%>"> [<%=i%>] </a>
	<%
	}
	%>
	<hr>
	<fieldset id="log">
		<legend>로그</legend>
		전체 글 수:
		<%=count%><br> 전체 페이지 수:
		<%=totalPage%><br> 현재 페이지 번호:
		<%=pageNum%><br>
	</fieldset>
</body>
</html>
