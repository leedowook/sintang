package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.actionforward;
import been.em_box_main;
import service.boxservice;

public class em_box_listdata implements action {
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		actionforward forward=new actionforward();
		String id=(String)session.getAttribute("id");
		boxservice bsv=new boxservice();
		ArrayList<em_box_main> eboxar=bsv.selectbox(id);
		request.setAttribute("arbox", eboxar);
		
		
		return forward;
	}
	
}


