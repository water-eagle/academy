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
<% String num=request.getParameter("num"); %>
<title>게시판-읽기</title>
</head>
<body>
	<!-- <a href="index.jsp">홈으로 이동</a><br> -->
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM cat_board WHERE num="+num);
		while (rs.next()) {
 			/* String num = rs.getString("num"); */
			String title = rs.getString("title");
			String content = rs.getString("content");
			String id = rs.getString("id");
	%>
	번호: <%=num %><br>
	제목: <%=title %><br>
	작성자: <%=id %><hr>
	<%=content %>
		
	<%
	}
	} catch (Exception e) {
	e.printStackTrace();
	}
	%>
</body>
</html>
