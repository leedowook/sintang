package been;

import java.sql.Date;

public class boardbean {
	private int num;//글번호
	private String name;//글쓴이
	private String password;//비밀번호
	private String subject;//글제목
	private String content;//글내용
	private String file;//첨부파일 0
	private int reref=-1;//답글:원글 번호
	private int relev;//답글:레벨--글목록을 보여줄때 사용할 필드
	private int reseq;//답글:출력순서
	private int readcount;//조회수
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public int getReref() {
		return reref;
	}
	public void setReref(int reref) {
		this.reref = reref;
	}
	public int getRelev() {
		return relev;
	}
	public void setRelev(int relev) {
		this.relev = relev;
	}
	public int getReseq() {
		return reseq;
	}
	public void setReseq(int reseq) {
		this.reseq = reseq;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
