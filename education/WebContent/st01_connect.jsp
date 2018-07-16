<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="prodo" class="education.st01_pro" scope="page"/>
<jsp:setProperty name="prodo" property="*" />
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.sendRedirect("education.st01_main");
%>

</body>
</html>