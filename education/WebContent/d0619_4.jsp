<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- application 객체
	:웹 실행 환결을 제공하는 서버의 정보와 서버 자원에 대한 정보를 얻어 낼때 사용하는 내장 객체
-->
jsp버전: <%=application.getMajorVersion() %>.<%=application.getMinorVersion() %>
<br>
컨테이너 정보:<%=application.getServerInfo() %>
<br>
웹 애플리 케이션의 실제 파일 시스템 경로:
<%=application.getRealPath("/") %>
</body>
</html>