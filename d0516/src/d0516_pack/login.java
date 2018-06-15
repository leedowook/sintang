package d0516_pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public login() {
        super();
        
    }
  //doget 메소드: get방식으ㅗ 넘어온 데이터를 처리하기위한 메소드
  	//매개변수 httpsevletrequest
  	//	HttpServletRequest:client->sever
  	// HttpServletResponse:server->client
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
		String id=request.getParameter("id");
		
		//request로 넘어온 값들중에서 name 속성값이 id인 것의 입력내용을 String 타입의변수 id에담는다
		System.out.println("id변수에 담긴 값:"+id);
		String passwd=request.getParameter("pw");
		response.setContentType("text/html; charset=UTF-8");
		//처리한 결과를 client 에게 넘겨주기 위해 인코딩 방식등을 설정 
		PrintWriter out =response.getWriter();
		//PrintWriter 타입의 out 객체 선언
		//Servlet에서 html 태그를 사용할수 잇게해줌
		out.print("입력한 아이디:"+id);//위에서 선언한 printWriter에 대한 객체를 실행 
		out.print("입력한 패스워드:"+passwd);
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
