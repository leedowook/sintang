package com.choju.fpro.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choju.fpro.vo.MemberVO;

public class Mailservlet {
	public void setdmail(MemberVO membervo,HttpServletResponse response,HttpServletRequest request) throws IOException {
			request.setCharacterEncoding("UTF-8");
			String host  = "http://localhost:604/fpro/"; //페이지 주소
			System.out.println("메일 서블렛"+membervo.getEmail());
			String sender = "ksq9511@gmail.com"; // 보낸 사람 이메일  
			String receiver = membervo.getEmail();// 유저 이메일
			String subject = "인증번호 발송";// 제목
			//내용
			String content ="<html>"+
					"<body>\r\n" + 
					"	<div\r\n" + 
					"		style=\"background: #fff; background-color: #fff; Margin: 0px auto; max-width: 600px;\">\r\n" + 
					"\r\n" + 
					"		<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n" + 
					"			style=\"background: #fff; background-color: #fff; width: 100%;\">\r\n" + 
					"			<tbody>\r\n" + 
					"				<tr>\r\n" + 
					"					<td\r\n" + 
					"						style=\"border: 1px solid #ebeef6; direction: ltr; font-size: 0px; padding: 36px 0; text-align: center; vertical-align: top;\">\r\n" + 
					"						<!--[if mso | IE]>\r\n" + 
					"                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n" + 
					"\r\n" + 
					"                        <tr><td style=\"vertical-align:top;width:540px;\">\r\n" + 
					"                    <![endif]-->\r\n" + 
					"\r\n" + 
					"						<div\r\n" + 
					"							style=\"font-size: 13px; text-align: left; direction: ltr; display: inline-block; vertical-align: top; width: 100%;\">\r\n" + 
					"\r\n" + 
					"							<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"\r\n" + 
					"								style=\"vertical-align: top;\" width=\"100%\">\r\n" + 
					"\r\n" + 
					"								<tbody>\r\n" + 
					"									<tr>\r\n" + 
					"										<td align=\"left\"\r\n" + 
					"											style=\"font-size: 0px; padding: 10px 25px; word-break: break-word;\">\r\n" + 
					"\r\n" + 
					"											<div\r\n" + 
					"												style=\"font-family: sans-serif; font-size: 20px; font-weight: bold; line-height: 22px; text-align: left; color: #022553;\">\r\n" + 
					"												이메일 인증</div>\r\n" + 
					"\r\n" + 
					"										</td>\r\n" + 
					"									</tr>\r\n" + 
					"\r\n" + 
					"									<tr>\r\n" + 
					"										<td align=\"left\"\r\n" + 
					"											style=\"font-size: 0px; padding: 10px 25px; word-break: break-word;\">\r\n" + 
					"\r\n" + 
					"											<div\r\n" + 
					"												style=\"font-family: sans-serif; font-size: 14px; line-height: 22px; text-align: left; color: #596070;\">\r\n" + 
					"												<p style=\"margin-bottom: 0\">\r\n" + 
					"													저희 서비스를 이용해 주셔서 감사합니다.<br>서비스 이용을 위해 <span\r\n" + 
					"														style=\"color: #15AAF3\"></span> 고객님의<br>\r\n" + 
					"													이메일을 인증해주시기 바랍니다.\r\n" + 
					"												</p>\r\n" + 
					"												<p>이메일 인증이 완료되면 정상적으로 사이트 이용이 가능합니다.</p>							\r\n" + 
					"											</div>\r\n" + 
					"\r\n" + 
					
					"										</td>\r\n" + 
					"									</tr>\r\n" + 
					"\r\n" + 
					"									<tr>\r\n" + 
					"										<td align=\"left\"\r\n" + 
					"											style=\"font-size: 0px; padding: 10px 25px; word-break: break-word;\">\r\n" + 
					"\r\n" + 
					"											<table align=\"left\" border=\"0\" cellpadding=\"0\"\r\n" + 
					"												cellspacing=\"0\"\r\n" + 
					"												style=\"border-collapse: separate; width: 200px; line-height: 100%;\">\r\n" + 
					"												<tbody>\r\n" + 
					"													<tr>\r\n" + 
					"														<td align=\"center\" valign=\"middle\" bgcolor=\"#15AAF3\"\r\n" + 
					"															style=\"border: none; border-radius: 3px; color: white; cursor: auto; height: 24px; padding: 10px 25px;\">\r\n" + 
					"															<a href='"+host+"mailcheck?sha256="+membervo.getSha256()+"&email="+membervo.getEmail()+"'"+
					"															style=\"background: #15aaf3; color: white; font-family: sans-serif; font-size: 13px; font-weight: normal; line-: 120%; margin: 0; text-decoration: none; text-transform: none;\"\r\n" + 
					"															target=\"_blank\" rel=\"noreferrer noopener\"> <span\r\n" + 
					"																style=\"padding: 0; margin-bottom: 40px;\">이메일 인증하기</span>\r\n" + 
					"														</a>\r\n" + 
					"														</td>\r\n" + 
					"													</tr>\r\n" + 
					"												</tbody>\r\n" + 
					"											</table>\r\n" + 
					"\r\n" + 
					"										</td>\r\n" + 
					"									</tr>\r\n" + 
					"\r\n" + 
					"									<!--&lt;tr&gt;-->\r\n" + 
					"									<!--&lt;td align=\"left\" style=\"font-size:0px;padding:10px 25px;word-break:break-word;\"&gt;-->\r\n" + 
					"\r\n" + 
					"									<!--&lt;div style=\"font-family:sans-serif;font-size:14px;line-height:22px;text-align:left;color:#596070;\"&gt;-->\r\n" + 
					"									<!--Notice: Foreigners are required to pass different verification process first. &lt;br&gt;Please click this &lt;a href=\"https://support.whalex.com/hc/en-us/articles/360001453733\" style=\"color: #15AAF3\"&gt;link&lt;/a&gt; and-->\r\n" + 
					"									<!--check how to step further.-->\r\n" + 
					"									<!--&lt;/div&gt;-->\r\n" + 
					"\r\n" + 
					"									<!--&lt;/td&gt;-->\r\n" + 
					"									<!--&lt;/tr&gt;-->\r\n" + 
					"\r\n" + 
					"									<tr>\r\n" + 
					"										<td style=\"font-size: 0px; word-break: break-word;\">\r\n" + 
					"											<!--[if mso | IE]>\r\n" + 
					"\r\n" + 
					"                                    <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td height=\"20\" style=\"vertical-align:top;height:20px;\">\r\n" + 
					"\r\n" + 
					"                                    <![endif]-->\r\n" + 
					"\r\n" + 
					"											<div style=\"height: 20px;\">&nbsp;</div> <!--[if mso | IE]>\r\n" + 
					"\r\n" + 
					"                                    </td></tr></table>\r\n" + 
					"\r\n" + 
					"                                    <![endif]-->\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"										</td>\r\n" + 
					"									</tr>\r\n" + 
					"\r\n" + 
					"									<tr>\r\n" + 
					"										<td align=\"left\"\r\n" + 
					"											style=\"font-size: 0px; padding: 10px 25px; word-break: break-word;\">\r\n" + 
					"\r\n" + 
					"											<div\r\n" + 
					"												style=\"font-family: sans-serif; font-size: 14px; line-height: 22px; text-align: left; color: #596070;\">\r\n" + 
					"												해당 이메일을 직접 요청한 적이 없다면<br> <a\r\n" + 
					"													href=\"https://support.whalex.com\" style=\"color: #15aaf3\"\r\n" + 
					"													rel=\"noreferrer noopener\" target=\"_blank\">고객 센터</a>로\r\n" + 
					"												연락해주시기 바랍니다.\r\n" + 
					"											</div>\r\n" + 
					"\r\n" + 
					"										</td>\r\n" + 
					"									</tr>\r\n" + 
					"\r\n" + 
					"									<tr>\r\n" + 
					"										<td\r\n" + 
					"											style=\"font-size: 0px; padding: 10px 25px; word-break: break-word;\">\r\n" + 
					"\r\n" + 
					"											<p\r\n" + 
					"												style=\"border-top: solid 1px #ebeef6; font-size: 1; margin: 0px auto; width: 100%;\">\r\n" + 
					"											</p> <!--[if mso | IE]>\r\n" + 
					"                                    <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-top:solid 1px #ebeef6;font-size:1;margin:0px auto;width:490px;\" width=\"490px\">\r\n" + 
					"                                        <tr><td style=\"height:0;line-height:0;\">\r\n" + 
					"                                                 \r\n" + 
					"                                            </td></tr>\r\n" + 
					"                                    </table>\r\n" + 
					"                                    <![endif]-->\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"										</td>\r\n" + 
					"									</tr>\r\n" + 
					"\r\n" + 
					"									<tr>\r\n" + 
					"										<td align=\"left\"\r\n" + 
					"											style=\"font-size: 0px; padding: 10px 25px; word-break: break-word;\">\r\n" + 
					"\r\n" + 
					"											<div\r\n" + 
					"												style=\"font-family: sans-serif; font-size: 14px; line-height: 22px; text-align: left; color: #596070;\">\r\n" + 
					"												감사합니다,<br> SZ 드림.\r\n" + 
					"											</div>\r\n" + 
					"\r\n" + 
					"										</td>\r\n" + 
					"									</tr>\r\n" + 
					"\r\n" + 
					"								</tbody>\r\n" + 
					"							</table>\r\n" + 
					"\r\n" + 
					"						</div> <!--[if mso | IE]>\r\n" + 
					"                    </td></tr>\r\n" + 
					"\r\n" + 
					"                    </table>\r\n" + 
					"                    <![endif]-->\r\n" + 
					"					</td>\r\n" + 
					"				</tr>\r\n" + 
					"			</tbody>\r\n" + 
					"		</table>\r\n" + 
					"\r\n" + 
					"	</div>\r\n" + 
					"\r\n" + 
					"\r\n" + 
					"</body>\r\n" + 
					"</html>";				
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			System.out.println(sender+"+++"+receiver+"+++"+subject+"+++"+content);
			try {
				Properties properties = System.getProperties();
				properties.put("mail.smtp.starttls.enable", "true");
				properties.put("mail.smtp.host", "smtp.gmail.com");
				properties.put("mail.smtp.auth", "true");
				properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
				properties.put("mail.smtp.port", "587");
				Authenticator auth  = new GoogleAuthentication();
				Session s = Session.getDefaultInstance(properties,auth);
				Message message = new MimeMessage(s);
				Address sender_address = new InternetAddress(sender);
				Address receiver_address = new InternetAddress(receiver);
				message.setHeader("content-type", "text/html;charset=UTF-8");
				message.setFrom(sender_address);
				message.addRecipient(Message.RecipientType.TO, receiver_address);
				message.setSubject(subject);
				message.setContent(content,"text/html;charset=UTF-8");
				message.setSentDate(new java.util.Date());
				Transport.send(message);
				out.print("<h1>정상적으로 전송했습니다</h1>");
			}catch(Exception e)
			{
				out.println("smtp 서버가 잘못 설정 되었거나 서비스에 문제가 있습니다,");
				e.printStackTrace();
			}
			
		}

}
