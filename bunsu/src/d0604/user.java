package d0604;
//사용자 정보 등록을 위한 클래스
public class user {
	private String name;
	
	//열거형 변수 (Enumeration,enum)
	private paytype payt;//paytype변수는 변수값을 enum에서 정의한 내용만 가질 수 있음.
	
	public user(String name,paytype payt) {
		this.name=name;
		this.payt=payt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public paytype getPayt() {
		return payt;
	}

	public void setPayt(paytype payt) {
		this.payt = payt;
	}
	
}
