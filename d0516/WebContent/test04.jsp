<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>declartionTest.jsp 파일입니다.</h2>
<!-- 선언문:jsp 페이지에서 맴버 변수또는 메소드를 선언하기 위해사용하는방법 -->
<!-- 선언한 메소드 호출 -->
<h1><%=getstr() %></h1>
<%!
//메소드선언
private String getstr(){
	str+="테스트";
	return str;
	
}
private String str="선언문";
%>
<!-- @는 제어 ! 자바  -->
</body>
</html>