<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그인 페이지입니다.</h2>
<%session.invalidate(); %>
<%--<%session.removeAttribute("id");%> --%>

<form action="loginprocess.jsp" name="login" method="post">
<table>
<tr>
<td>아이디</td><!-- label로 쓰는것도 나쁘지않음 label사용시 정의할 것의 name의 값을 nameㅇ,ㅡ로 가짐  -->
<td><input type="text" name="logid"></td>
</tr>
<tr>
<td>비밀번호</td>
<td><input type="password" name="logpw"></td>
</tr>
<tr>
<td>
	<a href="javascript:login.submit();">로그인</a>
	<!-- 기능적인 부분이라 id가 아니라 name속성으로 쓰임 -->
</td>
	<td>
	<a href="joinForm.jsp">회원가입</a>
	</td>
</tr>
</table>
</form>
</body>
</html>