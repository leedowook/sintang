package service;

import java.sql.*;
import static db.jdbc.*;
import been.boardbean;
import dao.boarddao;

public class boardselectnumservice {
	public boardbean selectcalrum(int num) {
		System.out.println("selectservice실행");
		boarddao dao=boarddao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		boardbean bb=new boardbean();
		bb=dao.selectnum(num);
		if(bb==null) {
			System.out.println("받아올 값이없음");
		}
		close(con);
		return bb;
	}
	}
