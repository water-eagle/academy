<%@page import="com.watereagle.dto.GuestDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>일반 형식</h1>
	<%
	GuestDto read = (GuestDto) request.getAttribute("read");
	long bno = read.getBno();
	String btext = read.getBtext();
	%>

	글본문 글번호:<%=bno%>
	글내용:<%=btext%>

	<hr>

	<h1>EL 형식</h1>

	글 읽기
	<hr>
	글번호:${read.bno}
	<hr>
	글내용:${read.btext}

</body>
</html>
