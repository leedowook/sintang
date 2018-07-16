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

String sql="SELECT * FROM MEMBER WHERE ID='"+request.getParameter("id")+"'";


try{
	Context init= new InitialContext();
	DataSource ds=(DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
	conn=ds.getConnection();
    stmt = conn.createStatement();
    rs = stmt.executeQuery(sql);
    rs.next();//예가 호출이되야 함
     out.println("아이디:"+rs.getString("id"));
     out.println("패스워드:"+rs.getString("password"));
    out.println("이름:"+rs.getString("name"));
    out.println("나이:"+rs.getInt("age"));
           out.println("성별:"+rs.getString("gender"));
           out.println("이메일:"+rs.getString("email"));
           

}catch(Exception e){
	e.printStackTrace();
	%> <script>alert('오류발생');
	location.href='member_list.jsp';</script><% 
}
%>
</body>
</html>