package com.choju.fpro.controller;


import java.io.IOException;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
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
	public void AdminConsertSave(HttpServletRequest request, @RequestBody Map<String, Object> ConsertInfo)  throws IOException {
		System.out.println("저장실행중");
		List<Map<String,Object>> Hallinfo = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> LineList = new ArrayList<Map<String,Object>>();
		System.out.println("검사1"+ConsertInfo.get("ConsertName"));
		
		Hallinfo=(List<Map<String, Object>>) ConsertInfo.get("Hallinfo");
		System.out.println(Hallinfo.get(0).get("Hallname"));
		System.out.println(Hallinfo.size());
		for(int i=0;i<Hallinfo.size();i++) {
			LineList= new ArrayList<Map<String,Object>>();
			LineList=(List<Map<String, Object>>) Hallinfo.get(i).get("LineList");
			
		}
		
		
	}
	
}
