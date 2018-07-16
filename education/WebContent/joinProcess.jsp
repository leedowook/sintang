<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page  import="javax.naming.*" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body><% 
Connection conn=null;
String sql="INSERT INTO MEMBER VALUES(?,?,?,?,?,?)";
PreparedStatement pstmt=null;

request.setCharacterEncoding("UTF-8");
//한글로 제대로 바꿔줌 
String id=request.getParameter("id");
String password=request.getParameter("password");
String name=request.getParameter("name");
String age=request.getParameter("age");
String gender=request.getParameter("gender");
String email=request.getParameter("email");
try{
Context init=new InitialContext();
//context.xml에 있는걸 불러옴?
DataSource ds=(DataSource)init.lookup(
		"java:comp/env/jdbc/OracleDB");
//데이타 들어있는곳
conn=ds.getConnection();
//연결시도
pstmt=conn.prepareStatement(sql);
//명령어 추가
pstmt.setString(1,id);
pstmt.setString(2,password);
pstmt.setString(3,name);
pstmt.setInt(4,Integer.parseInt(age));
pstmt.setString(5,gender);
pstmt.setString(6,email);
//명령어의 ?값에 하나하나 대입해줌

//***해당 변경내용을 업데이트해줌 
int result=pstmt.executeUpdate();
if(result!=0){
	out.println("<script>");
	out.println("location.href='logform.jsp'</script>");
}else{
	out.println("<script>");
	out.println("location.href='joinForm.jsp'</script>");
	
}

	
	
}catch(Exception e){
	e.printStackTrace();
	%>alert('오류');
	<jsp:forward page="joinForm.jsp"/>
	<%
	

}finally{
	try{
		pstmt.close();
		conn.close();
		
		//db접속 해제
	}catch(Exception e){
		e.printStackTrace();
	}

}
%>
<h2>DB저장 페이지</h2>
</body>
</html>