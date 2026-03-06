<%@page import="com.watereagle.dto.GuestDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}" /><!-- el변수 cp에 경로저장 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	GuestDto read = (GuestDto) request.getAttribute("read");
	long bno = read.getBno();
	String btext = read.getBtext();
	%>

	<a href="${root}/guest/getList">글 리스트</a>
	<a href="${root}/guest/modify?bno=${read.bno}">글 수정</a>
	<a href="${root}/guest/del?bno=${read.bno}">글 삭제</a>
	<hr>
	글번호: ${read.bno}<br>
	글내용: ${read.btext}<br>
</body>
</html>
