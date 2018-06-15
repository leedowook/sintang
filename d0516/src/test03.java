

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test03
 */
@WebServlet("/test03")
public class test03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test03() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		//request로 받은내용을 utf-8로 변경
		response.setContentType("text/html;charset=UTF-8 ");
    	PrintWriter out=response.getWriter();
    	
		String a=request.getParameter("nam");
		String b=request.getParameter("add");
		String c=request.getParameter("phn");
		String d=request.getParameter("hob");
		out.print("이름:"+a+"<br>");
		out.print("주소:"+b+"<br>");
		out.print("전화번호:"+c+"<br>");
		out.print("취미:"+d+"<br>");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html;charset=UTF-8 ");
		PrintWriter out=response.getWriter();
		String a=request.getParameter("nam");
		String b=request.getParameter("add");
		String c=request.getParameter("phn");
		String d=request.getParameter("hob");
		
		out.print("이름:"+a+"<br>");
		out.print("주소:"+b+"<br>");
		out.print("전화번호:"+c+"<br>");
		out.print("취미:"+d+"<br>");
		*/
		doProcess(request,response);
		
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*request.setCharacterEncoding("UTF-8");
		//request로 받은내용을 utf-8로 변경
		response.setContentType("text/html;charset=UTF-8 ");
    	PrintWriter out=response.getWriter();
    	
		String a=request.getParameter("nam");
		String b=request.getParameter("add");
		String c=request.getParameter("phn");
		String d=request.getParameter("hob");
		out.print("이름:"+a+"<br>");
		out.print("주소:"+b+"<br>");
		out.print("전화번호:"+c+"<br>");
		out.print("취미:"+d+"<br>");
		*/
		doProcess(request,response);
	}

}
