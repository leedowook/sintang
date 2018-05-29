package d0528;
//a1의 자식클래스  
public class b1 extends a1{//상속 방법:extends 붙이고 부모 클래스이름 붙이기
	//필드 선언
	int ch;
	//생성자 선언
	b1(String model,String color,int ch){
		this.model=model;
		this.color=color;
		this.ch=ch;
	}
	void turnon() {
		System.out.println("채널"+ch+"번 dmb 방송을 수신시작합니다.");
		
	}
	void cgch(int ch) {
		this.ch=ch;
		System.out.println("채널"+ch+"번 dmb 방송을 수신시작합니다");
		
	}
	void turnoff() {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
}
