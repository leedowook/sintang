

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ad01_1
 */
@WebServlet("/ad01_1")
public class ad01_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
  
  
    public ad01_1() {
        super();
    }

	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("yolo", "Yaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahoooooooooooooooooooooo");
		//redirect방식으로 포워딩
		response.sendRedirect("redirect.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
