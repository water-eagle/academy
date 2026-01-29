<%@page import="java.util.ArrayList"%>
<%@page import="com.watereagle.hello.Cat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8"); // 이거 안 하면 한굴 깨짐 
	String s = request.getParameter("tel");
	out.println(s); // 1. 이걸로 출력하거나
	%>
	입력한 전화번호:
	<%=s%><%-- 이걸로 출력 --%>
</body>
</html>