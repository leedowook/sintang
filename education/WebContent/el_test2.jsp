<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>el_test2.jsp파일입니다.</h2>
<%request.setCharacterEncoding("UTF-8");%>

<!--
세션 요청값 출력
 $(sessionScope.이름 ==session.getAttribute("이름")) -->
jsp 스크립틀릿 사용:<%=session.getAttribute("test") %> <br>
el사용:${sessionScope.test}<br>
<!-- 요청 파라미터 출력 출력하는 방식이 다름  -->
jsp 스크립틀릿 사용:<%=request.getParameter("name") %><br>
el 사용:${param.id}<br><!-- 얜 아이디값임 -->
값이 여러개일땐 paramValues  어딘가 배열에 담아서 쓰는게좋음 혹은 뷰페이지 순서<br>
그대로출력하기<br>
${"그대로출력" }<br><br>

<br>
연산도 가능

${1+2}<br>
${1==2}<br>
${1>2}<br>
${1+2==9?3:0}<br>
</body>
</html>