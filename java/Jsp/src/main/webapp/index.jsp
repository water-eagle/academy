<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- ArrayList<String> 객체 선언하고 --%>
	<%-- 고양이,개,너굴맨을 추가. for문 으로 순회하면서 출력하기 --%>

	<%
	ArrayList<String> animalArrayList = new ArrayList<>();

		animalArrayList.add("고양이");
		animalArrayList.add("개");
		animalArrayList.add("너굴맨");
		for (int i = 0; i < 3; i++) {
	%>

	<%= animalArrayList.get(i) %>

	<%
		}
	%>
	
</body>
</html>