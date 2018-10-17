package com.choju.fpro.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.BoardVO;
import com.choju.fpro.vo.CommentVO;
import com.choju.fpro.vo.PageMaker;
import com.choju.fpro.vo.Public_BoardVO;

@Repository
public class BoardDAO extends MemberDAO {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<BoardVO> freeboardForm() {
		return sqlSession.selectList("Board.freeboardForm");
	}
	
	public List<BoardVO> boardviewInList() {
		return sqlSession.selectList("Board.boardviewInList");
	}
	
	//게시판 페이징
	public int getListCount(int count) {
		return sqlSession.selectOne("Board.getListCount", count);
	}
		
	//게시판 페이징
	public List<BoardVO> getRead(PageMaker pagemaker) {
		System.out.println("DAO pageMaker"+pagemaker.toString());
		HashMap map=new HashMap();
		map.put("start",pagemaker.getBoardstartnum());
		map.put("end",pagemaker.getBoardendnum());
		System.out.println("boardDao실행");
		return sqlSession.selectList("Board.getRead", map);
	}

	//게시판 글처리
	public int boardWrite(BoardVO boardVO) {
		return sqlSession.insert("Board.boardwrite", boardVO);
	}
	
	// 조회수 증가처리
	public void increaseHit(int board_Num) {
		sqlSession.update("Board.increaseHit", board_Num);
	}

	// 글 상세보기
	public BoardVO boardView(int board_Num) {
		return sqlSession.selectOne("Board.boardview", board_Num);
	}

	// 글 수정하기
	public void boardModify(BoardVO boardVO) {
		sqlSession.selectOne("Board.boardmodify", boardVO);
	}

	// 글 수정 업데이트
	public void boardModify1(BoardVO boardVO) {
		sqlSession.update("Board.boardmodify1", boardVO);
	}

	// 글 삭제하기
	public void boardDelete(int board_Num) {
		sqlSession.delete("Board.boarddelete", board_Num);
	}
	
	// 댓글 쓰기
	public int boardreply(CommentVO commentVO) {
		return sqlSession.insert("Comment.boardreply", commentVO);
	}
	
	//작성한 댓글 리스트
	public List<CommentVO> replyList() {
		return sqlSession.selectList("Comment.replyList");
	}
	
	//생성된 댓글 리스트 보기
	public List<CommentVO> replyView(int board_Num) {
		return sqlSession.selectList("Comment.replyView", board_Num);
	}

	// 오홍홍 조와용
	public int ReplyLike(int comment_Num) {
		return sqlSession.update("Comment.ReplyLike", comment_Num);
	}

	//--------------------------------publicboardForm-------------------------------
	//public 게시판
	public List<Public_BoardVO> publicboardForm() {
		return sqlSession.selectList("PublicBoard.publicboardForm");
	}
	
	//public 게시판 글쓰기
	public int publicboardwrite(Public_BoardVO public_boardVO) {
		return sqlSession.insert("PublicBoard.publicboardwrite", public_boardVO);
	}
}
