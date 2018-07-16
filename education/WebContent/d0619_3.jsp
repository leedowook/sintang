<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="javax.servlet.http.HttpSession"
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>SessionTest.jsp 파일입니다.</h2>

<!--Session(세션) 객체
		 Http프로토콜은 요청(request)/응답(response)으로 되어 있어 서버가 요청에 대한 응답을 정송하면 연결은 끈어지게됨
		 하지만 클라이언트의 정보가 유지되어야 하는 경우가있음(예를 들어 로그인)
		 --네이버에서 로그인하고 메일쪽이나 블로그에 넘어갔을때 유지된것처럼
		 이를 위해 세션 개념이 도입되고 세션은 가상 연결의 역활을 함-->
<h2>세셔이 새로 생성되었는지를 판단</h2>
isNEw():<%=session.isNew() %>
<h2>세션의 생성시간 정보를 받아옴</h2>
생서이간:<%=session.getCreationTime() %>
<h2>세션의 최종 접속 시간 정보를 받아옴</h2>
최종접속시간:<%=session.getLastAccessedTime() %>
세션id:<%=session.getId() %>
</body>
</html>