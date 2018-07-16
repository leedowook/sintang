<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2> includetest1.jsp 파일입니다.</h2>
<jsp:include page="includetest2.jsp">
	<jsp:param value="ldw" name="name"/>

</jsp:include>
</body>
</html>