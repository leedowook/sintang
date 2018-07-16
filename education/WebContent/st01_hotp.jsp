<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="prodo" class="education.st01_pro" scope="page"/>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%prodo.setMenu("인기"); %>
<%
response.sendRedirect("education.st01_main");
%>

</body>
</html>