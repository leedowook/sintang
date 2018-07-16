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
request.setCharacterEncoding("UTF-8");
String logid=request.getParameter("logid");
String logpw=request.getParameter("logpw");
String sql="SELECT ID,PASSWORD FROM MEMBER WHERE ID='"+logid+"' AND PASSWORD='"+logpw+"'";


try{
	Context init= new InitialContext();
	DataSource ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
	conn=ds.getConnection();
    stmt = conn.createStatement();
    rs = stmt.executeQuery(sql);//조회한결과를 가지고있는객체
    boolean log=false;
   
    while (rs.next()) {
        log=true;
    }
	if(log){
		
		
			
			session.setAttribute("id", logid);
		
		%><jsp:forward page="logmain.jsp"/><%
	}
	else{
		%><script>alert('로그인실패');
		location.href="logform.jsp";</script>
<%
	}
	
}catch(Exception e){
	e.printStackTrace();
	%> <script>alert('오류발생');</script>
		<jsp:forward page="logform.jsp"/><%
	
}
%>
</body>
</html>