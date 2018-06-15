<!-- 지시어 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*,java.util.*,java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>JSPBasic.jsp 파일입니다.</h2>
<!-- html 주석 -->
<% /*스크립틀릿(scriptlet)*/
//한줄주석 사용할떄 %>
<h2>현제시간 <%=new SimpleDateFormat().format(new Date()) %><h2>
<%@ include file="cls.jsp" %>
</body>
</html>