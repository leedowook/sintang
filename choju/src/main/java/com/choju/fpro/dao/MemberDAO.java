package com.choju.fpro.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.MemberVO;
import com.choju.fpro.vo.alertMember;
import com.choju.fpro.vo.emailVO;


@Repository
public class MemberDAO {
	
	private HttpSession session;

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	 //회원가입
	   public int memberJoin(MemberVO memberVO) {
	      return sqlSession.insert("Member.memberJoin", memberVO);
	   }

	   //아이디 중복 체크
	   public MemberVO idOverlap(String email) {
	      return sqlSession.selectOne("Member.idOverlap", email);
	   }

	   //로그인 처리 
	   public MemberVO memberLogin(MemberVO memberVO) {
	      return sqlSession.selectOne("Member.memberLogin", memberVO);
	   }

	   //회원 목록 
	   public List<MemberVO> memberList() {
	      return sqlSession.selectList("Member.memberList");
	   }
	   
	   
	   public MemberVO memberView(String email) {
	      return sqlSession.selectOne("Member.memberView", email);
	   }

	   //회원삭제
	   public void  memberDelete(String email) {
	      sqlSession.delete("Member.memberDelete", email);
	   }
	   //회원 정보 수정
	   public void alertmember(alertMember alertmember)
	   {
	      sqlSession.update("Member.alertmember",alertmember);
	   }
	   //이메일 인증 처리
	   public void emailCheckin(emailVO emailvo)
	   {
	      sqlSession.selectOne("Member.emailCheckin",emailvo);
	   }
	   
	   //닉네임 중복확인
	   public void nickNameCheckin(String Nickname) {
	      sqlSession.selectOne("Member.nickNameCheckin",Nickname );
	   }

	
}
