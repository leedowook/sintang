package service;
import java.sql.*;
import static db.jdbc.*;
import been.boardbean;
import dao.boarddao;


public class boardwriteservice {
	public boolean registarticle(boardbean bb) throws SQLException{
		System.out.println("service접근중");
		boarddao dao = boarddao.getInstance();
		int result=0;
		//db접속
		Connection con=getConnection();
		dao.setConnection(con);
		boolean writeresult=false;
		if(bb.getReref()==-1) {
		result=dao.registarticle(bb);	}
		else {
		
		
		result=dao.recomentarticle(bb);
		}
		if(result>0) {
			writeresult=true;
			commit(con);
			System.out.println("commit실행");
			
		}
		else {
			writeresult=false;
	    	rollback(con);
	    	System.out.println("rollback실행");
		}
		close(con);
		return writeresult;
	
	}
}
