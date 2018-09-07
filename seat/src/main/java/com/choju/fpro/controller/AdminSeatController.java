package com.choju.fpro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
}
