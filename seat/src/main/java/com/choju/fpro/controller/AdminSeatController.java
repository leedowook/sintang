package com.choju.fpro.controller;


import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.choju.fpro.service.AdminSeatService;

@Controller
public class AdminSeatController{
	private ModelAndView mv;
	@Autowired
	private AdminSeatService SeatService; 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String AddSeatHome() {
		System.out.println("관리자모드-seat 추가하기  실행됨");
		return "AddSeat";
	}
	@RequestMapping(value ="/AdminConsertSave",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> AdminConsertSave(HttpServletRequest request,HttpSession session, @RequestBody Map<String, Object> ConsertInfo)  throws IOException {
		System.out.println("저장실행중");
		ConsertInfo.put("ID",session.getAttribute("ID"));
		
		Map<String, Object> consert=SeatService.QuickSave(ConsertInfo);
		return consert;
	}
}

