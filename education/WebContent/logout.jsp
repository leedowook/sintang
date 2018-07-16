<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>alert('<%=session.getAttribute("id")%>님 로그아웃됬습니다.')</script>
<%session.removeAttribute("id"); %>
<%session.removeAttribute("pw");%>
<% response.sendRedirect("loginform.jsp");%>
</body>
</html>