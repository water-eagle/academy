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
	String num=request.getParameter("num");
%>
<title>게시판-삭제</title>
</head>
<body>
	<!-- <a href="index.jsp">홈으로 이동</a><br> -->
	<%
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement(); // Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다. Statement하나당 한개의 ResultSet 객체만을 열 수있다.
		String sql = "DELETE FROM cat_board WHERE num="+num;
		System.out.println("==== 전송하려는 SQL: " + sql);
		int resultCount = st.executeUpdate(sql);
		if (resultCount == 1){
			System.out.println("==== 글수정 성공");
		} else {
			System.out.println("==== 글수정 실패");
		}

	} catch (Exception e) {
	e.printStackTrace();
	}
	
	response.sendRedirect("list.jsp");
	%>
</body>
</html>
