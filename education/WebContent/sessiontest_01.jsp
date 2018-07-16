<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String name;
	if(session.getAttribute("name")!=null) {
	name=(String)session.getAttribute("name");//session.getAttribute이 object값이라서
	}else{name="세션값 없음";}
	%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>sessiontest_01.jsp 파일입니다</h2>
<input type="button" onclick="location.href='sessiontest_01set.jsp'" value="세션 값 지정">
<input type="button" onclick="location.href='sessiontest_01del.jsp'" value="세션 값 삭제">
<input type="button" onclick="location.href='sessiontest_01invalidte.jsp'" value="세션 값 초기화">

<h3>name 값 출력:<%=name %></h3>
</body>
</html>