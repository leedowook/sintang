package com.choju.fpro.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.choju.fpro.dao.BoardDAO;
import com.choju.fpro.dao.MemberDAO;
import com.choju.fpro.vo.BoardVO;
import com.choju.fpro.vo.CommentVO;
import com.choju.fpro.vo.MemberVO;
import com.choju.fpro.vo.PageMaker;
import com.choju.fpro.vo.Public_BoardVO;

@Service
public class BoardService {
	
	@Autowired
	private BoardDAO bdao;
	
	@Autowired
	private MemberDAO memberDAO;
	
	private ModelAndView mav;
	
	@Autowired
	private HttpSession session;
	
	@Autowired
	private HttpServletRequest request;
	
	
	//글 목록
	public ModelAndView freeboardForm() {
		mav = new ModelAndView();
		List<BoardVO> freeboardForm = new ArrayList<BoardVO>();
		freeboardForm = bdao.freeboardForm();
		
		mav.addObject("FreeBoardlist", freeboardForm);
		mav.setViewName("freeboardForm");
		
		return mav;
	}
	
	//게시판 페이징
	public int count(int count) {
		return bdao.getListCount(count);
	}
	
	//게시판 페이징
	public List<BoardVO> getRead(PageMaker pagemaker) {
		System.out.println("서비스 pageMaker"+pagemaker.toString());
		return bdao.getRead(pagemaker);
	}
	
	//글쓰기
	public ModelAndView boardWrite(BoardVO boardVO, HttpServletResponse response) throws IOException {
		mav=new ModelAndView();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		int result = bdao.boardWrite(boardVO);
		if(result==0) {
			//글쓰기 실패시
			out.println("<script>");
			out.println("alert('다시 작성해주시기 바랍니다.');");
			out.println("history.back()");
			out.println("</script>");
			out.close();
		} else {
			//글쓰기 성공시
			out.println("<script>");
			out.println("alert('글쓰기에 성공했습니다.');");
			out.println("window.location.href='freeboardForm';");
			out.println("</script>");
			out.close();
			mav.setViewName("redirect:/freeboardForm");
		}
		
		return mav;
	}

	//조회수 증가 처리
	public void increaseHit(int board_Num) {
		bdao.increaseHit(board_Num);
	}
	
	//글 상세보기
	public ModelAndView boardView(int board_Num) {
		mav = new ModelAndView();
		BoardVO boardview = bdao.boardView(board_Num);
		System.out.println("Service File:"+boardview.getBoard_File());
		System.out.println("Service Filename:"+boardview.getBoard_FileName());
		mav.setViewName("boardView");
		mav.addObject("boardview", boardview);
		
		List<CommentVO> replyView = bdao.replyView(board_Num);
	    mav.addObject("replyView",replyView);
	    mav.setViewName("boardView");
	    
	    List<BoardVO> boardviewInList = new ArrayList<BoardVO>();
		boardviewInList = bdao.boardviewInList();
		
		mav.addObject("boardviewInList", boardviewInList);
		mav.setViewName("boardView");
	    
		/*mav.setViewName("boardView");*/
		return mav;
	}
	
	//글 수정 업데이트
	public void boardModify1(BoardVO boardVO) {
		bdao.boardModify1(boardVO);
	}

	//글 삭제하기
	public void boardDelete(int board_Num) {
		bdao.boardDelete(board_Num);
	}
	
	//allboard 내 게시판 호출
	public ModelAndView Allboard() {
		mav = new ModelAndView();
		List<BoardVO> freeboardForm = new ArrayList<BoardVO>();
		freeboardForm = bdao.freeboardForm();
		
		mav.addObject("FreeBoardlist", freeboardForm);
		mav.setViewName("Allboard");
		return mav;
	}

	//댓글 DB저장시퀴기
	public ModelAndView boardreply(CommentVO commentVO) {
		mav = new ModelAndView();
	      int result = bdao.boardreply(commentVO);
	      
	      if(result==0) {
	         mav.setViewName("boardWrite");
	      }else {
	         mav.setViewName("redirect:/boardView");
	      }
	      return mav;
	}
	
	//오홍홍 조와용 DB저장 시키기
	public ModelAndView ReplyLike(int comment_Numm, HttpServletResponse response,int board_Num) throws IOException { //comment_Num ??
		mav = new ModelAndView();
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
        int result = bdao.ReplyLike(comment_Numm);
        if(result==0) {
           mav.setViewName("boardWrite");
        }else {
        	/*out.println("<script>");
			out.println("alert('댓글 조와용에 성공했습니다.');");
			out.println("window.location.href='boardview';");
			out.println("</script>");
			out.close();*/
        	
           mav.setViewName("redirect:/boardview?board_Num="+board_Num);
        }
        return mav;
	}
	
	//----------------------------publicboardform Service -------------------------------------------
	
	//publicboardform
	public ModelAndView publicboardForm() {
		mav = new ModelAndView();
		List<Public_BoardVO> publicboardForm = new ArrayList<Public_BoardVO>();
		publicboardForm = bdao.publicboardForm();
		
		mav.addObject("PublicBoardlist", publicboardForm);
		mav.setViewName("publicboardForm");
		
		return mav;
	}

	
	
}
