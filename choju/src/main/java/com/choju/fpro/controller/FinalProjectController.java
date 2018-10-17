package com.choju.fpro.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.choju.fpro.vo.BoardVO;
import com.choju.fpro.vo.BuskingBoardVO;
import com.choju.fpro.vo.CommentVO;
import com.choju.fpro.vo.ConsertBoardVO;
import com.choju.fpro.vo.LiveBoardVO;
import com.choju.fpro.dao.BoardDAO;
import com.choju.fpro.recapcha.VerifyRecaptcha;
import com.choju.fpro.service.BoardService;
import com.choju.fpro.service.LiveBoardService;
import com.choju.fpro.service.MemberService;
import com.choju.fpro.util.SHA256;
import com.choju.fpro.vo.MemberVO;
import com.choju.fpro.vo.PageMaker;
import com.choju.fpro.vo.alertMember;
import com.choju.fpro.vo.emailVO;
import com.choju.fpro.controller.MailHandler;

@Controller
public class FinalProjectController {
	private static final Logger logger = LoggerFactory.getLogger(FinalProjectController.class);
	@Autowired
	private BoardService bs;

	private ModelAndView mav;

	// --memberController 베타테스트.-------
	@Autowired
	private MemberService ms;
	@Autowired
	private HttpSession session;
	@Autowired
	private HttpServletRequest request;
	@Inject
	private JavaMailSender mailSender;

	// ------------------여기까지---------

	// 프로젝트 시작했을때 페이지 지정
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	// ------------------ Consert & Busking ---------------------------
	@RequestMapping(value = "/ConsertView", method = RequestMethod.GET)
	public String Cview() {
		return "ConsertView";
	};

	@RequestMapping(value = "/buy", method = RequestMethod.GET)
	public String buy(/* @RequestParam("id") String id */) {
		/*
		 * mav = new ModelAndView(); mav = ms.BuyServise("id");
		 */
		return "buy";
	}

	// ------------------ Consert & Busking ---------------------------

	// -------------------FreeboardForm -------------------------------

	// freeboard 메뉴 눌렸을때 나오는 화면(글목록)
	/*
	 * @RequestMapping(value = "/freeboardForm", method = RequestMethod.GET) public
	 * ModelAndView boardList() { mav = new ModelAndView(); mav =
	 * bs.freeboardForm(); return mav; }
	 */

	// 글 목록 페이징 처리
	@RequestMapping(value = "/freeboardForm", method = RequestMethod.GET) // /list
	public ModelAndView boardList(PageMaker pagemaker, Model model) {
		logger.info("START LIST");

		mav = new ModelAndView();
		mav = bs.freeboardForm();

		int count = 0;
		pagemaker.setPage(pagemaker.getPage());// 처음 결과 1 아무것도 없는 상태
		count = bs.count(count);// 게시글 전체 개수를 가져옴
		System.out.println("count의 값 : " + count);
		// 레코드 총 갯수 구함
		pagemaker.setCount(count);// 해당 페이지메이커에개수를 입력해줌
		System.out.println("count의 값 : " + count);
		// 페이지 계산
		System.out.println("컨트롤 " + pagemaker.getPage());
		System.out.println("페이지 메이커 VO start" + pagemaker.getStart());
		System.out.println("페이지 메이커 VO end" + pagemaker.getEnd());
		List<BoardVO> list = bs.getRead(pagemaker);
		System.out.println("list.size의 값은? " + list.size());
		model.addAttribute("result", list);
		model.addAttribute("pageMaker", pagemaker);

		return mav;
	}

	// 글쓰기 화면 호출
	@RequestMapping(value = "/boardwriteForm", method = RequestMethod.GET)
	public String boardwriteForm(HttpServletResponse response) throws IOException {

		if (session.getAttribute("session_Email") == null) {

			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();

			out.println("<script>");
			out.println("alert('로그인을 해주시길 바랍니다.');");
			out.println("history.back()");
			out.println("</script>");
			out.close();
		}
		return "boardWrite";
	}

