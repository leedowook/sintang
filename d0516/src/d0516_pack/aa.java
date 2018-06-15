package d0516_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// "/aa"=url mapping 값 
@WebServlet("/aa")//어노테이션
public class aa extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public aa() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
			String id=request.getParameter("id");
			String passwd=request.getParameter("pw");
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out= response.getWriter();
			out.println("입력한 아이디:"+id);
			out.println("입력한 비밀번호:"+passwd);
			
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
