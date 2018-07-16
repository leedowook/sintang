package action;



import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.actionforward;
import been.boardbean;
import service.boardmodifiedservice;
import service.boardselectnumservice;

public class boardmodifiedaction_b implements action {

	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		actionforward forward = null;
		request.setCharacterEncoding("UTF-8");
		int num=Integer.parseInt(request.getParameter("num"));
		String password=request.getParameter("password");
		//번호와같은거찾기
		boardbean bb=new boardbean();
		boardmodifiedservice bmfs=new boardmodifiedservice();
		boardselectnumservice bsns=new boardselectnumservice();
		bb=bsns.selectcalrum(num);
		System.out.println(request.getParameter("password"));
		System.out.println(request.getParameter("subject"));
		System.out.println(bb.getPassword());
		if(bb.getPassword().equals(password)) {
			System.out.println("수정 정상처리과정 1-1");
			bb.setName(request.getParameter("name"));
			bb.setPassword(request.getParameter("password"));
			bb.setSubject(request.getParameter("subject"));
			bb.setContent(request.getParameter("content"));
			boolean result=bmfs.modifiedboard(bb);
			if(result) {
				forward=new actionforward();
				forward.setRedirect(true);
				forward.setPath("boardList.bo?page=1");
			}
			else {response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('수정과정에서 삑났습니다.')");
			out.println("history.back()</script>");
			System.out.println("수정과정오류");}
			
		}
			
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('수정권한이 없습니다.')");
			out.println("history.back()</script>");
			System.out.println("비밀번호 미일치상태");
		}
		
		
		
		
		return forward;
	}

}
