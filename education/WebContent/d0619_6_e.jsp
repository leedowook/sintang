<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>Attribute5입니다.
	<h3>page영역꺼 </h3>
	<%=pageContext.getAttribute("pageScope") %>
	<h3>request영역꺼 </h3>
	<%=request.getAttribute("requestScope") %>
	<!-- 액션테그를사용하여 포워딩 디스패쳐방식으로이루어짐 -->
	
</body>
</html>