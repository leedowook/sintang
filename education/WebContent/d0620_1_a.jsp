<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름:<%=request.getParameter("name") %>
나이:<%=request.getParameter("ag") %>
주소:<%=request.getParameter("ad") %>
전화번호:<%=request.getParameter("tel")%>

</body>
</html>