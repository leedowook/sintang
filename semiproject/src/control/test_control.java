package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.action;
import action.em_adminmode;
import action.test;
import been.actionforward;

/**
 * Servlet implementation class test_control
 */
@WebServlet("*.bo")
public class test_control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public test_control() {
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
    	
    	
    	if(command.equals("/dday.bo")) {
    		System.out.println("관리자 모드 접속");
    		action=new test();
    		try {
    			forward=action.execute(request,response);
    			System.out.println("성공");
    		}catch(Exception e) {
    			e.printStackTrace();
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
