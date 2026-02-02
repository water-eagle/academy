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
<title>게시판-읽기</title>
<link rel="stylesheet" href="common.css">
</head>
<body>
	<%
	String readNum = request.getParameter("num"); // 읽을 글 번호를 url get방식으로받아서 readNum 변수에 저장
	// 예: http://localhost:8080/JavaJspBoard/read.jsp?num=1
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM cat_board WHERE num=" + readNum); // SQL문 조합
		rs.next();

		String num = rs.getString("num"); // 글 번호
		String title = rs.getString("title"); // 글 제목
		String content = rs.getString("content"); // 글 내용
		String id = rs.getString("id"); // 글 작성자
	%>

	글 번호: <%=num%><br>
	글 제목: <%=title%><br>
	작성자: <%=id%><hr>
	<%=content%><hr>

	<%
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
	
	<a href="modify.jsp?num=<%=readNum%>">수정하기</a>
	<a href="delproc.jsp?num=<%=readNum%>">삭제하기</a>
</body>
</html>
