<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	//파일 업로드 페이지에서 전송한 값을 가져옴 
	String name=request.getParameter("name");
	String subject=request.getParameter("subject");
	String filename1=request.getParameter("filename1");
	String filename2=request.getParameter("filename2");
	String origfilename1=request.getParameter("origfilename1");
	String origfilename2=request.getParameter("origfilename2");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>filecheck.jsp 파일입니다.</h2>
올린사람:<%=name %>
제목:<%=subject %>
파일명1:<a href="fileupload01_a.jsp?filename=<%=filename1%>"><%=origfilename1 %></a><br>
파일명2:<a href="fileupload01_a.jsp?filename=<%=filename2%>"><%=origfilename2 %></a><br>
<!-- 우리가 실제 올린 파일의 이름 --> 
</body>
</html>