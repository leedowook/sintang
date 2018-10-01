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
	
	public void QuickSave(Map<String, Object> ConsertInfo) {
		consert=new ConsertVO();
		consert=consert.Matchscript(ConsertInfo);
		
		SeatDao.QuickSave(consert);
	}
}
