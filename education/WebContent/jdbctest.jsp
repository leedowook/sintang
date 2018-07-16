<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%
    	Connection conn=null;
    	
    String driver="oracle.jdbc.driver.OracleDriver";
  //오라클에서 제공하는것을 사용한다.	
    String url="jdbc:orcle:thin:@localhost:1521:xe";
    	//타겟에대한 주소값
    Boolean connect=false;
    	try{
    		Class.forName(driver);
    		conn=DriverManager.getConnection(
    				url,"testldw","54321");
    				//db계정 넣어주기
			connect=true;
    		conn.close();
    	}catch(Exception e){
    		connect=false;
    		e.printStackTrace();
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>jdbcTest.jsp</h2>
<%if(connect=true){ %>
DB접속성공
<%}else{ %>
DB접속실패
<%} %>
</body>
</html>