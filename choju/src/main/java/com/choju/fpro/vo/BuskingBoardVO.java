package com.choju.fpro.vo;

import java.sql.Date;

public class BuskingBoardVO {
	private String L_num;
	private String L_bus_place;
	private String L_bus_kind;
	private Date L_bus_date;
	public BuskingBoardVO() {}
	
	public String getL_num() {
		return L_num;
	}
	public void setL_num(String l_num) {
		L_num = l_num;
	}
	public String getL_bus_place() {
		return L_bus_place;
	}
	public void setL_bus_place(String l_bus_place) {
		L_bus_place = l_bus_place;
	}
	public String getL_bus_kind() {
		return L_bus_kind;
	}
	public void setL_bus_kind(String l_bus_kind) {
		L_bus_kind = l_bus_kind;
	}
	public Date getL_bus_date() {
		return L_bus_date;
	}
	public void setL_bus_date(Date l_bus_date) {
		L_bus_date = l_bus_date;
	}

	@Override
	public String toString() {
		return "BuskingBoardVO [L_num=" + L_num + ", L_bus_place=" + L_bus_place + ", L_bus_kind=" + L_bus_kind
				+ ", L_bus_date=" + L_bus_date + "]";
	}

	public BuskingBoardVO(String l_num, String l_bus_place, String l_bus_kind, Date l_bus_date) {
		super();
		L_num = l_num;
		L_bus_place = l_bus_place;
		L_bus_kind = l_bus_kind;
		L_bus_date = l_bus_date;
	}


}