<%@page import="com.watereagle.board.Dto"%>
<%@page import="com.watereagle.board.Dao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
String no = request.getParameter("no");
Dao dao = new Dao();
Dto dto = dao.read(no);
%>
<title>Insert title here</title>
</head>
<body>
	<a href="list.jsp?no<%=no%>">리스트로</a><br>

	<form action="edit_proc.jsp">
		<input type="hidden" name="no" value="<%=no%>"><br>
		<input type="text" name="title" placeholder="제목" value="<%=dto.title%>"><hr>
		<input type="text" name="text" placeholder="내용" value="<%=dto.text%>"><hr>
		<input type="submit" value="수정">
	</form>
</body>
</html>
