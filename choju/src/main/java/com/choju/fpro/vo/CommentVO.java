package com.choju.fpro.vo;

import java.util.Date;

public class CommentVO {
	private int Comment_Num; //댓글 번호
	private int Board_Num; //게시글 번호
	private String Comment_Content; //댓글 내용
	private String Comment_Nickname; //댓글 작성자
	private int Comment_Like; //댓글 좋아요
	private Date Comment_date; //댓글 작성
	
	public CommentVO() {
		
	}

	@Override
	public String toString() {
		return "CommentVO [Comment_Num=" + Comment_Num + ", Board_Num=" + Board_Num + ", Comment_Content="
				+ Comment_Content + ", Comment_Nickname=" + Comment_Nickname + ", Comment_Like=" + Comment_Like
				+ ", Comment_date=" + Comment_date + "]";
	}

	public int getComment_Num() {
		return Comment_Num;
	}

	public void setComment_Num(int comment_Num) {
		Comment_Num = comment_Num;
	}

	public int getBoard_Num() {
		return Board_Num;
	}

	public void setBoard_Num(int board_Num) {
		Board_Num = board_Num;
	}

	public String getComment_Content() {
		return Comment_Content;
	}

	public void setComment_Content(String comment_Content) {
		Comment_Content = comment_Content;
	}

	public String getComment_Nickname() {
		return Comment_Nickname;
	}

	public void setComment_Nickname(String comment_Nickname) {
		Comment_Nickname = comment_Nickname;
	}

	public int getComment_Like() {
		return Comment_Like;
	}

	public void setComment_Like(int comment_Like) {
		Comment_Like = comment_Like;
	}

	public Date getComment_date() {
		return Comment_date;
	}

	public void setComment_date(Date comment_date) {
		Comment_date = comment_date;
	}

	
	
	
}