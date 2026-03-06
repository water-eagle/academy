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
	<a href="/guest/getList">글 리스트</a>
	<a href="/guest/modify?bno=<%=bno%>">글 수정</a>
	<a href="/guest/del?bno=<%=bno%>">글 삭제</a>
	<hr>
	글번호: <%=bno%><br>
	글내용: <%=btext%><br>

	<h1>EL 형식</h1>
	<a href="/guest/getList">글 리스트</a>
	<a href="/guest/modify?bno=${read.bno}">글 수정</a>
	<a href="/guest/del?bno=${read.bno}">글 삭제</a>
	<hr>
	글번호: ${read.bno}<br>
	글내용: ${read.btext}<br>

</body>
</html>
