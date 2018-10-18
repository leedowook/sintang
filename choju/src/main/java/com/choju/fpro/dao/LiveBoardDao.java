package com.choju.fpro.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.*;

@Repository
public class LiveBoardDao {
   @Autowired
   private SqlSessionTemplate sqlSession;
   public int getCount(){
      return sqlSession.selectOne("ConsertBoardLive.getListCount");
   }
   
   public List<BuskingBoardVO> selectBusBoardList() {
      
      
      return sqlSession.selectList("ConsertBoardLive.BuskingboardList");
   }

   public List<ConsertBoardVO> selectConBoardList() {
      return sqlSession.selectList("ConsertBoardLive.ConsertboardList");
   }

   public List<LiveBoardVO> SelectLiveBoardList() {

      return sqlSession.selectList("ConsetrtBoardLive.Liveboardlist");
   }

   public String SelectLnum() {
      return sqlSession.selectOne("ConsertBoardLive.Liveboardlid");
   }

   public ConsertBoardVO InfoConsertBoard() {
      return sqlSession.selectOne("ConsertBoardLive.LiveBoardVO");
   }

   public BuskingBoardVO InfoBuskingBoard() {
      return sqlSession.selectOne("ConsertBoardLive.LiveBoardVO");
   }

   public void InsertBuskingBoard(BuskingBoardVO BusVO) {
      sqlSession.insert("ConsertBoardLive.Buskingboardwirte", BusVO);
   }

   public void InsertConsertBoard(ConsertBoardVO ConVO) {
      sqlSession.insert("ConsertBoardLive.Consertboardwrite", ConVO);
   }
}