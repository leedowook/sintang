<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
영역 (Scope)객체의 속성(Attribute)
영역 객체
1.page 영역
	1.1영역객체:pageContext
	1.2설명
		-해당 페이지에서만 정보가유효//현제페이지 벗어나면 정보 사라짐
2.request 영역
	2.1영역객체:request
	2.2설명
		-클라이언트의 요청이 처리되는 동안 정보가유효함//다시 서버가 return을 해버리면 정보가 사라져버림
3.session 영역
	3.1영역객체:session
	3.2설명
		-세션이 유지되는 동안 정보가 유효함
4.application 영역
	4.1영역객체:application
	4.2 설명
		-웹 애플리케이션이 실행되고 있는 동안 유효함.(서버가 구동중인 동안)
		-서버를 내리면 application 영역객체 소멸
</body>
</html>