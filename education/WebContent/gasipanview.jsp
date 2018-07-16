<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <jsp:useBean id="ga" class="education.gasicl" scope="page"/>
  <jsp:setProperty property="*" name="ga"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
작성자:<%=ga.getName() %><br>
제목:<%=ga.getTitle() %><br>
내용:<%=ga.getSub() %><br>
</body>
</html>