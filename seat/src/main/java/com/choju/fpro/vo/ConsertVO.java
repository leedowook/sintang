package com.choju.fpro.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConsertVO {
	private String C_num;
	private String C_name;
	private String address;
	private String ad_x;
	private String ad_y;
	private String C_kind;
	private String C_hall_count;
	private String C_hall_img;
	private List<LineVO> LineList;
	private List<HallVO> Hallinfo;
	public ConsertVO() {}
	public String getC_num() {
		return C_num;
	}
	public void setC_num(String c_num) {
		C_num = c_num;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAd_x() {
		return ad_x;
	}
	public void setAd_x(String ad_x) {
		this.ad_x = ad_x;
	}
	public String getAd_y() {
		return ad_y;
	}
	public void setAd_y(String ad_y) {
		this.ad_y = ad_y;
	}
	public String getC_kind() {
		return C_kind;
	}
	public void setC_kind(String c_kind) {
		C_kind = c_kind;
	}
	public String getC_hall_count() {
		return C_hall_count;
	}
	public void setC_hall_count(String c_hall_count) {
		C_hall_count = c_hall_count;
	}
	public String getC_hall_img() {
		return C_hall_img;
	}
	public void setC_hall_img(String c_hall_img) {
		C_hall_img = c_hall_img;
	}
	public List<LineVO> getLineList() {
		return LineList;
	}
	public void setLineList(List<LineVO> lineList) {
		LineList = lineList;
	}
	public List<HallVO> getHallinfo() {
		return Hallinfo;
	}
	public void setHallinfo(List<HallVO> hallinfo) {
		Hallinfo = hallinfo;
	}
	@Override
	public String toString() {
		return "ConsertVO [C_num=" + C_num + ", C_name=" + C_name + ", address=" + address + ", ad_x=" + ad_x
				+ ", ad_y=" + ad_y + ", C_kind=" + C_kind + ", C_hall_count=" + C_hall_count + ", C_hall_img="
				+ C_hall_img + ", LineList=" + LineList + ", Hallinfo=" + Hallinfo + "]";
	}
	
	public ConsertVO Matchscript(Map<String,Object> ConsertInfo) {// 해당 스크립트에서 받아온걸 자바꺼로 만들기위해
		List<LineVO> Line=new ArrayList<LineVO>();
		List<HallVO> Hall=new ArrayList<HallVO>();
		ConsertVO Consert=new ConsertVO();
		List<Map<String,Object>> Hallinfo = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> LineList = new ArrayList<Map<String,Object>>();
		Hallinfo=(List<Map<String, Object>>)ConsertInfo.get("Hallinfo");
		LineList=(List<Map<String, Object>>)ConsertInfo.get("LineList");
		for(int i=0;i<Hallinfo.size();i++) {
			HallVO HallVO=new HallVO();
			HallVO.setC_hall_name((String)Hallinfo.get(i).get("Hallname"));
			HallVO.setC_hall_loc_top((String)Hallinfo.get(i).get("HallTop"));
			HallVO.setC_hall_loc_left((String)Hallinfo.get(i).get("HallLeft"));
			Hall.add(HallVO);
		}
		for(int i=0;i<LineList.size();i++) {
			LineVO LineVO=new LineVO();
			LineVO.setC_hall_name((String)LineList.get(i).get("Hallname"));
			LineVO.setC_col_name((String)LineList.get(i).get("Linename"));
			LineVO.setC_row_count((String)LineList.get(i).get("Seatcount"));
			LineVO.setC_col_priority((String)LineList.get(i).get("order"));
			Line.add(LineVO);
		}
		Consert.setC_name((String)ConsertInfo.get("ConsertName"));
		Consert.setC_hall_count((String)ConsertInfo.get("HallCount"));
		Consert.setHallinfo(Hall);
		Consert.setLineList(Line);
		return Consert;
	}
	public ConsertVO(String c_num, String c_name, String address, String ad_x, String ad_y, String c_kind,
			String c_hall_count, String c_hall_img, List<LineVO> lineList, List<HallVO> hallinfo) {
		C_num = c_num;
		C_name = c_name;
		this.address = address;
		this.ad_x = ad_x;
		this.ad_y = ad_y;
		C_kind = c_kind;
		C_hall_count = c_hall_count;
		C_hall_img = c_hall_img;
		LineList = lineList;
		Hallinfo = hallinfo;
	}
	
	

	
}
