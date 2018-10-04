package com.choju.fpro.service;

import java.util.*;

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
}
