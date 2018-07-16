<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>메인페이지입니다.</h2>
<%=session.getAttribute("id")%>님 환영합니다.
<form action="logform.jsp">
<input type="submit" value="로그아웃">
<%if(session.getAttribute("id").equals("admin")){
%><a href="member_list.jsp">가입자정보조회</a><%}%>



</form>
</body>
</html>