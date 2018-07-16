<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



<%String name=request.getParameter("st");
if(name.equals("naver")){ %>

<%response.sendRedirect("http://www.naver.com");%>
<%} else if(name.equals("daum")){ %>

<%response.sendRedirect("http://www.daum.net");%>
<%}else{ %>

<%response.sendRedirect("http://www.nate.com");%>
<%} %>

</body>
</html>