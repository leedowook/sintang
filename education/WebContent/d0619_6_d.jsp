<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>AttributeTest4.jsp 파일입니다.</h2>
<%
//page 영역에 속성 할당
pageContext.setAttribute("pageScope","pageValue");
//현제 있는 값이 없기떄문에
//request 영역에 정보할당
request.setAttribute("requestScope","requestValue");



%>
page영역에 저장된 속성값:<%=pageContext.getAttribute("pageScope") %>
request영역에 저장된 속성값:<%=request.getAttribute("requestScope") %>
<a href="d0619_6_e.jsp">AttributeTest5.jsp로 이동</a>
<jsp:forward page="d0619_6_e.jsp"></jsp:forward>
</body>
</html>