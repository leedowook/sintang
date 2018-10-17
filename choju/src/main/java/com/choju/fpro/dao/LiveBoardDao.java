package com.choju.fpro.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.*;

@Repository
public class LiveBoardDao {
   @Autowired
   private SqlSessionTemplate sqlSession;
   public String SelectLnum(String L_num) {
	   return sqlSession.selectOne("ConsertBoardLive.Liveboardlid",L_num);
   }
   public ConsertBoardVO InfoConsertBoard() {
      return sqlSession.selectOne("LiveBoardVO");
   }
   public BuskingBoardVO InfoBuskingBoard() {
      BuskingBoardVO BuskingBoardVO=new BuskingBoardVO();
      return sqlSession.selectOne("LiveBoardVO");
   }
   public void InsertBuskingBoard(BuskingBoardVO BusVO) {
	   sqlSession.insert("ConsertBoardLive.Buskingboardwirte",BusVO);
   }
   public void ConsertBoard(ConsertBoardVO ConVO) {
	   sqlSession.insert("ConsertBoardLive.Consertboardwrite",ConVO);
   }
}