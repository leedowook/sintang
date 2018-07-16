<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>AttributeTest1.jsp파일</h2>
<!-- 파라미터 받아오기 -->
<%
request.setCharacterEncoding("UTF-8");
//"name":request영역의 naMe속성. 이 속성이 가지고 있는 값을 String 타입의 name 이라는 변수에 담음.
String name_2=request.getParameter("name_1");
String id_2=request.getParameter("id_1");

if(name_2!=null && id_2!=null){
	//application영역에 name_app이라는 속성에 name_2 이가지고 있는 값을 담음.
	application.setAttribute("name_app", name_2);
	//name_app application영역에 속성명
	application.setAttribute("id_app",id_2);
	
}
%>
<h3><%=name_2%>님 반갑습니다</h3>
<%=name_2 %>님의 아이디는<%=id_2 %>입니다.
</h3>
application 영역에 저장한 이름:<%=application.getAttribute("name_app") %>
<form action="d0619_6_b.jsp" method="post">
	Session 영역에 저장할 내용<br>
	email주소: <input type="text" name="email">
	집주소: <input type="text" name="address">
	전화번호: <input type="text" name="tel">
	<input type="submit" value="전송">
	
</form>
</body>
</html>