<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><!-- 초기화 -->
<h2>sessioninvalidate파일입니다</h2>
<%session.invalidate(); %>
</body>
<script>location.href="sessiontest_01.jsp";</script>
</html>