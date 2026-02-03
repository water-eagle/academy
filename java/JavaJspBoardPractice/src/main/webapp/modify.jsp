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
<%
String num = request.getParameter("num");
%>
<title>게시판-글수정</title>
</head>
<body>
	<%
	String title = null;
	String content = null;
	String id = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement();
		String sql="SELECT * FROM cat_board WHERE num=" + num;
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		/* String num = rs.getString("num"); */
		title = rs.getString("title");
		content = rs.getString("content");
		id = rs.getString("id");
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
	번호: <%=num%><br>
	<form action="modifyproc.jsp" method="get">
		<input name="num" type="hidden" value=<%=num%>>
		<input type="text" name="id" placeholder="아이디" value="<%=id%>"><br>
		<input type="text" name="title" placeholder="제목" value="<%=title%>"><br><hr>
		<textarea name="content" rows="5" cols="50" placeholder="여기에 내용 입력"><%=content%></textarea><br> <input type="submit" value="수정하기">
	</form>
</body>
</html>
