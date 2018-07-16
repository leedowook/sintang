<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
3
<h3>	page:<%=pageContext.getAttribute("page") %></h3>
<h3>	request:<%=request.getAttribute("request") %></h3>
<h3>	session:<%=session.getAttribute("session") %></h3>
<h3>	application:<%=application.getAttribute("app") %></h3>
<!-- request는 리다이렉트시 사라짐 -->
</body>
</html>