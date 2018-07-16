<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@page import="java.sql.*" %>
<%@page import="javax.sql.*" %>
<%@page import="javax.naming.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Connection conn=null;
Statement stmt = null;
ResultSet rs = null;
String sql="SELECT ID FROM MEMBER ";
try{Context init= new InitialContext();
DataSource ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
conn=ds.getConnection();
stmt = conn.createStatement();
rs = stmt.executeQuery(sql);
while (rs.next()) {
String id = rs.getString("id");
%>
<!-- 상세페이지 링크 -->
<a href="member_info.jsp?id=<%=id%>"><%=id%></a>
<!--  회원정보 삭제를 위한 링크 -->
<a href="member_del.jsp?id=<%=id%>">삭제</a><br/>
<%

}
%><br/>
<a href="logmain.jsp" onclick="<%session.setAttribute("id","admin");%>">메인화면으로</a><%


}catch(Exception e){
	e.printStackTrace();
	%> alert("오류발생");
	<jsp:forward page="logform.jsp"/><%

}
%>
</body>
</html>