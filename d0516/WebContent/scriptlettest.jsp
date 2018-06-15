<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>scriptlettest.jsp 파일입니다</h2>

<%
	Calendar c=Calendar.getInstance();
	int hour= c.get(Calendar.HOUR_OF_DAY);
	int minute= c.get(Calendar.MINUTE);
	int second= c.get(Calendar.SECOND);
	String hyun;
	if(hour-12<0){
		hyun="오전";
	}
	else if(hour-12==0){
		hyun="오후";
	}
	else{
		hyun="오후";
		hour-=12;
	}
%>
현제시간은
<%=hyun %><%= hour %>시<%= minute %>분<%= second %>초입니다.
<% if(hour>=12){ %>
<h2>오후입니다.</h2>
<%}else{ %>
<h2>오전입니다.</h2>
<%} %>
</body>
</html>