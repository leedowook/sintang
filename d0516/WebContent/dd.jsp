<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<!--get 방식
- 주소창에 정보를 직접 전달하는 바식
post 방식
- 여러개의 데이터를 한버에 처리하거나, 보안이 유지되야 한 정보를 전달할떄 사용하는 방식(예를 들어 로그인등)-->

<h1>로그인</h1>
<!-- 입력한 값 서버로 전송할떄 사용하는 태그(form) 전송방식(get or post)을 설정할수있음. -->
<form action="login" method="get"><!-- action ㄴㄴ 같은거 속성 ""에 들어가는거 속성값 -->
<!-- action 에 들어갈 값은 클래스 이름  -->


아이디: <input type="text" name="id"/><!--type text 라 치면 바로 나타남 
name 이 입력창에 들어오는 변수명 ex)만일 'ㅁㅁㅁ'입력하면 id에 ㅁㅁㅁ이 입력되서 서버로 넘어감 -->
비밀번호: <input type="password" name="pw"/><!--type password 라 치면 ..........뜸 -->
<input type="submit" value="로그인"/><!--submit 값이 서버로 날아감 value는  버튼에 글씨씀  -->

</form>

</body>
</html>