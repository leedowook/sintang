package action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.actionforward;
import been.boardbean;
import service.boardlistservice;
import service.boardselectnumservice;

public class boardinfoaction implements action {

	@Override
	
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		actionforward forward;
		request.setCharacterEncoding("UTF-8");
		int num=Integer.parseInt(request.getParameter("num"));
		boardbean bb=new boardbean();
		boardlistservice boardlistservice=new boardlistservice();
	
		
		//조회수 증가
		boardlistservice.countupserivce(num);
		//번호와같은거찾기
		boardselectnumservice bsns=new boardselectnumservice();
		bb=bsns.selectcalrum(num);
		
		forward= new actionforward();
		request.setAttribute("list_1",bb);
		forward.setPath("/board/boardinfo.jsp");
		return forward;
	}
	

}
