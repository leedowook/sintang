package com.choju.fpro.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsertVO {
	private String C_num;
	private String C_name;
	private String address="noaddress";
	private double ad_x=0;
	private double ad_y=0;
	private String C_kind="all";
	private double C_hall_count;
	private String C_hall_img="noimg";
	private List<LineVO> LineList;
	private List<HallVO> Hallinfo;
	private String ID;
	private double entry_x=0;
	private double entry_y=0;
	private double exit_x=0;
	private double exit_y=0;
	public ConsertVO() {}
	
	public ConsertVO(String c_num, String c_name, String address, double ad_x, double ad_y, String c_kind,
			double c_hall_count, String c_hall_img, List<LineVO> lineList, List<HallVO> hallinfo, String iD,
			double entry_x, double entry_y, double exit_x, double exit_y) {
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
		ID = iD;
		this.entry_x = entry_x;
		this.entry_y = entry_y;
		this.exit_x = exit_x;
		this.exit_y = exit_y;
	}

	@Override
	public String toString() {
		return "ConsertVO [C_num=" + C_num + ", C_name=" + C_name + ", address=" + address + ", ad_x=" + ad_x
				+ ", ad_y=" + ad_y + ", C_kind=" + C_kind + ", C_hall_count=" + C_hall_count + ", C_hall_img="
				+ C_hall_img + ", LineList=" + LineList + ", Hallinfo=" + Hallinfo + ", ID=" + ID + ", entry_x="
				+ entry_x + ", entry_y=" + entry_y + ", exit_x=" + exit_x + ", exit_y=" + exit_y + "]";
	}

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

	public double getAd_x() {
		return ad_x;
	}

	public void setAd_x(double ad_x) {
		this.ad_x = ad_x;
	}

	public double getAd_y() {
		return ad_y;
	}

	public void setAd_y(double ad_y) {
		this.ad_y = ad_y;
	}

	public String getC_kind() {
		return C_kind;
	}

	public void setC_kind(String c_kind) {
		C_kind = c_kind;
	}

	public double getC_hall_count() {
		return C_hall_count;
	}

	public void setC_hall_count(double c_hall_count) {
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

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public double getEntry_x() {
		return entry_x;
	}

	public void setEntry_x(double entry_x) {
		this.entry_x = entry_x;
	}

	public double getEntry_y() {
		return entry_y;
	}

	public void setEntry_y(double entry_y) {
		this.entry_y = entry_y;
	}

	public double getExit_x() {
		return exit_x;
	}

	public void setExit_x(double exit_x) {
		this.exit_x = exit_x;
	}

	public double getExit_y() {
		return exit_y;
	}

	public void setExit_y(double exit_y) {
		this.exit_y = exit_y;
	}

	public ConsertVO Matchscript(Map<String,Object> ConsertInfo) {// 해당 스크립트에서 받아온걸 자바꺼로 만들기위해
		List<LineVO> Line=new ArrayList<LineVO>();
		List<HallVO> Hall=new ArrayList<HallVO>();
		ConsertVO Consert=new ConsertVO();
		List<Map<String,Object>> Hallinfo = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> LineList = new ArrayList<Map<String,Object>>();
		Hallinfo=(List<Map<String, Object>>)ConsertInfo.get("Hallinfo");
		LineList=(List<Map<String, Object>>)ConsertInfo.get("LineList");
		if(ConsertInfo.get("Consertnum")!=null) {
			Consert.setC_num((String)ConsertInfo.get("Consertnum"));
		};
		for(int i=0;i<Hallinfo.size();i++) {
			HallVO HallVO=new HallVO();
			HallVO.setC_hall_name((String)Hallinfo.get(i).get("Hallname"));
			System.out.println(Hallinfo.get(i).get("HallTop"));
			HallVO.setC_hall_loc_top((double)Hallinfo.get(i).get("HallTop"));
			HallVO.setC_hall_loc_left((double)Hallinfo.get(i).get("HallLeft"));
			if(Hallinfo.get(i).get("Hallnum")!=null) {
				HallVO.setC_num((String)ConsertInfo.get("Consertnum"));
				HallVO.setC_hall_num((String)Hallinfo.get(i).get("Hallnum"));
			};
			Hall.add(HallVO);
		}
		for(int i=0;i<LineList.size();i++) {
			LineVO LineVO=new LineVO();
			LineVO.setC_hall_name((String)LineList.get(i).get("Hallname"));
			LineVO.setC_col_name((String)LineList.get(i).get("Linename"));
			LineVO.setC_row_count((String)LineList.get(i).get("Seatcount"));
			LineVO.setC_col_priority((Double)LineList.get(i).get("Order"));
			if(LineList.get(i).get("Linenum")!=null) {
				LineVO.setC_col_num((String)LineList.get(i).get("Linenum"));
			};
			Line.add(LineVO);
		}
		Consert.setID((String)ConsertInfo.get("ID"));
		Consert.setEntry_x((double)ConsertInfo.get("entryLeft"));
		Consert.setEntry_y((double)ConsertInfo.get("entryTop"));
		Consert.setExit_x((double)ConsertInfo.get("exitLeft"));
		Consert.setExit_y((double)ConsertInfo.get("exitTop"));
		
		System.out.println("ConsertVOHallcount"+ConsertInfo.get("Hallcount"));
		Consert.setC_name((String)ConsertInfo.get("ConsertName"));
		Consert.setC_hall_count((double)ConsertInfo.get("Hallcount"));
		Consert.setHallinfo(Hall);
		Consert.setLineList(Line);
		
		return Consert;
	}
	
	public Map<String, Object> Matchjava(ConsertVO Consertinfo){//자바에서 스크립트로 넘기기 위한것 
		Map<String,Object> Consert=new HashMap<String,Object>();
		List<Map<String,Object>> Hallinfo = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> LineList = new ArrayList<Map<String,Object>>();	
		List<LineVO> Line=new ArrayList<LineVO>();
		List<HallVO> Hall=new ArrayList<HallVO>();
		Hall=Consertinfo.getHallinfo();
		Line=Consertinfo.getLineList();
		
		for(int i=0;i<Hall.size();i++) {
			Map<String,Object> javaHall=new HashMap<String,Object>();
			javaHall.put("Hallnum", Hall.get(i).getC_hall_num());
			javaHall.put("Consertnum", Hall.get(i).getC_num());
			javaHall.put("Hallname", Hall.get(i).getC_hall_name());
			javaHall.put("HallTop", Hall.get(i).getC_hall_loc_top());
			javaHall.put("HallLeft", Hall.get(i).getC_hall_loc_left());
			Hallinfo.add(javaHall);
		}
		for(int i=0;i<Line.size();i++) {
			Map<String,Object> javaLine=new HashMap<String,Object>();
			javaLine.put("Consertnum", Line.get(i).getC_num());
			javaLine.put("Hallnum", Line.get(i).getC_hall_num());
			javaLine.put("Seatcount",Line.get(i).getC_row_count());
			javaLine.put("Order",Line.get(i).getC_col_priority());
			javaLine.put("Linename",Line.get(i).getC_col_name());
			javaLine.put("Hallname",Line.get(i).getC_hall_name());
			javaLine.put("Linenum",Line.get(i).getC_col_num());
			LineList.add(javaLine);
		}
		
		Consert.put("Hallinfo",Hallinfo);
		Consert.put("LineList", LineList);
		Consert.put("Consertnum", Consertinfo.getC_num());
		Consert.put("ConsertName", Consertinfo.getC_name());
		Consert.put("Hallcount", Consertinfo.getC_hall_count());
		Consert.put("exitTop", Consertinfo.getExit_y());
		Consert.put("exitLeft", Consertinfo.getExit_x());
		Consert.put("entryTop", Consertinfo.getEntry_y());
		Consert.put("entryLeft", Consertinfo.getEntry_x());
		return Consert;
	}
	public String numbering(String number) {
		/* num=*a11;
		 c콘서트장번호 *=c
		 h홀번호 *=h
		 l라인번호 *=l
		 r좌석번호 *=r*/
		String endnum=null;
		 int num=Integer.parseInt(number.substring(2));
		 System.out.println(num);
		 String numalpha=number.substring(0,2);
		 String numbeta=number.substring(0,1);
		 
		 if((num+1)==100){
		 if(numalpha.substring(1,2).equals("a")){
		 		numalpha=numalpha.substring(0,1)+"b";	
		 }
		 else if(numalpha.substring(1,2).equals("b")){
		 		numalpha=numalpha.substring(0,1)+"c"	;
		 }
		 else if(numalpha.substring(1,2).equals("c")){
		 		numalpha=numalpha.substring(0,1)+"d"	;
		 }
		 else  if(numalpha.substring(1,2).equals("d")){
		 		numalpha=numalpha.substring(0,1)+"e"	;
		 }
		 else  if(numalpha.substring(1,2).equals("e")){
		 		numalpha=numalpha.substring(0,1)+"f"	;
		 }
		 else  if(numalpha.substring(1,2).equals("f")){
		 		numalpha=numalpha.substring(0,1)+"g"	;
		 }
		 else if(numalpha.substring(1,2).equals("g")){
		 		numalpha=numalpha.substring(0,1)+"h"	;
		 }
		 else if(numalpha.substring(1,2).equals("h")){
		 		numalpha=numalpha.substring(0,1)+"i"	;
		 }
		 else  if(numalpha.substring(1,2).equals("i")){
		 		numalpha=numalpha.substring(0,1)+"j"	;
		 }
		 else  if(numalpha.substring(1,2).equals("j")){
		 		numalpha=numalpha.substring(0,1)+"k"	;
		 }
		 else if(numalpha.substring(1,2).equals("k")){
		 		numalpha=numalpha.substring(0,1)+"l"	;
		 }
		 else if(numalpha.substring(1,2).equals("l")){
		 		numalpha=numalpha.substring(0,1)+"n"	;
		 }
		 else  if(numalpha.substring(1,2).equals("n")){
		 		numalpha=numalpha.substring(0,1)+"m"	;
		 }
		 else  if(numalpha.substring(1,2).equals("m")){
		 		numalpha=numalpha.substring(0,1)+"o"	;
		 }
		 else  if(numalpha.substring(1,2).equals("o")){
		 		numalpha=numalpha.substring(0,1)+"p"	;
		 }
		 else  if(numalpha.substring(1,2).equals("p")){
		 		numalpha=numalpha.substring(0,1)+"q"	;
		 }
		 else  if(numalpha.substring(1,2).equals("q")){
		 		numalpha=numalpha.substring(0,1)+"r"	;
		 }
		 else if(numalpha.substring(1,2).equals("r")){
		 		numalpha=numalpha.substring(0,1)+"s"	;
		 }
		 else  if(numalpha.substring(1,2).equals("s")){
		 		numalpha=numalpha.substring(0,1)+"t"	;
		 }
		 else if(numalpha.substring(1,2).equals("t")){
		 		numalpha=numalpha.substring(0,1)+"u"	;
		 }
		 else if(numalpha.substring(1,2).equals("u")){
		 		numalpha=numalpha.substring(0,1)+"v"	;
		 }
		 else  if(numalpha.substring(1,2).equals("v")){
		 		numalpha=numalpha.substring(0,1)+"w"	;
		 }
		 else  if(numalpha.substring(1,2).equals("w")){
		 		numalpha=numalpha.substring(0,1)+"x"	;
		 }
		 else if(numalpha.substring(1,2).equals("x")){
		 		numalpha=numalpha.substring(0,1)+"y"	;
		 }
		 else if(numalpha.substring(1,2).equals("y")){
		 		numalpha=numalpha.substring(0,1)+"z"	;
		 }
		 else if(numalpha.substring(1,2).equals("z")){
			 System.out.println("용량초과");
		 }
		 endnum="00";
		 }
		 else{
			 
		 num+=1;
		 if(num<10) {
			 endnum="0"+num;
		 }
		 else {
			 endnum=String.valueOf(num);
		 }
		 }
		
		 number=numalpha+endnum;
		 return number;
}
}
