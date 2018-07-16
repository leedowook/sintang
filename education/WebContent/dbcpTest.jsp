<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%
	Connection conn= null;
	//실제 전송할 쿼리문을 String 변수로 선언,
	String sql="INSERT INTO STUDENT VALUES(2,'얍')";
	Statement stmt=null;
	try{
		//db 관련 설정 정보를 가져오기
		Context init=new InitialContext();
		//톰캣 서버에 공유되어 있는 DataSource 객체를 가져옴
		//java:comp/env/ 객체에 접근하기 위한 경로값
		//jdbc/OracleDb:context.xml에 정의한 name 속성값
		DataSource ds=(DataSource)init.lookup(
				"java:comp/env/jdbc/OracleDB");
		//getConnection 메소드를 이용하여 접속시도.
		conn=ds.getConnection();
		stmt=conn.createStatement();
		//z쿼리문을 전송하는부분
		//executeUpdate()의 리턴 값은
		int result=stmt.executeUpdate(sql);
		//아무것도 실행안되면 0반환
		if(result!=0){
			out.println("<h2>쿼리문이 정상적을 전송되었습니다.</h2>");
			
		}
		//out.println("<h2>db 접속 성공</h2>")
		out.println("<h2>DB접속 성공</h2>");
		
	}catch(Exception e){
		out.println("<h2>DB접속 실패</h2>");
		e.printStackTrace();
	}finally{
		try{
			stmt.close();
			conn.close();
			
			//db접속 해제
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>dbcpTest.jsp파일입니다.</h2>
</body>
</html>