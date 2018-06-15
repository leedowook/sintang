

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test04
 */
@WebServlet("/test04")
public class test04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test04() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		//request로 받은내용을 utf-8로 변경
		response.setContentType("text/html;charset=UTF-8 ");
    	PrintWriter out=response.getWriter();
    	
		String[] a=request.getParameterValues("a");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body bgcolor='black'>");
		out.println("<table align='center' bgcolor='yellow'>");
		out.println("<tr>");
		for(int i=0;i<a.length;i++) {
			
			
			out.print("<td>");
			out.print("<img src="+a[i]+" width="+500+" height="+300+">");
			out.print("</td>");
			if(a[i+1]==null) {break;}}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		
    }

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}

}
