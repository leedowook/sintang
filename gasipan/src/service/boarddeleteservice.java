package service;

import java.sql.*;
import static db.jdbc.*;
import been.boardbean;
import dao.boarddao;


public class boarddeleteservice {
	public boolean deleteboard(int num) throws SQLException{
		System.out.println("service접근중");
		boarddao dao = boarddao.getInstance();
		
		//db접속
		Connection con=getConnection();
		dao.setConnection(con);
		boolean delresult=false;
		int result=dao.deletenum(num);
		
		if(result>0) {
			delresult=true;
			commit(con);
			System.out.println("commit실행");
			
		}
		else {
			delresult=false;
	    	rollback(con);
	    	System.out.println("rollback실행");
		}
		close(con);
		return delresult;
	
	}
}
