<%@page import="com.watereagle.dto.GuestDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>일반</h1>
	<%
	//Model 에 "list" 라는 키로 넣은 객체를 request 내장객체에서 빼올 수 있음.

	Object o = request.getAttribute("list");
	ArrayList<GuestDto> list = (ArrayList<GuestDto>) o;
	for (int i = 0; i < list.size(); i++) {
		Long bno = list.get(i).getBno();
		String btext = list.get(i).getBtext();
	%>
	<%=bno%>
	<%=btext%>
	<hr>
	<%
	}
	%>

	<h1>JSTL EL 적용</h1>
	<!-- jstl 로 처리하면 더 짧게 가능 -->
	<c:forEach var="guest" items="${list}">
	    ${guest.bno}
	    ${guest.btext}
	    <hr>
	</c:forEach>

	<%-- <c:forEach var="guest" items="${list}"> --%>
	<%--     <c:set var="bno" value="${guest.bno}" /> --%>
	<%--     <c:set var="btext" value="${guest.btext}" /> --%>
	<%--     ${bno} --%>
	<%--     ${btext} --%>
	<!--     <hr> -->
	<%-- </c:forEach> --%>

</body>
</html>
