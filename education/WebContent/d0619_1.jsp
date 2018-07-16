<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<!-- 내장객체:별도로 선언하지 않고도 JSP에서 바로사용할수 있는 객체
		예를 들어 서블릿에서 사용하는 out 객체는 JSP에서는 내장객체임.
	내장객체 종류: 	request(*):클라이언트의 http 요청 정보를 저장한 객체
				response(*):http 요청에 대한 응답정보를 저장한 객체
				session(*):클라이언트의 세션정보를 저장한 객체
				out:출력 스트림 객체
				pageContext:페이지 실행에 필요한 컨텍스트 정보를 저장한객체
				application:도인한 애플리케이션의 컨텍스트 정보를 저장한 객체
				config:해당 페이지 서블릿 설정 정보를 저장한 객체
				page:해당 페이지 서블릿 걕체
				exception:예외처리를 위한 객체
			
			1.request 객체
				1.1 기능	
					-클라이언트 관련정보읽기
					-서버관련정보 읽기
					-클라이언트가 전송한 요청 파라미터 읽기 등
				1.2 관련 메소드
					-getParameter(String name):name이라는 이름으로 지정한 파라미터(속성값)에 할당된 값을 리턴,없으면 null을 리턴함
					-getParameterValues(String name):name 이라는 이름으로 지정된 파라미터의 모든값을 배열로 리턴.'
			2.response 객체
				-클라이언트 요청에 대한 http 응답을 나타내는 객체
				-주요 메소드는 sendRedirect(String url)-주소가 바뀜  포워딩		
		 http 해더 정보 관련 메소드 d0619_1_a
		 -->
		
</body>
</html>