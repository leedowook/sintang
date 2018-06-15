

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ad01
 */
@WebServlet("/ad01")
public class ad01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   
   
    public ad01() {
        super();
   
    }

	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*포워딩 방식
		 * 1.dispatcher 방식
		 * 	:이 방식으로 포워딩 하면 주소가 바뀌지 않고  리얼 주소가 바뀌지 않음 servlet파일을 실행해서 jsp 파일을 띄어도 servlet 주소임 
		 * 	:같은 request 영역을 공유함
		 * 2.redirect 방식
		 * :이방식으로 포워딩하면 주소가 바뀜
		 * :request 영역이 공유되지않음*/
		RequestDispatcher dispatcher=request.getRequestDispatcher("dispatcher.jsp");
		//dispatcher.jsp목적지 일로 보낸다
		//리퀘스트 영역에 리퀘스트ㅏㄹ는 속성에 맄퀘스트 벨류 라는 값을 담아 전달   request=requestValue
		request.setAttribute("request", "requestValue");
		//리퀘스트와 리스폰즈에 있는 내용 모두 포워딩함
		//포워딩 하고자 하는 목적지는 위에 객체 선언시 적어준 "disptcher.jsp"파일"
		dispatcher.forward(request, response);

	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
