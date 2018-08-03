package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.actionforward;

public class test implements action{
	//관리자모드 관리자페이지로 이동안내
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession();
		actionforward forward=null;
		int price=Integer.parseInt(request.getParameter("Dprice"));
		String id=(String)session.getAttribute("id");
		System.out.println("가격:"+price);
		if(!(id.equals(null))) {
			System.out.println("테스트 접속완료 아이디 일치 action");
			forward=new actionforward();
			forward.setRedirect(true);
			forward.setPath("adminmode/adminpage_main.jsp");
		}
		else {
			System.out.println("아이디가 없음 아이디 불일치 action");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('로그인후 실행해주세요 or 로그인페이지')");
			out.println("history.back()</script>");
		}
		
		return forward;
	}
}
