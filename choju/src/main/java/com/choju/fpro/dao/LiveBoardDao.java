package com.choju.fpro.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choju.fpro.vo.*;

@Repository
public class LiveBoardDao {
   @Autowired
   private SqlSessionTemplate sqlSession;
   public ConsertBoardVO InfoConsertBoard() {
      return sqlSession.selectOne("LiveBoardVO");
   }
   public BuskingBoardVO InfoBuskingBoard() {
      BuskingBoardVO BuskingBoardVO=new BuskingBoardVO();
      return sqlSession.selectOne("LiveBoardVO");
   }
   
}