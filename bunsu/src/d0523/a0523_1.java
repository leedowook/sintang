package d0523;

public class a0523_1 {

	public static void main(String[] args) {
		//클래스 객체 선언
		b0523_1 b1=new b0523_1();
		//클래스 객체 출력
		System.out.println("회사는"+b1.model);
		System.out.println("회사는"+b1.com);
		System.out.println("회사는"+b1.maxSpeed);
		
		//필드 값변경
		b1.speed=50;
		System.out.println("b1 클래스의 speed 필드값:"+b1.speed);
	}

}
