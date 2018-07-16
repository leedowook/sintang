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
PreparedStatement pstmt=null;
ResultSet rs = null;
request.setCharacterEncoding("UTF-8");

String sql="DELETE FROM MEMBER WHERE ID='"+request.getParameter("id")+"'";


try{
	Context init= new InitialContext();
	DataSource ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
	conn=ds.getConnection();
	
	
	pstmt=conn.prepareStatement(sql);
	pstmt.executeUpdate();
    
	
	
  out.println("<script>");
  out.println("location.href='member_list.jsp';</script>");
     
	
	
}catch(Exception e){
	e.printStackTrace();
	%> <script>alert('오류발생');</script>
		<jsp:forward page="logform.jsp"/><%
	
}
%>
</body>
</html>