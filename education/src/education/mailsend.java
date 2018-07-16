package education;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class mailsend
 */
@WebServlet("/mailsend")
public class mailsend extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public mailsend() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sende=request.getParameter("sende");
		String rece=request.getParameter("rece");
		String title=request.getParameter("title");
		String subject=request.getParameter("subject");
	
		
		response.setContentType("text/html;charset=UTF-8 ");
		PrintWriter out=response.getWriter();
		//뷰페이지로 부터 전송받은 내용을 가져오기
		//한글처리
		//out객체선언
		
		try {
			
			Properties properties=System.getProperties();
			properties.put("mail.smtp.starttls.enable","true");
			properties.put("mail.smtp.host","smtp.gmail.com");
			properties.put("mail.smtp.auth","true");
			properties.put("mail.smtp.port","587");
			Authenticator auth=new googleserver();
			
			Session s =Session.getDefaultInstance(properties, auth);
			Message message=new MimeMessage(s);
			Address sender_address=new InternetAddress(sende);
			Address receiver_address=new InternetAddress(rece);
			
			message.setHeader("content-type","text/html;charset=UTF-8");
			message.setFrom(sender_address);
			message.addRecipient(Message.RecipientType.TO,receiver_address);
			message.setSubject(title);
			message.setContent(subject,"text/html;charset=UTF-8");
			message.setSentDate(new java.util.Date());
			
			//메세지 객체 전송
			Transport.send(message);
			out.println("<h2>메일이 정상적으로전송완료</h2>");
			
		}catch(Exception e) {
			out.print("smtp서버가 잘못설정되었거나 서비스에 문제가있스비다.");
			e.printStackTrace();
		}
	}

}
