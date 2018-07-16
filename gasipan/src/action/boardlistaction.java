package action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import been.boardbean;
import service.boardlistservice;
import been.actionforward;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.util.*;
import java.io.*;

public class boardlistaction implements action {

	@Override
	public actionforward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		actionforward forward=null;
		ArrayList<boardbean> ar=new ArrayList<>();
		boardlistservice boardlistservice=new boardlistservice();
		int page=Integer.parseInt(request.getParameter("page"));
		ar=boardlistservice.listboard(page);
		
		if(ar!=null) {
			System.out.println(ar.get(0).getName());
			request.setAttribute("count",boardlistservice.countcalrum());
			request.setAttribute("page",page);
			request.setAttribute("boardlist",ar);
			forward=new actionforward();
			forward.setPath("board/boardlist.jsp");
			
			//redirect는 true면 request영역이 안넘어감
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out=response.getWriter();
			out.println("<script>");
			out.println("alert('리스트조회실패')");
			out.println("history.back()</script>");
		}
		
		
		return forward;
	}
	
}
