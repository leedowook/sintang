package com.choju.fpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choju.fpro.dao.LiveBoardDao;
import com.choju.fpro.vo.*;
@Service
public class LiveBoardService {
   @Autowired
   private LiveBoardDao LBoardDao;
   
   public ConsertBoardVO BoardConsertInfo(String l_num) {
      ConsertBoardVO ConsertBoardVO=new ConsertBoardVO();
      
      return ConsertBoardVO;
   }

   public BuskingBoardVO BoardBuskingInfo(String l_num) {
      BuskingBoardVO BuskingBoardVO=new BuskingBoardVO();
      
      
      return BuskingBoardVO;
   }
   
   

}