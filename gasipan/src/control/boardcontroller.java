package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.action;
import action.boarddeleteaction;
import action.boardfiledownaction;
import action.boardinfoaction;
import action.boardlistaction;
import action.boardmodifiedaction;
import action.boardmodifiedaction_b;
import action.boardrecomentaction;
import action.boardwriteaction;
import been.actionforward;


@WebServlet("*.bo")
public class boardcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
 

    public boardcontroller() {
        super();

    }
    
    
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	System.out.println("control연결완료");
    	String RequestURI=request.getRequestURI();
    	String contextPath=request.getContextPath();
    	String command=RequestURI.substring(contextPath.length());
    	actionforward forward=null;
    	action action=null;
    	request.setCharacterEncoding("UTF-8");
    	response.setContentType("text/html;charset=UTF-8 ");
    	
    	if(command.equals("/boardWritePro.bo")) {
    		System.out.println("borad writepro control에 접속");
    		action=new boardwriteaction();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("/boardList.bo")) {
    		System.out.println("boradlist control에 접속");
    		action=new boardlistaction();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("/boardInfo.bo")) {
    		System.out.println("boardinfo control에 접속");
    		action=new boardinfoaction();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	else if(command.equals("/boardWriteform.bo")) {
    		forward=new actionforward();
    		forward.setPath("./board/board.jsp");
    		//forward.setRedirect(true);
    	}
    	//수정
    	else if(command.equals("/boardModified.bo")) {
    		String step=request.getParameter("step");
    		System.out.println(request.getParameter("password"));
    		if(step.equals("a")) {//수정 정보 보내줄때
    		action=new boardmodifiedaction();
    		}
    		else if(step.equals("b")){//수정 할때
    		action=new boardmodifiedaction_b();
    		}
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	//답글
    	else if(command.equals("/boardRecoment.bo")) {
    		action=new boardrecomentaction();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	//삭제
    	else if(command.equals("/boardDownload.bo")) {
    		action=new boardfiledownaction();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("/boardDelete.bo")) {
    		action=new boarddeleteaction();
    		try {
    			response.setContentType("text/html;charset=UTF-8");
    			PrintWriter out=response.getWriter();
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    		
    	
    	if(forward!=null) {
    		if(forward.isRedirect()) {
    			response.sendRedirect(forward.getPath());
    		}
    		else {
    			RequestDispatcher dispatcher=
    					request.getRequestDispatcher(forward.getPath());
    			dispatcher.forward(request,response);
    		}
    	}
    	
    	
		
	}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doProcess(request, response);
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}

}
