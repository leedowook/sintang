package d0530;

public abstract class b2 {
	//필드 서언
	public String owner;
	//생성자 선언
	public b2(String owner){
		this.owner=owner;
	}
	public void on() {
		System.out.println("전원 킴");
	}
	public void off() {
		System.out.println("전원 끔");
	}
}
