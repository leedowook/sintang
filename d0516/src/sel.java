

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sel
 */
@WebServlet("/sel")
public class sel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sel() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		String a=request.getParameter("bul");
		
		out.println("당신의 탄의종류:");
		out.println(a);
		
	
		String[] b=request.getParameterValues("guns");
		if(b==null) {out.println("비었다");}
		else {
		out.println("해당 총알의 갯수:");
		for(String bu:b) {
			out.print(bu+" ");
			
		}}
    
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

}
