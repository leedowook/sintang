<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
    <%@ page import="javax.sql.*" %>
    <%@ page import="javax.naming.*" %>
    <%
    Connection conn=null;
    String sql="SELECT * FROM CUSTOMER";
    String sql1="INSERT INTO STUDENT VALUES(99,'새로운 이름')";
    PreparedStatement pstmt=null;
    //db 조회결과를 담을 객체 선언
    ResultSet rs=null;
    try{
    	
    	Context init=new InitialContext();
    	//설정값
    	DataSource ds=(DataSource)init.lookup(
    	"java:comp/env/jdbc/OracleDB");
    	//주소값
    	
    	conn=ds.getConnection();
    	
    	conn.setAutoCommit(false);
    	pstmt=conn.prepareStatement(sql1);
    	
    	/* pstmt=conn.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,
    			ResultSet.CONCUR_UPDATABLE); */
    	
    	rs=pstmt.executeQuery();//SELECT * FROM STUDENT값이 담김
    	out.println("데이터 삽입완료");
    	conn.commit();
    	conn.rollback();
    	out.println(" 롤백완료");
    	
    	int i=1;
    	/* while(rs.next()){
    		//next() 메소드:db테이블의 튜플(행)단위로 읽어오며,
    		//다음 튜플이 있다면 true, 없다면 false를 반환
    		
    		out.println(i+"번쨰의 튜플 custid"+rs.getInt(1)+"<br>");
    		out.println(i+"번째 튜플의 name"+rs.getString(2)+"<br>");
    		out.println(i+"번째 튜플의 address"+rs.getString(3)+"<br>");
    		out.println(i+"번째 튜플의 phon"+rs.getString(4)+"<br>");
    		i++;
    	} */
    	rs.last();//가장 마지막값
    	rs.first();//가장 첫번째값
	rs.absolute(3);//3번째값
    }catch(Exception e){
		out.println("<h2>DB접속 실패</h2>");
		e.printStackTrace();
	}
    /*
    쿼리문은 student 테이블 모든 내용 조회 
    db접속 쿼리문실행
    */
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>