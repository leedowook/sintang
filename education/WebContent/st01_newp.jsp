<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="prodo" class="education.st01_pro" scope="page"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- 
String id=(Stirng)session.getAttribute("id_session");
각자 해당페이지로 이동시켜줌<a href="./st01_main?page=newitem&id=<%=id%>">신상품</a> -->
<%prodo.setMenu("신"); %>
<%
response.sendRedirect("education.st01_main");
%>

</body>
</html>