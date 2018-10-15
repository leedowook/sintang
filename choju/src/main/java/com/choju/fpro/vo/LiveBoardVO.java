package com.choju.fpro.vo;

public  class LiveBoardVO {
	private String L_num; 
	private String L_kind;
	private String L_password;
	private String L_content;
	private String L_singger;
	public LiveBoardVO() {
	};
	public String getL_num() {
		return L_num;
	}
	public void setL_num(String l_num) {
		L_num = l_num;
	}
	public String getL_kind() {
		return L_kind;
	}
	public void setL_kind(String l_kind) {
		L_kind = l_kind;
	}
	public String getL_password() {
		return L_password;
	}
	public void setL_password(String l_password) {
		L_password = l_password;
	}
	public String getL_content() {
		return L_content;
	}
	public void setL_content(String l_content) {
		L_content = l_content;
	}
	public String getL_singger() {
		return L_singger;
	}
	public void setL_singger(String l_singger) {
		L_singger = l_singger;
	}
	@Override
	public String toString() {
		return "LiveBoardVO [L_num=" + L_num + ", L_kind=" + L_kind + ", L_password=" + L_password + ", L_content="
				+ L_content + ", L_singger=" + L_singger + "]";
	}
	public LiveBoardVO(String l_num, String l_kind, String l_password, String l_content, String l_singger) {
		L_num = l_num;
		L_kind = l_kind;
		L_password = l_password;
		L_content = l_content;
		L_singger = l_singger;
	}
	
	
}