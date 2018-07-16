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

String sql="SELECT ID,PASSWORD FROM MEMBER";


try{
	Context init= new InitialContext();
	DataSource ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
	conn=ds.getConnection();
    stmt = conn.createStatement();
    rs = stmt.executeQuery(sql);
    
  
      while(rs.next()){
             out.print(rs.getString("id"));
             
           out.print(rs.getString("password"));
           
    boolean log=false;
   
      }
	
	
}catch(Exception e){
	e.printStackTrace();
	%> <script>alert('오류발생');</script>
		<jsp:forward page="logform.jsp"/><%
	
}
%>
</body>
</html>