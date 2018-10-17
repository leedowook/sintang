package com.choju.fpro.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.inject.Inject;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.choju.fpro.dao.MemberDAO;
import com.choju.fpro.util.Mailservlet;
import com.choju.fpro.vo.MemberVO;
import com.choju.fpro.vo.emailVO;
import com.choju.fpro.vo.alertMember;

@Service
public class MemberService {

	@Autowired // 바로 밑 한줄에만 적용
	private MemberDAO memberDAO;

	private ModelAndView mav;

	private MemberVO memberVO;

	@Autowired
	private HttpSession session;

	@Inject
	private JavaMailSender mailSender;
	
	 // 회원가입 메소드
	   public ModelAndView memberJoin(MemberVO memberVO, HttpServletResponse response, HttpServletRequest request)
	         throws IOException, NoSuchAlgorithmException {
	      mav = new ModelAndView();
	      int result = memberDAO.memberJoin(memberVO);
	      Mailservlet mail = new Mailservlet();
	      System.out.println("!!!!!!!!!!!SERVICEmemberVO" + memberVO.toString());
	      mail.setdmail(memberVO, response, request);
	      if (result == 0) {
	         // 회원가입 실패하면 다시 joinForm으로
	         mav.setViewName("joinForm");
	      } else {
	         // 회원가입 성공하면 loginForm으로 이동
	         mav.setViewName("Login");
	      }
	      return mav;
	   }

	   // 이메일 인증 완료
	   public void Checkin(emailVO emailvo) {
	      memberDAO.emailCheckin(emailvo);
	   }

	   // id 중복 체크
	   public void idOverlap(String email, HttpServletResponse response) throws IOException {
	      memberVO = new MemberVO();
	      memberVO = memberDAO.idOverlap(email);
	      if (memberVO == null) {
	         response.getWriter().print("1");
	      } else {
	         response.getWriter().print("0");
	      }
	   }

	   // 닉네임 중복확인
	   public void nickNameCheckin(String Nickname) {
	      memberDAO.nickNameCheckin(Nickname);
	      System.out.println("서비스 닉네임++++++++++++++++++++++++++++++++++++++++++++++++++++++" + Nickname);
	   }

	   // 로그인처리 메소드
	   public ModelAndView memberLogin(MemberVO memberVO, HttpServletResponse response) throws IOException {
	      response.setContentType("text/html;charset=UTF-8");
	      mav = new ModelAndView();
	      PrintWriter out = response.getWriter();
	      System.out.println("사용자 입력 ID" + memberVO.getEmail());
	      System.out.println("사용자 입력 비번 : " + memberVO.getPassword());
	      MemberVO loginMember = memberDAO.memberLogin(memberVO); // DB에서 회원정보 가져오기
	      System.out.println("서비스!!!DB" + loginMember);
	      System.out.println("사용자 입력 비번 : " + memberVO.getPassword());
	      System.out.println("사용자 인증 확인 : " + loginMember.getCheked());
	      System.out.println("사용자 닉네임 확인 : " + loginMember.getNickname());
	      

	      // spring-security를 활용한 비밀번호 확인
	      /*
	       * if (passEncoder.matches(memberVO.getPassword(), loginMember.getPassword()) &&
	       * memberVO.getId().equals(loginMember.getId())) { // true, false로 날아옴
	       * session.setAttribute("session_id", memberVO.getId());
	       * mav.addObject("loginMember", loginMember); // 모델담기 mav.setViewName("main");
	       * // 뷰담기
	       * 
	       */
	     
	      if (loginMember.getEmail().equals(memberVO.getEmail())
	            && loginMember.getPassword().equals(memberVO.getPassword()) && loginMember.getCheked() == 1) {
	         session.setAttribute("session_Email", memberVO.getEmail());
	         session.setAttribute("session_Nickname", loginMember.getNickname());
	         System.out.println("멤버컨트롤에서의 loginMember.getNickname은? " + loginMember.getNickname());
	         mav.addObject("loginMember", loginMember); // 모델담기
	         mav.setViewName("home"); // 뷰담기
	      } else if (loginMember.getEmail().equals(memberVO.getEmail())
	            && loginMember.getPassword().equals(memberVO.getPassword()) && loginMember.getCheked() == 2) {
	         out.println("<script>");
	         out.println("alert('인증 완료를 해주세요.');");
	         out.println("history.go(-1);");
	         out.println("</script>");
	         out.close();
	         mav.setViewName("loginForm");
	      } else { // 로그인 실패
	         out.println("<script>");
	         out.println("alert('비밀번호가 틀립니다.');");
	         out.println("history.go(-1);");
	         out.println("</script>");
	         out.close();
	         mav.setViewName("loginForm"); // loginForm으로 이동
	      }
	      return mav;
	   }

	   // 회원 리스트
	   public ModelAndView memberList() {
	      mav = new ModelAndView();
	      List<MemberVO> memberList = memberDAO.memberList();
	      mav.addObject("memberList", memberList);
	      mav.setViewName("memberList"); // 목적지 설정
	      return mav;
	   }

	   // 회원정보보기
	   public ModelAndView memberView(String email) {
	      mav = new ModelAndView();
	      MemberVO viewMember = memberDAO.memberView(email);
	      System.out.println("viewMember+++++++++++++++++++++++++++" + viewMember);
	      mav.addObject("viewMember", viewMember); // 담고
	      mav.setViewName("memberView"); // 목적지로 전달
	      return mav;
	   }

	   // 회원 정보 수정
	   public ModelAndView alertMemberView(String email) {
	      mav = new ModelAndView();
	      MemberVO viewMember = memberDAO.memberView(email);
	      System.out.println("viewMember+++++++++++++++++++++++++++" + viewMember);
	      mav.addObject("viewMember", viewMember); // 담고
	      mav.setViewName("alertMemberView"); // 목적지로 전달
	      return mav;
	   }

	   // 회원삭제
	   public void memberDelete(String email) {
	      memberDAO.memberDelete(email);
	   }

	   // 이메일 보내기
	   // Interface
	   public interface MailService {
	      public boolean send(String subject, String text, String from, String to);
	   }

	   @Service
	   public class MailServiceImpl implements MailService {
	      // org.springframework.mail.javamail.JavaMailSender
	      private JavaMailSender javaMailSender;

	      public void setJavaMailSender(JavaMailSender javaMailSender) {
	         this.javaMailSender = javaMailSender;
	      }

	      @Override
	      public boolean send(String subject, String text, String from, String to) {
	         // javax.mail.internet.MimeMessage
	         MimeMessage message = javaMailSender.createMimeMessage();

	         try {
	            // org.springframework.mail.javamail.MimeMessageHelper
	            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
	            helper.setSubject(subject);
	            helper.setText(text, true);
	            helper.setFrom(from);
	            helper.setTo(to);
	            javaMailSender.send(message);
	            return true;
	         } catch (MessagingException e) {
	            e.printStackTrace();
	         }
	         return false;
	      }
	   }

	   public void alertMember(alertMember alertmember) {
	      System.out.println("서비스 alertmember" + alertmember.toString());
	      memberDAO.alertmember(alertmember);
	   }


}
