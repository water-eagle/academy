<%@page import="java.util.ArrayList"%>
<%@page import="com.watereagle.hello.Cat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- jsp 에서 Cat 객체 생성하고 객체의 name 변수 값을 표현태그로 출력. --%>
	<%
	Cat cat = new Cat();
	%>
	<%=cat.name%>
</body>
</html>