<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
로그인받은페이지
<jsp:forward page='<%=request.getParameter("user")%>'>

 <jsp:param value="" name=""/>
</jsp:forward>
</body>
</html>