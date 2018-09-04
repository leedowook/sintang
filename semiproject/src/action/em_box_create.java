package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.actionforward;
import service.boxservice;

public class em_box_create implements action {
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession();
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		actionforward forward=new actionforward();
		String id=request.getParameter("id");
		boxservice mc=new boxservice();
		boolean result=mc.createbox((String)session.getAttribute("id"));
		
		if(result) {
			System.out.println("추천 받은 견적에 있는 정보 입력 성공");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('견적함에 입력성공')");
			out.println("</script>");
		
		}
		else {
			System.out.println("추천받은 견적 입력 실패");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('입력실패')");
			out.println("history.back()</script>");
		}
		forward.setRedirect(false);
		forward.setPath("em_first_main/em_cho.jsp");
		

		//반환값이 리턴이기에 놔둠
		return forward;
	}

}
