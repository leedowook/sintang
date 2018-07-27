package dao;

import static db.jdbc.close;

import java.sql.*;
import java.util.*;

import been.boardbean;

public class boarddao {
	private static boarddao boarddao;
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	//dao가 비어있을경우 getInstance실행
	public static boarddao getInstance() {
		if(boarddao==null) {
			boarddao=new boarddao();
			
			
		}
		return boarddao;
	}
	
	public void setConnection(Connection con) {
		this.con=con;}
	//창조
	public int registarticle(boardbean bb) {
		int result=0;
		int number=0;
		pstmt=null;
		String num="select max(b_num) from board";
		String sql2="Insert into board values(?,?,?,?,?,?,?,?,?,?,sysdate)";
		
		try {
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				number=rs.getInt(1)+1;
				
			}else {//등록된글이 없을떄 
				number=1;
			}
		
			
			pstmt = con.prepareStatement(sql2); 
			
			pstmt.setInt(1,number);
			pstmt.setString(2,bb.getName());
			pstmt.setString(3,bb.getPassword());
			pstmt.setString(4,bb.getSubject());
			pstmt.setString(5,bb.getContent());
			pstmt.setString(6,bb.getFile());
			pstmt.setInt(7,number);
			pstmt.setInt(8,0);
			pstmt.setInt(9,0);
			pstmt.setInt(10,0);
			
			result=pstmt.executeUpdate();
			
			
			System.out.println("boarddao 성공");
		}catch(Exception e) {
			System.out.println("boarddao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				close(rs);
		}
		
		return result;
	}
	
	
	//게식ㄹ 목록을 보여주기위함
	public ArrayList<boardbean> selectlistboard(int page) {
		System.out.println("dao list 접속");
		ArrayList<boardbean> ar=new ArrayList<>();
		boardbean bb=null;
		pstmt=null;
		rs=null;//순서 정렬기준: 1순위 re_ref 원본번호 2순위 순서번호
		//+rownum으로 순서를 매긴뒤 그것을 제외한 모든것을 출력 -정렬한 서브컬럼을 순서를 매겨줌, 그리고그사이에서 출력
		String sql="select v2.* from (select rownum rown,v1.* from (select * from board  order by b_re_ref desc,b_re_seq asc)v1)v2 WHERE v2.rown between ? AND ?";
		try {
			
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,20*(page-1));
		pstmt.setInt(2,page*20);
		rs=pstmt.executeQuery();
		if(rs.next()) {
		do {
		bb=new boardbean();
		bb.setName(rs.getString("b_name"));
		bb.setPassword(rs.getString("b_password"));
		bb.setSubject(rs.getString("b_subject"));
		bb.setContent(rs.getString("b_content"));
		bb.setFile(rs.getString("b_file"));
		bb.setReref(rs.getInt("b_re_ref"));
		bb.setRelev(rs.getInt("b_re_lev"));
		bb.setReseq(rs.getInt("b_re_seq"));
		bb.setReadcount(rs.getInt("b_readcount"));
		bb.setNum(rs.getInt("b_num"));
		bb.setDate(rs.getDate("b_date"));
		if(bb.getRelev()!=0) {
			bb.setSubject("[re]"+bb.getSubject());
		}
		ar.add(bb);
		}while(rs.next());
		}
		
		}catch(Exception e) {
			System.out.println("boarddao오류"+e);
			e.printStackTrace();
			
		}finally {
			
			close(pstmt);
			close(rs);
			
		}
		return ar;
	}
	public int upreadcount(int num){
		pstmt=null;
		String count="update board set b_readcount=(b_readcount+1) where b_num=?";
		int result=0;
		try {
			pstmt=con.prepareStatement(count);
			pstmt.setInt(1,num);
			
			
			result=pstmt.executeUpdate();
			
			
			System.out.println("boarddao 성공");
		}catch(Exception e) {
			System.out.println("boarddao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				
		}
		
		return result;
		
	}
	public boardbean selectnum(int num) {
	System.out.println("dao select 접속");
	
	boardbean bb=null;
	pstmt=null;
	rs=null;
	String sql="select * from board where b_num=?";
	try {
	pstmt = con.prepareStatement(sql);
	pstmt.setInt(1,num);
	rs=pstmt.executeQuery();
	if(rs.next()) {
	bb=new boardbean();
	bb.setName(rs.getString("b_name"));
	bb.setPassword(rs.getString("b_password"));
	bb.setSubject(rs.getString("b_subject"));
	bb.setContent(rs.getString("b_content"));
	bb.setFile(rs.getString("b_file"));
	bb.setReref(rs.getInt("b_re_ref"));
	bb.setRelev(rs.getInt("b_re_lev"));
	bb.setReseq(rs.getInt("b_re_seq"));
	bb.setReadcount(rs.getInt("b_readcount"));
	bb.setNum(rs.getInt("b_num"));
	bb.setDate(rs.getDate("b_date"));
	}
	
	}catch(Exception e) {
		System.out.println("찾기dao오류"+e);
		e.printStackTrace();
		
	}finally {
		close(pstmt);
		close(rs);
		
	}
	return bb;
	}
	public int updatecalrum(boardbean bb){
		pstmt=null;
		System.out.println("변경페이지 접속");
		System.out.println("내용"+bb.getContent());
		System.out.println("제목"+bb.getSubject());
		String count="update board set b_name=?,b_subject=?,b_content=? where b_num=?";
		int result=0;
		try {
			pstmt=con.prepareStatement(count);
			pstmt.setString(1,bb.getName());
			pstmt.setString(2,bb.getSubject());
			pstmt.setString(3,bb.getContent());
			pstmt.setInt(4,bb.getNum());
			result=pstmt.executeUpdate();
			
			
			System.out.println("boarddao 성공");
		}catch(Exception e) {
			System.out.println("boarddao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				
		}
		
		return result;
		
	}
	public int deletenum(int num) {
		System.out.println("dao delete 접속");
		pstmt=null;
		int result=0;
		String sql="delete from board where b_num=?";
		try {
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1,num);
		result=pstmt.executeUpdate();
		
		
		}catch(Exception e) {
			System.out.println("삭제dao오류"+e);
			e.printStackTrace();
			
		}finally {
			close(pstmt);
			
			
		}
		return result;
		}
	
	//전체 게시글 갯수 세주는 sql
	public int countcalrum() {
		int a=0;
		String calcount="select count(*) from board";
		try{pstmt=con.prepareStatement(calcount);
		
		rs=pstmt.executeQuery();
		while(rs.next()) {
		a=rs.getInt("count(*)");}}
		catch(Exception e) {
			System.out.println(e);
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return a;
	}
	
	
	//답글 달기용
	public int recomentarticle(boardbean bb) {
		int result=0;
		int number=0;
		pstmt=null;
		
		String num="select max(b_num) from board";
		String update="update board set b_re_seq=b_re_seq+1 where b_re_ref=? and b_re_seq>?";
		String sql2="Insert into board values(?,?,?,?,?,?,?,?,?,?,sysdate)";
		try {
			//num설정
			pstmt=con.prepareStatement(num);
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				number=rs.getInt(1)+1;
				
			}else {//등록된글이 없을떄 
				number=1;
			}
			//시퀸스넘버설정
			pstmt=con.prepareStatement(update);
			pstmt.setInt(1,bb.getReref());
			pstmt.setInt(2,bb.getReseq());
			pstmt.executeUpdate();
			
			System.out.println(bb.getReseq());
			
			pstmt = con.prepareStatement(sql2); 
			
			pstmt.setInt(1,number);
			pstmt.setString(2,bb.getName());
			pstmt.setString(3,bb.getPassword());
			pstmt.setString(4,bb.getSubject());
			pstmt.setString(5,bb.getContent());
			pstmt.setString(6,bb.getFile());
			pstmt.setInt(7,bb.getReref());
			pstmt.setInt(8,bb.getRelev()+1);
			pstmt.setInt(9,bb.getReseq()+1);
			pstmt.setInt(10,0);
			
			result=pstmt.executeUpdate();
			
			
			System.out.println("boarddao 성공");
		}catch(Exception e) {
			System.out.println("boarddao오류"+e);
			e.printStackTrace();

		}finally {	
				close(pstmt);
				close(rs);
		}
		
		return result;
	}

}