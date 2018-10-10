package com.choju.fpro.service;

import java.io.IOException;
import java.util.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.choju.fpro.dao.AdminSeatDao;
import com.choju.fpro.vo.ConsertVO;

@Service
public class AdminSeatService {
	@Autowired
	private AdminSeatDao SeatDao;
	private ModelAndView mav;
	private ConsertVO consert;
	
	@Autowired
	private HttpSession session;
	
	public void DeleteConsert(String C_num,HttpServletResponse response) throws IOException {
		SeatDao.DeleteConsert(C_num,response);
	}
	public List<Map<String,Object>> ConsertList(String ID){
		ConsertVO ConsertVO=new ConsertVO();
		List<ConsertVO> consert=SeatDao.SelectConsertList(ID);
		List<Map<String,Object>> ConsertList=new ArrayList<Map<String,Object>>(); 
		Map<String,Object> consertinfo;
		for(int i=0;i<consert.size();i++) {
			consertinfo=new HashMap<String,Object>();
			consertinfo.put("Consertnum",consert.get(i).getC_num());
			consertinfo.put("name", consert.get(i).getC_name());
			ConsertList.add(consertinfo);
		}
		System.out.println("SeatService"+ConsertList);
		return ConsertList;
	}
	public Map<String, Object> QuickSave(Map<String, Object> ConsertInfo) {
		consert=new ConsertVO();
		consert=consert.Matchscript(ConsertInfo);
		System.out.println("서비스 업데이트 테스트"+consert.getC_num());
		if(consert.getC_num()==null) {
		SeatDao.QuickSave(consert);}
		else {
			SeatDao.QuickUpdate(consert);
		}
		Map<String,Object> consertscript=new HashMap<String,Object>();
		consertscript=consert.Matchjava(consert);
		System.out.println("testAdminSeatService"+consertscript.size());
		
		return consertscript;
	}
	public Map<String, Object> LoadConsert(String ID, String num) {
		ConsertVO consert=SeatDao.SelectConsert(ID,num);
		Map<String, Object> ConsertInfo=consert.Matchjava(consert);
		return ConsertInfo;
	}
	public void ConsertOverlap(String ID, String name, HttpServletResponse response) throws IOException {
		SeatDao.ConsertOverlap(ID,name, response);	
	}
	
	public ModelAndView InfoConsertSeat(String num) {
		mav=new ModelAndView();
		ConsertVO consertInfo=SeatDao.SelectConsertInfo(num);
		mav.addObject("ConsertSeat",consertInfo);
		mav.addObject("HallInfo",consertInfo.getHallinfo());
		mav.addObject("LineList",consertInfo.getLineList());

		mav.setViewName("ViewConsertSeat");
		return mav;
	}
}
