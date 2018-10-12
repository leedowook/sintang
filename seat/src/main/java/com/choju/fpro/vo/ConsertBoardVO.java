package com.choju.fpro.vo;

import java.sql.Date;

public class ConsertBoardVO extends LiveBoardVO {
	private String L_consert_num;
	private String L_consert_title;
	private int L_price;
	private String L_consert_kind;
	private Date L_date_s;
	private Date L_date_e;
	
	public ConsertBoardVO(){}
	public String getL_consert_num() {
		return L_consert_num;
	}
	public void setL_consert_num(String l_consert_num) {
		L_consert_num = l_consert_num;
	}
	public String getL_consert_title() {
		return L_consert_title;
	}
	public void setL_consert_title(String l_consert_title) {
		L_consert_title = l_consert_title;
	}
	public int getL_price() {
		return L_price;
	}
	public void setL_price(int l_price) {
		L_price = l_price;
	}
	public String getL_consert_kind() {
		return L_consert_kind;
	}
	public void setL_consert_kind(String l_consert_kind) {
		L_consert_kind = l_consert_kind;
	}
	public Date getL_date_s() {
		return L_date_s;
	}
	public void setL_date_s(Date l_date_s) {
		L_date_s = l_date_s;
	}
	public Date getL_date_e() {
		return L_date_e;
	}
	public void setL_date_e(Date l_date_e) {
		L_date_e = l_date_e;
	}
	public ConsertBoardVO(String l_consert_num, String l_consert_title, int l_price, String l_consert_kind,
			Date l_date_s, Date l_date_e) {
		super();
		L_consert_num = l_consert_num;
		L_consert_title = l_consert_title;
		L_price = l_price;
		L_consert_kind = l_consert_kind;
		L_date_s = l_date_s;
		L_date_e = l_date_e;
	}
	@Override
	public String toString() {
		return "ConsertBoardVO [L_consert_num=" + L_consert_num + ", L_consert_title=" + L_consert_title + ", L_price="
				+ L_price + ", L_consert_kind=" + L_consert_kind + ", L_date_s=" + L_date_s + ", L_date_e=" + L_date_e
				+ "]";
	}
	
	
}
