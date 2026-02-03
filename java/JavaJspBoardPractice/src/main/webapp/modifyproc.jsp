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
request.setCharacterEncoding("UTF-8");
String num = request.getParameter("num");
String id = request.getParameter("id");
String title = request.getParameter("title");
String content = request.getParameter("content");
%>
<title>Insert title here</title>
</head>
<body>
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement();
		String sql = String.format("UPDATE cat_board SET id='%s', title='%s', content='%s' WHERE num='%s'", id, title,
		content, num);
		System.out.println("==== 전송한 SQL: " + sql);
		int resultCount = st.executeUpdate(sql);
		if (resultCount == 1) {
			System.out.println("==== 글수정 성공");
		} else {
			System.out.println("==== 글수정 실패");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}

	response.sendRedirect("read.jsp?num=" + num); // 글리스트 화면으로 강제 이동
	%>

</body>
</html>
