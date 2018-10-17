package com.choju.fpro.vo;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class Public_BoardVO {
	private int Public_Board_Num;
	private String Public_Board_Password;
	private String Public_Board_Type;
	private String Public_Board_Title;
	private String Public_Board_Content;
	private String Public_Board_Videourl;
	private String Board_Nickname;
	private MultipartFile Public_Board_File;
	private int Public_Board_Hit;
	private Date Public_Board_Date;
	
	private String Public_Board_FileName;

	@Override
	public String toString() {
		return "Public_BoardVO [Public_Board_Num=" + Public_Board_Num + ", Public_Board_Password="
				+ Public_Board_Password + ", Public_Board_Type=" + Public_Board_Type + ", Public_Board_Title="
				+ Public_Board_Title + ", Public_Board_Content=" + Public_Board_Content + ", Public_Board_Videourl="
				+ Public_Board_Videourl + ", Board_Nickname=" + Board_Nickname + ", Public_Board_File="
				+ Public_Board_File + ", Public_Board_Hit=" + Public_Board_Hit + ", Public_Board_Date="
				+ Public_Board_Date + ", Public_Board_FileName=" + Public_Board_FileName + "]";
	}

	//생성자
	public Public_BoardVO() {
				
	}

	public Public_BoardVO(int public_Board_Num, String public_Board_Password, String public_Board_Type,
			String public_Board_Title, String public_Board_Content, String public_Board_Videourl, String board_Nickname,
			MultipartFile public_Board_File, int public_Board_Hit, Date public_Board_Date,
			String public_Board_FileName) {
		super();
		Public_Board_Num = public_Board_Num;
		Public_Board_Password = public_Board_Password;
		Public_Board_Type = public_Board_Type;
		Public_Board_Title = public_Board_Title;
		Public_Board_Content = public_Board_Content;
		Public_Board_Videourl = public_Board_Videourl;
		Board_Nickname = board_Nickname;
		Public_Board_File = public_Board_File;
		Public_Board_Hit = public_Board_Hit;
		Public_Board_Date = public_Board_Date;
		Public_Board_FileName = public_Board_FileName;
	}

	public int getPublic_Board_Num() {
		return Public_Board_Num;
	}

	public void setPublic_Board_Num(int public_Board_Num) {
		Public_Board_Num = public_Board_Num;
	}

	public String getPublic_Board_Password() {
		return Public_Board_Password;
	}

	public void setPublic_Board_Password(String public_Board_Password) {
		Public_Board_Password = public_Board_Password;
	}

	public String getPublic_Board_Type() {
		return Public_Board_Type;
	}

	public void setPublic_Board_Type(String public_Board_Type) {
		Public_Board_Type = public_Board_Type;
	}

	public String getPublic_Board_Title() {
		return Public_Board_Title;
	}

	public void setPublic_Board_Title(String public_Board_Title) {
		Public_Board_Title = public_Board_Title;
	}

	public String getPublic_Board_Content() {
		return Public_Board_Content;
	}

	public void setPublic_Board_Content(String public_Board_Content) {
		Public_Board_Content = public_Board_Content;
	}

	public String getPublic_Board_Videourl() {
		return Public_Board_Videourl;
	}

	public void setPublic_Board_Videourl(String public_Board_Videourl) {
		Public_Board_Videourl = public_Board_Videourl;
	}

	public String getBoard_Nickname() {
		return Board_Nickname;
	}

	public void setBoard_Nickname(String board_Nickname) {
		Board_Nickname = board_Nickname;
	}

	public MultipartFile getPublic_Board_File() {
		return Public_Board_File;
	}

	public void setPublic_Board_File(MultipartFile public_Board_File) {
		Public_Board_File = public_Board_File;
	}

	public int getPublic_Board_Hit() {
		return Public_Board_Hit;
	}

	public void setPublic_Board_Hit(int public_Board_Hit) {
		Public_Board_Hit = public_Board_Hit;
	}

	public Date getPublic_Board_Date() {
		return Public_Board_Date;
	}

	public void setPublic_Board_Date(Date public_Board_Date) {
		Public_Board_Date = public_Board_Date;
	}

	public String getPublic_Board_FileName() {
		return Public_Board_FileName;
	}

	public void setPublic_Board_FileName(String public_Board_FileName) {
		Public_Board_FileName = public_Board_FileName;
	}
	
	
}
