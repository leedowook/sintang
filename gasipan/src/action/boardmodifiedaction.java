package action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.actionforward;
import been.boardbean;

import service.boardselectnumservice;

public class boardmodifiedaction implements action{
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		actionforward forward;
		request.setCharacterEncoding("UTF-8");
		int num=Integer.parseInt(request.getParameter("num"));
		//번호와같은거찾기
		boardbean bb=new boardbean();
		boardselectnumservice bsns=new boardselectnumservice();
		bb=bsns.selectcalrum(num);
		forward= new actionforward();
		request.setAttribute("list_1",bb);
		forward.setPath("/board/boardmodified.jsp");
		return forward;
	}
	
}
