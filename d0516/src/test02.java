

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test02
 */
@WebServlet("/test02")
public class test02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   


    public test02() {
        super();

    }

	
	 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8 ");
		String name= request.getParameter("name");//클라이언트의 요청을 받아 name에있는값을 받아온다.
		String age= request.getParameter("age");
		String page= request.getParameter("page");
		System.out.println(name);
		System.out.println(age);
		PrintWriter out =response.getWriter();
		
		out.println("이름:"+name+"<br>");
		out.println("나이:"+age+"<br>");
		out.println("페이지:"+page);
		//여기서 이 서버넷만 실행시키고 해당 링크에  jsp에 초기화 시키듯이 뒤에 클래스명 뒤에? 달아주고 초기화해주면 해당값이초기화됨
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
