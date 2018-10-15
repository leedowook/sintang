<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원관리 시스템 메인 페이지</title>
</head>
<body>
	<h3>세션 아이디 : ${sessionScope.session_email }</h3>
	<h3>${loginMember.email }로 로그인하셨습니다.</h3>
		<a href="logout">로그아웃</a><br>
	<c:if test="${loginMember.email eq 'admin' }">
	<a href="memberList">관리자모드 접속(회원 목록 보기)</a>
	</c:if>
</body>
</html>