package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import been.actionforward;
import been.boardbean;
import service.boarddeleteservice;
import service.boardselectnumservice;

public class boarddeleteaction implements action{
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		actionforward forward=null;
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		int num=Integer.parseInt(request.getParameter("num"));
		boarddeleteservice bds=new boarddeleteservice();
		
		boardselectnumservice bsns=new boardselectnumservice();
		String password= null;
		password = JOptionPane.showInputDialog("마 패스워드입력해라");

		boardbean bb=new boardbean();
		bb=bsns.selectcalrum(num);
		if(bb.getPassword().equals(password)) {
			boolean delresult=bds.deleteboard(num);
			if(delresult) {
			forward=new actionforward();
			forward.setRedirect(true);
			forward.setPath("boardList.bo?page=1");
			System.out.println("삭제성공");
			}
			else {
			
			out.println("<script>");
			out.println("alert('삭제가 실패했습니다.');");
			out.println("history.back()</script>");
			System.out.println("삭제실패상태");
			}}
		else {
				
				out.println("<script>");
				out.println("alert('삭제권한이 없습니다.');");
				out.println("history.back()</script>");
				System.out.println("비밀번호 미일치상태");
			}
		
		return forward;
	}
	
}
