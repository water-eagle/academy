<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판-글수정</title>
<link rel="stylesheet" href="common.css">
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

	String editNum = request.getParameter("num");
	String title = null;
	String content = null;
	String id = null;

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement(); // Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다. Statement하나당 한개의 ResultSet 객체만을 열 수있다.
		String sql = "SELECT * FROM cat_board WHERE num=" + editNum;
		System.out.println("==== 전송하려는 SQL: " + sql);
		ResultSet rs = st.executeQuery(sql); // 수정 할 글 하나 읽기 sql 전송
		rs.next(); // 글 선반에서 글 하나 꺼내서 작업대에 올리기
		title = rs.getString("title");
		content = rs.getString("content");
		id = rs.getString("id");
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>

글번호: <%=editNum %><br>
	<form action="modifyproc.jsp" method="get">
	<input name="num" type="hidden" value=<%=editNum%>>
		제목: <input name="title" value="<%=title%>"><br> 작성자 id: <input name="id" value="<%=id%>"><br>
		내용:
		<textarea name="content" rows="5" cols="50"><%=content %></textarea>
		<input type="submit" value="수정하기">
	</form>
</body>
</html>
