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
String sql="INSERT INTO STUDENT VALUES(?,?)";
PreparedStatement pstmt =null;
try{
	Context init= new InitialContext();
	DataSource ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
	conn=ds.getConnection();
	pstmt=conn.prepareStatement(sql);
	pstmt.setInt(1,101);
	pstmt.setString(2,"할로");
	pstmt.executeUpdate();
	/* for(int i=2;i<=5;i++){
		//?처리한 커리문에 값대입
		pstmt.setInt(1,i);
		if(pstmt.executeUpdate()!=0){
			out.println("<h2>"+i+"번데이터 삽입성공</h2>");
			
		}} */
	
	
}catch(Exception e){
	out.println("<h2>데이터 삽입 실패</h2>");
	e.printStackTrace();
	
}finally{
	try{
		pstmt.close();
		conn.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
%>
</body>
</html>