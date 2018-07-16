<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>el_test1.jsp파일</h2>
 <%
/*변수입력법
EL(Expression Language)
	:${변수명}*/
%> -->
 
 <%session.setAttribute("test","value"); %>
 <form action="el_test2.jsp" method=post>
 이름:<input type="text" name="name" id="id">
 	<input type="submit" value="뭔지모름">
 
 </form>
</body>
</html>