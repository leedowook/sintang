package com.choju.fpro.vo;

public class LineVO {
	private String C_col_num;//공연장 홀의 고유번호
	private String C_num;//공연장 고유번호
	private String C_hall_num;//홀 숫자
	private String C_hall_name;
	private String C_col_name;//라인 이름
	private String C_row_count;// 열개수
	private double C_col_priority;//열 우선순위 A가 위인지 Z가위인지
	public LineVO() {}
	public String getC_col_num() {
		return C_col_num;
	}
	public void setC_col_num(String c_col_num) {
		C_col_num = c_col_num;
	}
	public String getC_num() {
		return C_num;
	}
	public void setC_num(String c_num) {
		C_num = c_num;
	}
	public String getC_hall_num() {
		return C_hall_num;
	}
	public void setC_hall_num(String c_hall_num) {
		C_hall_num = c_hall_num;
	}
	public String getC_hall_name() {
		return C_hall_name;
	}
	public void setC_hall_name(String c_hall_name) {
		C_hall_name = c_hall_name;
	}
	public String getC_col_name() {
		return C_col_name;
	}
	public void setC_col_name(String c_col_name) {
		C_col_name = c_col_name;
	}
	public String getC_row_count() {
		return C_row_count;
	}
	public void setC_row_count(String c_row_count) {
		C_row_count = c_row_count;
	}
	public double getC_col_priority() {
		return C_col_priority;
	}
	public void setC_col_priority(double c_col_priority) {
		C_col_priority = c_col_priority;
	}
	public LineVO(String c_col_num, String c_num, String c_hall_num, String c_hall_name, String c_col_name,
			String c_row_count, double c_col_priority) {
		C_col_num = c_col_num;
		C_num = c_num;
		C_hall_num = c_hall_num;
		C_hall_name = c_hall_name;
		C_col_name = c_col_name;
		C_row_count = c_row_count;
		C_col_priority = c_col_priority;
	}
	@Override
	public String toString() {
		return "LineVO [C_col_num=" + C_col_num + ", C_num=" + C_num + ", C_hall_num=" + C_hall_num + ", C_hall_name="
				+ C_hall_name + ", C_col_name=" + C_col_name + ", C_row_count=" + C_row_count + ", C_col_priority="
				+ C_col_priority + "]";
	}
	
	
}