	// 글쓰기
	@RequestMapping(value = "/boardwrite", method = RequestMethod.POST)
	public ModelAndView boardWrite(@ModelAttribute BoardVO boardVO, HttpServletResponse response)
			throws IllegalStateException, IOException {
		mav = new ModelAndView();

		String Board_Nickname = (String) session.getAttribute("session_Nickname");
		System.out.println("파이널컨트롤에서의 글쓰기단에서의 session_Nickname 은 ? " + session.getAttribute("session_Nickname"));
		boardVO.setBoard_Nickname(Board_Nickname);

		MultipartFile Board_File = boardVO.getBoard_File(); // 파일처리
		if (!Board_File.isEmpty()) {
			String fileName = Board_File.getOriginalFilename();
			Board_File.transferTo(new File(
					"C:\\Users\\user\\Documents\\workspace-sts-3.9.5.RELEASE\\choju\\src\\main\\webapp\\WEB-INF\\Fileupload\\"
							+ fileName));
		}
		boardVO.setBoard_FileName(Board_File.getOriginalFilename());
		mav = bs.boardWrite(boardVO, response);
		return mav;
	}

	// 글상세보기
	@RequestMapping(value = "/boardview", method = RequestMethod.GET)
	public ModelAndView boardView(@RequestParam("board_Num") int board_Num) {
		// 조회수 증가 처리
		bs.increaseHit(board_Num);
		mav = new ModelAndView();
		mav = bs.boardView(board_Num);

		return mav;
	}

	// 글수정하기
	@RequestMapping(value = "/boardmodify", method = RequestMethod.GET)
	public ModelAndView boardModify(@RequestParam("board_Num") int board_Num) {
		mav = new ModelAndView();
		mav = bs.boardView(board_Num);
		mav.setViewName("boardModify");
		return mav;
	}

	// 글수정업데이트
	@RequestMapping(value = "/boardmodify1", method = RequestMethod.POST)
	public String boardModify1(@ModelAttribute BoardVO boardVO) throws IllegalStateException, IOException {
		// 글 수정 시 파일 수정 업데이트
		MultipartFile Board_File = boardVO.getBoard_File(); // 파일처리
		if (!Board_File.isEmpty()) {
			String fileName = Board_File.getOriginalFilename();
			Board_File.transferTo(new File(
					"C:\\Users\\user\\Documents\\workspace-sts-3.9.5.RELEASE\\choju\\src\\main\\webapp\\WEB-INF\\Fileupload\\"
							+ fileName));
		}
		boardVO.setBoard_FileName(Board_File.getOriginalFilename());
		bs.boardModify1(boardVO);
		return "redirect:/freeboardForm";
	}

	// 첨부파일 다운로드
	@RequestMapping(value = "/boardFileDown", method = RequestMethod.GET)
	public void fileDown(@RequestParam("board_FileName") String board_FileName, HttpServletResponse response)
			throws Exception {
		// 무조건 팝업창 뜨게 하는!
		response.setContentType("application/octet-stream");
		String Orgname = new String(board_FileName.getBytes("UTF-8"), "iso-8859-1");
		// 파일명 지정(스펠링 중요)
		response.setHeader("Content-Disposition", "attachment;filename=\"" + Orgname + "\"");
		OutputStream os = response.getOutputStream();
		String path = "C:\\Users\\user\\Documents\\workspace-sts-3.9.5.RELEASE\\choju\\src\\main\\webapp\\WEB-INF\\Fileupload\\";
		FileInputStream fis = new FileInputStream(path + File.separator + board_FileName);
		int n = 0;
		byte[] b = new byte[512];
		while ((n = fis.read(b)) != -1) {
			os.write(b, 0, n);
		}
		fis.close();
		os.close();
	}

	// 글삭제하기
	@RequestMapping(value = "/boarddelete", method = RequestMethod.GET)
	public String boardDelete(@RequestParam("board_Num") int board_Num, BoardVO boardVO, HttpServletResponse response)
			throws IOException {

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		bs.boardDelete(board_Num);
		return "redirect:/freeboardForm";
	}

