package com.choju.fpro.vo;

public class SeatVO {
	private String c_row_num;
	private String c_num;
	private String c_hall_num;
	private String c_col_num;
	
	private String c_grade;
	private String c_price;
	public String getC_row_num() {
		return c_row_num;
	}
	public void setC_row_num(String c_row_num) {
		this.c_row_num = c_row_num;
	}
	public String getC_num() {
		return c_num;
	}
	public void setC_num(String c_num) {
		this.c_num = c_num;
	}
	public String getC_hall_num() {
		return c_hall_num;
	}
	public void setC_hall_num(String c_hall_num) {
		this.c_hall_num = c_hall_num;
	}
	public String getC_col_num() {
		return c_col_num;
	}
	public void setC_col_num(String c_col_num) {
		this.c_col_num = c_col_num;
	}
	public String getC_grade() {
		return c_grade;
	}
	public void setC_grade(String c_grade) {
		this.c_grade = c_grade;
	}
	public String getC_price() {
		return c_price;
	}
	public void setC_price(String c_price) {
		this.c_price = c_price;
	}
	@Override
	public String toString() {
		return "SeatVO [c_row_num=" + c_row_num + ", c_num=" + c_num + ", c_hall_num=" + c_hall_num + ", c_col_num="
				+ c_col_num + ", c_grade=" + c_grade + ", c_price=" + c_price + "]";
	}
	public SeatVO(String c_row_num, String c_num, String c_hall_num, String c_col_num, String c_grade, String c_price) {
		super();
		this.c_row_num = c_row_num;
		this.c_num = c_num;
		this.c_hall_num = c_hall_num;
		this.c_col_num = c_col_num;
		this.c_grade = c_grade;
		this.c_price = c_price;
	}


}
