<%@page import="com.watereagle.dto.GuestDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" /><!-- el변수 cp에 경로저장 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
GuestDto read = (GuestDto) request.getAttribute("read");
long bno = read.getBno();
String btext = read.getBtext();
%>
<title><%=bno%>번 글 수정</title>
</head>
<body>
	<form action="${root}/guest/modify" method="post">
		<input type="hidden" name="bno" value='<%=bno%>'><br>
		<textarea name='btext' placeholder="글 내용 여기에 입력" rows="8" cols="24"><%=btext%></textarea><br>
		<input type="submit" value="수정하기"><br>
	</form>
</body>
</html>
