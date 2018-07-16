<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>ArrtibuteTest3.jsp파일입니다.</h2>
<h3>Application 영여겡 저장된내용</h3>
이름:<%=application.getAttribute("name_app") %>
아이디<%=application.getAttribute("id_app") %>
<h3>session 영여겡 저장된내용</h3>
이메일:<%=session.getAttribute("em") %>
집주소:<%=session.getAttribute("add") %>
tel:<%=session.getAttribute("tel") %>
<a href="d0619_6_d.jsp">AttributeTest4.jsp로 이동</a>
</body><!-- 모든 브라우저 종료하면 session은 날아가고 appli -->
</html>