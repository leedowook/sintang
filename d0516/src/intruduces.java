

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/intruduces")
public class intruduces extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



    public intruduces() {
        super();

    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		//request로 받은내용을 utf-8로 변경
		response.setContentType("text/html;charset=UTF-8 ");
    	PrintWriter out=response.getWriter();
    	
    	String a=request.getParameter("gender");
		String b=request.getParameter("come");
		String c=request.getParameter("hi");
		out.println("<html><body>");
		out.print("성별:<hr><b>"+a+"</b>");
		out.print("메일정보 수신여부:<hr><b>"+b+"</b>");
		out.print("가입인사:<hr><b><pre>"+c+"</b>");
		//뒤로가기 링크
		out.println("</b></pre><a href='javascript:history.go(-1)'>다시</a>");
		out.println("</html></body>");
		
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
