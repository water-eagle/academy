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
<title>방명록 - 글 목록</title>
</head>
<body>
	<h1>방명록</h1>
	<h2>글목록(일반)</h2>
	<a href="/guest/write">글쓰기</a>
	<table>
		<tr>
			<td>번호</td>
			<td>내용</td>
		</tr>
		<%
		//Model 에 "list" 라는 키로 넣은 객체를 request 내장객체에서 빼올 수 있음.

		Object o = request.getAttribute("list");
		ArrayList<GuestDto> list = (ArrayList<GuestDto>) o;
		for (int i = 0; i < list.size(); i++) {
			Long bno = list.get(i).getBno();
			String btext = list.get(i).getBtext();
		%>
		<tr>
			<td><%=bno%></td>
			<td><a href="/guest/read?bno=<%=bno%>"> <%=btext%></a></td>
		</tr>
		<%
		}
		%>
	</table>
	<hr>

	<h2>글목록(JSTL EL 적용)</h2>
	<!-- jstl 로 처리하면 더 짧게 가능 -->
	<a href="/guest/write">글쓰기</a>
	<table>
		<tr>
			<td>번호</td>
			<td>내용</td>
		</tr>
		<c:forEach var="guest" items="${list}">
		<tr>
			<td>${guest.bno}</td>
			<td><a href="/guest/read?bno=${guest.bno}">${guest.btext}</a></td>
		</tr>
		</c:forEach>
	</table>
	<hr>
	<%-- <c:forEach var="guest" items="${list}"> --%>
	<%--     <c:set var="bno" value="${guest.bno}" /> --%>
	<%--     <c:set var="btext" value="${guest.btext}" /> --%>
	<%--     ${bno} --%>
	<%--     ${btext} --%>
	<!--     <hr> -->
	<%-- </c:forEach> --%>

</body>
</html>
