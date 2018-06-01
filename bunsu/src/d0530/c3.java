package d0530;

public class c3 extends a3{
	public c3() {
		this.kind="포유류";
	}
	@Override
	//부모 클래스에서 정의된 추상메소드를 구체화
	public void sound() {
		System.out.println("meow");
	}

}
