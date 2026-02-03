<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="common.css">
<title>게시판-리스트</title>
</head>
<body>
	게시판-리스트
	<table>
		<tr>
			<th>번호</th>
			<th>글쓴이</th>
			<th>제목</th>
		</tr>
	</table>
	<a href="index.jsp">홈으로 이동</a>
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM cat_board");
		while (rs.next()) {
			String num = rs.getString("num");
			String title = rs.getString("title");
			String content = rs.getString("content");
			String id = rs.getString("id");
	%>
	
	<table>
		<tr>
			<td><a href="read.jsp?num=<%=num%>"> <%=num%>
			</a></td>
			<td><a href="read.jsp?num=<%=num%>"> <%=title%>
			</a></td>
			<td><a href="read.jsp?num=<%=num%>"> <%=id%>
			</a></td>
		</tr>
	</table>
	<%
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
	<a href="write.jsp">글쓰기</a>
</body>
</html>
