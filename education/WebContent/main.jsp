<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
out.print("<%=session.getAttribute("id") %>님 환영합니다.");
<%
	if(session.getAttribute("id").equals("admin"))
	{
%>
<a href="member_list.jsp">관리자모드 접속</a>
<%} %>
</body>
</html>