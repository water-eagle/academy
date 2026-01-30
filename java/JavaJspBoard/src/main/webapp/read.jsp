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
<title>Insert title here</title>
</head>
<body>
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM cat_board WHERE num=1"); // SQL문 조합
		rs.next();
		
		String num = rs.getString("num"); // 글 번호
		String title = rs.getString("title"); // 글 제목
		String content = rs.getString("content"); // 글 내용
		String id = rs.getString("id"); // 글 작성자
	%>

	글 번호: <%=num %><br>
	글 제목: <%=title %><br>
	글 작성자: <%=id %><br>
	<%=content %>

	<%
	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
</body>
</html>