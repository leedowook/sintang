package com.choju.fpro.vo;

public class HallVO {
	private String C_hall_num;
	private String C_num;
	private String C_hall_name;
	private double C_hall_loc_top;
	private double C_hall_loc_left;
	
	public String getC_hall_num() {
		return C_hall_num;
	}
	public void setC_hall_num(String c_hall_num) {
		C_hall_num = c_hall_num;
	}
	public String getC_num() {
		return C_num;
	}
	public void setC_num(String c_num) {
		C_num = c_num;
	}
	public String getC_hall_name() {
		return C_hall_name;
	}
	public void setC_hall_name(String c_hall_name) {
		C_hall_name = c_hall_name;
	}

	public double getC_hall_loc_top() {
		return C_hall_loc_top;
	}
	public void setC_hall_loc_top(double c_hall_loc_top) {
		C_hall_loc_top = c_hall_loc_top;
	}
	public double getC_hall_loc_left() {
		return C_hall_loc_left;
	}
	public void setC_hall_loc_left(double c_hall_loc_left) {
		C_hall_loc_left = c_hall_loc_left;
	}
	
	@Override
	public String toString() {
		return "HallVO [C_hall_num=" + C_hall_num + ", C_num=" + C_num + ", C_hall_name=" + C_hall_name
				+ ", C_hall_loc_top=" + C_hall_loc_top + ", C_hall_loc_left="
				+ C_hall_loc_left + "]";
	}
	public HallVO(String c_hall_num, String c_num, String c_hall_name,  double c_hall_loc_top,
			double c_hall_loc_left) {
	
		C_hall_num = c_hall_num;
		C_num = c_num;
		C_hall_name = c_hall_name;
	
		C_hall_loc_top = c_hall_loc_top;
		C_hall_loc_left = c_hall_loc_left;
		
	}
	public HallVO() {
		
	}
	
}
