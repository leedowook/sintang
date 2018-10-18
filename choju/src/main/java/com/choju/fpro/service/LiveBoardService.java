package com.choju.fpro.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.choju.fpro.dao.LiveBoardDao;
import com.choju.fpro.vo.*;

@Service
public class LiveBoardService {
	@Autowired
	private LiveBoardDao LBoardDao;
	private ModelAndView mav;

	public ModelAndView LiveBoardList(PageMaker page) {
		mav = new ModelAndView();
		page.setBoardcount(8);
		page.setCount(LBoardDao.getCount());
		HashMap map = new HashMap();
		map.put("start", page.getBoardstartnum());
		map.put("end", page.getBoardendnum());
		List<LiveBoardVO> Live = LiveList();
		List<ConsertBoardVO> Consert = ConsertList();
		List<BuskingBoardVO> Busking = BuskingList();
		mav.addObject("LiveList", Live);
		mav.addObject("BuskingList", Busking);
		mav.addObject("ConsertList", Consert);
		mav.addObject("Pagemaker",page);
		mav.setViewName("ConsertView");
		return mav;
	}

	public void BoardBuskingInput(BuskingBoardVO BusVO) {
		BusVO.setL_num(LBoardDao.SelectLnum());
		LBoardDao.InsertBuskingBoard(BusVO);
	}

	public void BoardConsertInput(ConsertBoardVO ConVO) {
		ConVO.setL_num(LBoardDao.SelectLnum());
		LBoardDao.InsertConsertBoard(ConVO);
	}

	public List<LiveBoardVO> LiveList() {
		List<LiveBoardVO> Live = LBoardDao.SelectLiveBoardList();

		return Live;
	}

	public List<ConsertBoardVO> ConsertList() {
		List<ConsertBoardVO> Consert = LBoardDao.selectConBoardList();
		return Consert;
	}

	public List<BuskingBoardVO> BuskingList() {
		List<BuskingBoardVO> Busking = LBoardDao.selectBusBoardList();
		return Busking;

	}

	public ConsertBoardVO BoardConsertInfo(String l_num) {
		ConsertBoardVO ConsertBoardVO = new ConsertBoardVO();
		ConsertBoardVO = LBoardDao.InfoConsertBoard();
		return ConsertBoardVO;
	}

	public BuskingBoardVO BoardBuskingInfo(String l_num) {
		BuskingBoardVO BuskingBoardVO = new BuskingBoardVO();
		BuskingBoardVO = LBoardDao.InfoBuskingBoard();
		return BuskingBoardVO;
	}

}