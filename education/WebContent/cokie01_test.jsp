<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    Cookie cookie=new Cookie("name","yourname");
    //쿠키 객체생성
    cookie.setMaxAge(600);
    //쿠키의 생존시가 설정(600초)
    response.addCookie(cookie);
    //생성한 쿠키를 클라이언트에게 전송
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>cookietet.jsp파일입닏.</h2>

<!-- :클라이언트에서 관리되는 정보
:(세션은 서버에서 관리되는정보)
:쿠키는 브라우저를 종료해도 하드디스크에 저장되기때문에 생존기간이 지정되면 그기간동안 사라지지 않음
:따라서 보안에는 취약한 부분이있음
:로그인 할때 로그인 창에 그동안 사용했던 아이디가 나오는것이 쿠키정보가 있기 떄문에 가능한것임 -->
</body>
</html>