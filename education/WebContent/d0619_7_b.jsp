<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="javax.*" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
2
<h3>	page:<%=pageContext.getAttribute("page") %></h3>
<h3>	request:<%=request.getAttribute("request") %></h3>
<h3>	session:<%=session.getAttribute("session") %></h3>
<h3>	application:<%=application.getAttribute("app") %></h3>

	<a href=" d0619_7_c.jsp">다음</a>
	<!-- page는 포워드나 리다이렉트로도 지워짐 -->
</body>
</html>