package com.choju.fpro.vo;

public class PageMaker {
	private int page; //현재페이지
	private int end; //끝페이지
	private int start; //시작페이지
	private int count; //컬럼갯수
	private boolean prev; //이전
	private boolean next; //다음
	private int boardendnum;
	private int boardcount=10;
	private int boardstartnum;
	public int getBoardendnum() {
		return boardendnum;
	}

	public void setBoardendnum(int boardendnum) {
		this.boardendnum = boardendnum;
	}

	public int getBoardcount() {
		return boardcount;
	}

	public void setBoardcount(int boardcount) {
		this.boardcount = boardcount;
	}

	public int getBoardstartnum() {
		return boardstartnum;
	}

	public void setBoardstartnum(int boardstartnum) {
		this.boardstartnum = boardstartnum;
	}

	public PageMaker() {
		
	}

	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		if (page < 1) {
			this.page = 1;
			return;
		}else {this.page = page;
		return;}
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		if (count < 1) {
			return;
		}
		this.count = count;
		System.out.println("총 컬럼 갯수 = " + count);
		calcPage();
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}

	private void calcPage() {

		      // page변수는 현재 페이지번호
		      int tempEnd = (int)(Math.ceil(page / 10.0) * 10);
		      // 현재 페이지번호를 기준으로 끝 페이지를 계산한다.

		      System.out.println("page = " + page);
		      System.out.println("tempEnd = " + tempEnd);
		      System.out.println("this.count = " + this.count);

		      // 시작 페이지 계산
		      this.start = tempEnd - 9;
		      System.out.println("start="+this.start);

		      if (tempEnd * 10 > this.count) { // 가상으로 계산한 tempEnd크기가 실제 count보다 많을경우
		         this.end = (int) Math.ceil(this.count / 10.0);
		         System.out.println("if문 안에 있는 this.end는? " + this.end);
		      } else {                  
		         this.end = tempEnd;          // 실제 count가 tempEnd보다 많을경우
		      }

		      System.out.println("this.end = "+this.end);
		     
		      this.prev = this.start != 1; 
		      this.next = this.end * 10 < this.count;   
		      this.boardstartnum=this.boardcount*(this.page-1);
		      this.boardendnum=this.boardstartnum+this.boardcount;
		      if(this.count-this.boardstartnum<this.boardcount) {
		    	  this.boardendnum= this.count;
		      }
		      System.out.println("페이지에따른 첫게시글순서:"+this.boardstartnum);
	    	  System.out.println("페이지에따른 끝게시글순서:"+this.boardendnum);
		   }
	
	@Override
	public String toString() {
		return "PageMaker [page=" + page + ", end=" + end + ", start=" + start + "]";
	}
	

}