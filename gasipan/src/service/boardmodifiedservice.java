package service;
import java.sql.*;
import static db.jdbc.*;
import been.boardbean;
import dao.boarddao;

public class boardmodifiedservice {
	public boolean modifiedboard(boardbean bb) {
		System.out.println("수정service실행");
		boarddao dao=boarddao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		
		int result=dao.updatecalrum(bb);
		boolean modresult=false;
		if(result>0) {
			commit(con);
			modresult=true;
			System.out.println("수정 정상완료");
		}
		else {
			rollback(con);
			modresult=false;
			System.out.println("수정실패");
		}
		close(con);
		return modresult;
	}
	}
