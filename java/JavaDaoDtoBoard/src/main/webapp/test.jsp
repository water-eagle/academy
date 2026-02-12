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
	String x = "x";
	request.setAttribute("ya", "응");
	%>
	
	${ya } <!-- ya의 값을 출력 -->
	${requestScope.ya } <!-- 응 출력 -->
	
	${pageContext.request.contextPath } <!-- 경로 출력 -->
</body>
</html>
