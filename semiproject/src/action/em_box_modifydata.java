package action;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.actionforward;
import been.em_box_userinfo;
import methodcode.selectpartdata;
import service.boxservice;

public class em_box_modifydata implements action {
	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		actionforward forward=new actionforward();
		selectpartdata mc=new selectpartdata();
		boxservice bsv=new boxservice(); 
		em_box_userinfo main= new em_box_userinfo();  
		
		
		boolean result=bsv.updateboxpart(main);
		if(result) {
			System.out.println("추천 받은 견적에 있는 정보 입력 성공");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('견적함에 입력성공')");
			out.println("history.back()</script>");
			
		}
		else {
			System.out.println("추천받은 견적 입력 실패");
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('입력실패')");
			out.println("history.back()</script>");
		}
		
		
		
		return forward;
	}
	
}


