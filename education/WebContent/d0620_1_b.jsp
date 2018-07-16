<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <jsp:forward page='<%=request.getParameter("forwardpage") %>'>
 <jsp:param name="tel" value="032-123-4567"/>
 <jsp:param value="" name=""/>
 </jsp:forward>
</body>
</html>