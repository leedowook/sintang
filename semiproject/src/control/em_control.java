package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.action;
import action.em_adminmode;
import action.em_delgamedata;
import action.em_delpartdata;
import action.em_inputgamedata;
import action.em_inputpartdata;
import action.em_listgamedata;
import action.em_listpartdata;
import action.em_modgamedata;
import action.em_modpartdata;
import action.emchoiceaction_main;
import been.actionforward;




@WebServlet("*.em")
public class em_control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



    public em_control() {
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
    	System.out.println(command);
    	if(command.equals("/main_sel_1.em")) {
    		System.out.println("mainselcontrol에 접속");
    		
    		if(request.getAttribute("mainsel").equals("choice")) {
    			forward=new actionforward();
    			
        		forward.setPath("./em_first_main/em_cho.jsp");}
    		else {
    			forward=new actionforward();
    			
        		forward.setPath("./em_first_main/em_sel.jsp");
    		}
    		try {
    			
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	//추천 선택한 부분에 대한 부분 
    	else if(command.equals("/cho_sel.em")) {
    		System.out.println("cho_sel control에 접속");
    		action=new emchoiceaction_main();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	
    	else if(command.equals("/em_adminmode.em")) {
    		System.out.println("관리자 모드 접속");
    		action=new em_adminmode();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("/inputdata/em_adminmodeadd.em")) {
    		System.out.println("관리자 추가 모드 접속");
    		String active=(String) request.getParameter("active");
    		System.out.println(active);
    		if(active.equals("part")) {
    			action=new em_inputpartdata();
    		}
    		else {
    			action=new em_inputgamedata();
    		}
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("/adminmode/em_adminmodemod.em")) {
    		System.out.println("관리자 수정 모드 접속");
    		String active=(String) request.getAttribute("active");
    		if(active.equals("part")) {
    			action=new em_modpartdata();
    		}
    		else {
    			action=new em_modgamedata();
    		}
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("/adminmode/em_adminmodedel.em")) {
    		System.out.println("관리자 삭제 모드 접속");
    	
    		String active=(String) request.getParameter("active");
    		System.out.println(active);
    		if(active.equals("part")) {
    			action=new em_delpartdata();
    		}
    		else {
    			action=new em_delgamedata();
    		}
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	else if(command.equals("/adminmode/em_adminmodelist.em")) {
    		System.out.println("관리자 목록 action 접속");
    		String active=(String) request.getAttribute("active");
    		if(active.equals("part")) {
    			action=new em_listpartdata();
    		}
    		else {
    			action=new em_listgamedata();
    		}
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    	
    	//jsp로 넘겨주기 위한곳
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
