package d0528;

public class a1 {
	String model;
	String color;
	
	void on() {
		System.out.println("전원을 켭니다.");
		
	}
	void off() {
		System.out.println("전원을 끕니다.");
	}
	
	void bell(){
		System.out.println("벨이 울린다.");
	}
	void sv(String message) {System.out.println("자기:"+message);}
	void rv(String message) {System.out.println("상대:"+message);}
	void hangup() {
		System.out.println("전화를 끊는다.");
	}
	
}
