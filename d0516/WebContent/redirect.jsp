<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
redirect의 값:<%=request.getAttribute("yolo") %>
<!-- dispatcher에선 서버넷에서 실행하면 값이 뜨지만 여기선 둘다null -->

</body>
</html>