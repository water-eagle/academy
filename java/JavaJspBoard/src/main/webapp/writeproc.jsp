<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//이전 화면에서 post 방식으로 한글을 보낸경우
	//아래 인코딩 설정을 해줘야함
	request.setCharacterEncoding("UTF-8");

	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String id = request.getParameter("id");

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
		Statement st = con.createStatement(); // Statement는 정적 SQL문을 실행하고 결과를 반환받기 위한 객체다. Statement하나당 한개의 ResultSet 객체만을 열 수있다.
		String sql = String.format("INSERT INTO cat_board(title, content, id) VALUES('%s', '%s', '%s')", title, content,
		id);
		System.out.println("==== 전송되려는 SQL: " + sql);
		int resultCount = st.executeUpdate(sql); // 글쓰기 sql 전송
		if (resultCount == 1) {
			System.out.println("==== 글쓰기 성공");
		} else {
			System.out.println("==== 글쓰기 실패");
		}

	} catch (Exception e) {
		e.printStackTrace();
	}

	response.sendRedirect("list.jsp"); // 글리스트 화면으로 강제 이동
	%>
</body>
</html>
