package d0516_pack;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/getpr")
public class getpr extends HttpServlet {
	private static final long serialVersionUID = 1L;    
    public getpr() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/

		//link방식으로 넘어온건 무조건 get으로 선언됨
		//request로 넘어온 값들중에서 name 속성값이 id인 것의 입력내용을 String 타입의변수 id에담는다
		
		String page= request.getParameter("page");
		String a= request.getParameter("a");
		String b= request.getParameter("b");
		response.setContentType("text/html; charset=UTF-8");
		//처리한 결과를 client 에게 넘겨주기 위해 인코딩 방식등을 설정 
		PrintWriter out =response.getWriter();
		//rintWriter 타입의 out 객체 선언
		//Servlet에서 html 태그를 사용할수 잇게해줌
		out.println(page+"page로넘어갔다");
		out.println(b+"b다");
		out.print(a+"a다");
	
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
