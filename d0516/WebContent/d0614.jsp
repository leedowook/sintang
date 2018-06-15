<!-- %= jsp 지시어를 표현ㅇ하는 부분 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>링크를 이용한 get 연습</h1>
<h1>2페이지 목록 요청하기</h1>
<!-- link불러오기위해 a태그 선언 -->
<a href="www.naver.com">네이버로 바로가기</a>
<a href="getpr?page=2&a=3&b=5" >2page</a>

<!--http://localhost:9090/dkfm/getpr?page=2 그리고 page에 2라는 값이 들어감
jsp엔 변수같은거 따음표안에있어도 따로되는듯  -->
<!--
type 소성에 적을수 있는 값의 분류
	-text
	-password
	-checkbox
	-radio
	-submit
	-reset-
	-file
	
	
	http://localhost:9090/jsp_example_180612/login?id=abc&pw=1234
	localhost:내컴퓨터(서버)
	9090:http포트번호
	jsp_example_180612: 현제 실행중인 파일 프로젝트이름
	login?:action:속성에 작성한 속성값(일종의 주소값)
	id=abc&pw=1234:jsp페이지에 입력한 값이 get방식으로 전달하넋
	
	-->
	
</body>
</html>