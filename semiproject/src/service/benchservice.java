package service;

import static db.jdbc.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import been.*;
import dao.benchdao;

public class benchservice{
	
	public em_cho_gamespec benchsgame(int g_num,int spec){
		System.out.println("사양가져오는 서비스접속");
		benchdao dao =benchdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		
		em_cho_gamespec ecgs=new em_cho_gamespec();
		ecgs=dao.gamespec(g_num,spec);
		System.out.println("진행완료");
		return ecgs;
	}
	public em_cpu benchgamecpu(em_cho_gamespec ecgs) {
		//해당 사양에 대한 그래픽 담을곳 
		benchdao dao =benchdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		em_cpu cpu=dao.cpuspec(ecgs);
		
		
		return cpu;
	}
	public em_ram benchgameram(em_cho_gamespec ecgs) {
		//해당 사양에 대한 그래픽 담을곳 
		benchdao dao =benchdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		em_ram ram=dao.ramspec(ecgs);
		
		
		return ram;
	}
	public em_mainboard benchgamemb(em_cho_gamespec ecgs) {
		//해당 사양에 대한 그래픽 담을곳 
		benchdao dao =benchdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		em_mainboard mb=dao.mbspec(ecgs);
		
		
		return mb;
	}
	
	public em_ssd benchgamessd(em_cho_gamespec ecgs) {
		//해당 사양에 대한 그래픽 담을곳 
		benchdao dao =benchdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		em_ssd ssd=dao.ssdspec(ecgs);
		
		
		return ssd;
	}
	public em_vga benchgamevga(em_cho_gamespec ecgs) {
		//해당 사양에 대한 그래픽 담을곳 
		benchdao dao =benchdao.getInstance();
		Connection con=getConnection();
		dao.setConnection(con);
		em_vga vga=dao.vgaspec(ecgs);
		
		
		return vga;
	}
	
	
	
}
