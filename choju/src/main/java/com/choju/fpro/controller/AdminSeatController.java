
package com.choju.fpro.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.choju.fpro.service.AdminSeatService;
import com.choju.fpro.service.LiveBoardService;
import com.choju.fpro.vo.*;


@Controller
public class AdminSeatController{
		private ModelAndView mv;
		@Autowired
		private AdminSeatService SeatService; 
		@RequestMapping(value = "/AdminAddSeat", method = RequestMethod.GET)
		public String AddSeatMain() {
			System.out.println("관리자모드-seat 추가하기  실행됨");
			
			return "AddSeat";
		}
		
		@RequestMapping(value="/ConsertOverlap", method = RequestMethod.POST)
		public void ConsertOverlap(HttpServletResponse response, @RequestBody String name,HttpSession session) throws IOException {
		      String ID=(String)session.getAttribute("session_Email");
			  SeatService.ConsertOverlap(ID,name, response);
		      	   }
		
		
		@RequestMapping(value="/LoadSeat",method=RequestMethod.POST)
		@ResponseBody
		public Map<String,Object> LoadConsert(@RequestBody String num,HttpSession session){
			System.out.println("LoadSeat실행됨");
			String ID=(String)session.getAttribute("session_Email");
			Map<String,Object> consert=SeatService.LoadConsert(ID,num);
			System.out.println("LoadTest"+consert);
			return consert;
		}
		
		@RequestMapping(value ="/AdminConsertSave",method = RequestMethod.POST)
		@ResponseBody
		public Map<String, Object> AdminConsertSave(HttpServletRequest request,HttpSession session, @RequestBody Map<String, Object> ConsertInfo)  throws IOException {
			System.out.println("저장실행중");
			ConsertInfo.put("ID",session.getAttribute("session_Email"));
			System.out.println(ConsertInfo);
			Map<String, Object> consert=SeatService.QuickSave(ConsertInfo);
			return consert;
		}
		@RequestMapping(value="/AdminConsertDelete",method=RequestMethod.POST)
		public void AdminConsertDelete(HttpServletResponse response,@RequestBody String num) throws IOException {
			System.out.println("삭제진행중+num");
			SeatService.DeleteConsert(num,response);
		}
		@RequestMapping(value ="/AdminConsertList",method = RequestMethod.POST)
		@ResponseBody
		public  List<Map<String,Object>> AdminConsertList(HttpServletRequest request,HttpSession session) throws IOException {
			System.out.println("리스트불러오기");
			String ID=(String) session.getAttribute("session_Email");
			List<Map<String,Object>> consert=SeatService.ConsertList(ID);
			System.out.println("AdminConsertList"+consert);
			return consert;
		}
		
		
		//합치기전 메인페이지 게시판에 들어갈것
		@RequestMapping(value="/AddseatMain",method=RequestMethod.GET)
		public ModelAndView AddseatMain() {
			mv=new ModelAndView();
			mv.setViewName("AddseatMain");
			return mv;
		}
		
		@RequestMapping(value="/ViewConsertSeat",method=RequestMethod.POST)
		public ModelAndView ViewConsertSeat(@RequestParam String num) {
			
			mv=new ModelAndView();
			mv=SeatService.InfoConsertSeat(num);
			return mv;
			
		}
		@RequestMapping(value="/ReserConsertSeat",method=RequestMethod.POST)
		public ModelAndView ReserConsertSeat(@RequestParam String num) {
			mv=new ModelAndView();
			return mv;
			
		}
		

}