	// 댓글 달기
	@RequestMapping(value = "/boardreply", method = RequestMethod.POST)
	public ModelAndView boardreply(@ModelAttribute CommentVO commentVO, @RequestParam("Board_Num") int Board_Num)
			throws IOException {
		mav = new ModelAndView();

		String Comment_Nickname = (String) session.getAttribute("session_Nickname");
		System.out.println("파이널컨트롤에서의 session_Nickname 은 ? " + session.getAttribute("session_Nickname"));
		commentVO.setComment_Nickname(Comment_Nickname);

		commentVO.setBoard_Num(Board_Num);
		System.out.println("파이널컨트롤에서의 Board_Num 은 ? " + commentVO.getBoard_Num());

		bs.boardreply(commentVO);
		mav = bs.boardView(Board_Num);
		return mav;
	}

	// 좋아요?싫어요!
	@RequestMapping(value = "/ReplyLike", method = RequestMethod.GET)
	public ModelAndView ReplyLike(@RequestParam("Comment_Num") int Comment_Num,
			@RequestParam("board_Num") int board_Num, HttpServletResponse response) throws IOException {
		mav = new ModelAndView();
		mav = bs.ReplyLike(Comment_Num, response, board_Num);

		return mav;
	}

	// -------------------FreeboardForm -------------------------------

	// ----------------------Member 베타테스트 --------------------------------
	// 회원가입 처리
	@RequestMapping(value = "/memberjoin", method = RequestMethod.POST)
	public ModelAndView memberJoin(@ModelAttribute MemberVO memberVO, HttpServletResponse response,
			HttpServletRequest request) throws IOException, NoSuchAlgorithmException {
		mav = new ModelAndView();
		SHA256 sha256 = new SHA256();
		memberVO.setSha256(sha256.getSHA256(memberVO.getEmail()));
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!MemberVO" + memberVO.toString());
		if (memberVO.getEmail() == "Admin") {
			memberVO.setCheked(1);
			mav = ms.memberJoin(memberVO, response, request);
			mav.setViewName("Admin");
		} else {
			memberVO.setCheked(2);
			mav = ms.memberJoin(memberVO, response, request);
		}
		return mav;
	}

	// 아이디 중복확인
	@RequestMapping(value = "idOverlap", method = RequestMethod.POST)
	public void idOverlap(HttpServletResponse response, @RequestParam("email") String email) throws IOException {
		ms.idOverlap(email, response);
	}

	// 로그인 페이지로 이동
	@RequestMapping(value = "/Login", method = RequestMethod.GET)
	public String Login() {
		return "Login";
	}

	// 회원가입 페이지로 이동
	@RequestMapping(value = "/Join", method = RequestMethod.GET)
	public String Join() {
		return "Join";
	}

