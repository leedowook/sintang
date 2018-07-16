package service;

import static db.jdbc.*;

import java.sql.Connection;
import java.util.*;

import been.boardbean;
import dao.boarddao;

public class boardlistservice {
	public ArrayList<boardbean> listboard(int page){
		System.out.println("listservice실행");
		boarddao dao=boarddao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		
		ArrayList<boardbean> ar=new ArrayList<>();
		ar=dao.selectlistboard(page);
		if(ar==null) {
			System.out.println("받아올 값이없음");
		}
		close(con);
		System.out.println(ar.get(0).getName());
		System.out.println(ar.get(1).getName());
		System.out.println("listservice끝");
		return ar; 
	}
	public int countcalrum() {
		System.out.println("현제 칼럼 갯수확인");
		boarddao dao=boarddao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int result=dao.countcalrum();
		
		
		close(con);
		return result;
	}
	
	
	public void countupserivce(int num){
		System.out.println("조회수 증가");
		boarddao dao=boarddao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		int result=dao.upreadcount(num);
		
		if(result>0) {
			
			System.out.println("조회수 증가성공");
			commit(con);
			System.out.println(num+"번의 게시글에 대한 조회수를 상승했습니다.");
		}
		else {
			System.out.println("조회수 증가실패");
			rollback(con);
		}
		
		close(con);
		
	}
}
