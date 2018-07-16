<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="javax.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
1.ScopeExample1.jsp
	-page,request,session,application 영역에 각각 속성 할당
	-dispatcher 방식으로ㅓ ScopeExamPle2.jsp 로 포워딩
2.ScopeExamPle2.jsP
	-각 영역별 속성 값을 출력
	-redirect 방식으로 ScopeExample3.jsp로 포워딩
3.ScopeExample3.jsp
	-각영역별 속성값을 출력
 -->


입력페이지입니다.


 <%
 pageContext.setAttribute("page","pv");
 request.setAttribute("request","rv");
 session.setAttribute("session","sv");
 application.setAttribute("app","av");
 %>
<a href=" <jsp:forward page="d0619_7_b.jsp"></jsp:forward>">다음</a>
 

</body>
</html>