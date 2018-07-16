<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="javax.servlet.http.HttpSession"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Attribute test2.jsp파일입니다.</h2>
Attributetest1.jsp페이지에서 전송된 정보를 가져와서 세션 영역에 저장하기.
<%request.setCharacterEncoding("UTF-8");
	String email=request.getParameter("email");
	String add=request.getParameter("address");
	String tel=request.getParameter("tel");
	if(email!=null&&add!=null&&tel!=null){
	session.setAttribute("em", email);
	session.setAttribute("add", add);
	session.setAttribute("tel", tel);
	}
	
%>
<h3> name은<%=application.getAttribute("name_app") %></h3>
<h3> id은<%=application.getAttribute("id_app") %></h3>
<h3> email은 <%=session.getAttribute("em") %>입니다.</h3>
<h3> address은 <%=session.getAttribute("add") %>입니다.</h3>
<h3> tel은 <%=session.getAttribute("tel")
%>입니다.</h3>
<a href="d0619_6_c.jsp">AttributeTest3.jsp로 이동</a>

</body>
</html>