	// 로그인 처리
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView memberlogin(@ModelAttribute MemberVO memberVO, HttpServletResponse response)
			throws IOException {
		// recaptcha 값 (자동입력방지)
		response.setContentType("text/html;charset=UTF-8");
		String gRecaptchaResponse = request.getParameter("g-recaptcha-response");
		System.out.println("::Captcha" + gRecaptchaResponse);
		boolean verify = VerifyRecaptcha.verify(gRecaptchaResponse);

		// user ID 및 비밀번호
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// 로그인 처리
		System.out.println("email=" + email + "::password=" + password + "::Captcha Verify" + verify);
		memberVO.setEmail(email);
		memberVO.setPassword(password);
		if (verify == false) {
			PrintWriter out = response.getWriter();
			out.println("<script>");
			out.println("alert('자동가입 입력 방지 오류.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			mav.setViewName("loginForm");
		} else {
			if (email == "Admin") {
				mav = new ModelAndView();
				mav = ms.memberLogin(memberVO, response);
			}
			mav = new ModelAndView();
			mav = ms.memberLogin(memberVO, response);
		}
		return mav;
	}

	// 로그아웃 처리
	@RequestMapping(value = "/logout", method = RequestMethod.GET) // 링크방식은 GET
	public String memberLogout() {
		session.invalidate();
		return "Login";
	}

	// 회원목록보기
	@RequestMapping(value = "/memberList", method = RequestMethod.GET)
	public ModelAndView memberList(HttpSession session) {
		mav = new ModelAndView();
		mav = ms.memberList();
		return mav;
	}

	// 회원 정보 보기
	@RequestMapping(value = "/memberView", method = RequestMethod.GET)
	public ModelAndView memberView(@RequestParam("email") String email) {
		System.out.println("email+++++++++++++++++++" + email);
		mav = new ModelAndView();
		mav = ms.memberView(email);
		return mav;
	}

	// 회원삭제하기
	@ResponseBody
	@RequestMapping(value = "/memberDelete", method = RequestMethod.GET)
	public void memberDelete(@RequestParam("email") String email) {
		ms.memberDelete(email);
	}

	// 관리자 페이지로 이동
	@RequestMapping(value = "/Admin", method = RequestMethod.GET)
	public String Admnin() {
		return "Admin";
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about() {
		return "about";
	}

	// 차트 페이지로 이동
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public String charts() {
		return "charts";
	}

	// 전체 게시판으로 이동
	@RequestMapping(value = "/allboard", method = RequestMethod.GET)
	public ModelAndView allboard() {
		mav = new ModelAndView();
		mav = bs.Allboard();

		return mav;
	}

	// 메일 체크 페이지
	@RequestMapping(value = "/mailcheck", method = RequestMethod.GET)
	public String mailcheck() {
		return "mailcheck";
	}

	// 회원 수정 페이지
	@RequestMapping(value = "/alertMemberView", method = RequestMethod.GET)
	public ModelAndView alertMemberView(@RequestParam("email") String email) {
		System.out.println("email+++++++++++++++++++" + email);
		mav = new ModelAndView();
		mav = ms.alertMemberView(email);
		return mav;
	}

	// 이메일 인증 완료
	@RequestMapping(value = "/cheked", method = RequestMethod.POST)
	public String cheked(@ModelAttribute emailVO emailvo, HttpServletResponse response, HttpServletRequest request)
			throws IOException {
		emailvo.setEmail(request.getParameter("email"));
		emailvo.setSha256(request.getParameter("sha256"));
		System.out.println("!!!!!! 컨트롤  emailVO" + emailvo.toString());
		ms.Checkin(emailvo);
		return "Login";
	}

	// 닉네임 중복 인증 완료
	@RequestMapping(value = "/nickNameOverlap", method = RequestMethod.POST)
	public String nickNameOverlap(@ModelAttribute MemberVO memberVO, HttpServletResponse response,
			HttpServletRequest request) throws IOException {
		String Nickname = request.getParameter("nickname");
		ms.nickNameCheckin(Nickname);
		System.out.println("Nickname컨트롤 +++++++++++++++++++++++++++++++++" + Nickname);
		return "Login";
	}

	// 회원정보 수정하기
	@ResponseBody
	@RequestMapping(value = "/memberalert", method = RequestMethod.POST)
	public void memberalert(@ModelAttribute alertMember alertmember, HttpServletResponse response,
			HttpServletRequest request) throws IOException {
		alertmember.setEmail(request.getParameter("email"));
		alertmember.setAge(request.getParameter("age"));
		alertmember.setPassword(request.getParameter("password"));
		alertmember.setCheked(Integer.parseInt(request.getParameter("cheked")));
		System.out.println("컨트롤 alertMember" + alertmember.toString());
		ms.alertMember(alertmember);
	}

	@RequestMapping(value = "/ConsertBoardLoad", method = RequestMethod.POST)
	public ModelAndView ConsertBoardLoad(@ModelAttribute LiveBoardVO BoardVO, HttpServletResponse response)throws IOException {// 게시글을 불러올때
		mav = new ModelAndView();
		BuskingBoardVO BusVO;
		ConsertBoardVO ConVO;
		LiveBoardService SBService = new LiveBoardService();
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (BoardVO.getL_kind().equals("Con")) {// 콘서트로 안내
			ConVO = new ConsertBoardVO();
			ConVO = SBService.BoardConsertInfo(BoardVO.getL_num());
			mav.addObject("Board", ConVO);
			mav.setViewName("ConsertBoardInfo");
		} else if (BoardVO.getL_kind().equals("Bus")) {// 버스킹으로 안내
			BusVO = new BuskingBoardVO();
			BusVO = SBService.BoardBuskingInfo(BoardVO.getL_num());
			mav.addObject("Board", BusVO);
			mav.setViewName("BuskingBoardInfo");
		} else {
			out.println("<script>alert('이상한값이다 검새해라'); history.back();</script>");
		}
		return mav;

	}

	// ----------------------------여기까지----------------------
}
