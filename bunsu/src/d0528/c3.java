package d0528;

public class c3 {

	public static void main(String[] args) {
		int r=10;
		
		a3 cl=new a3();
		//부모 클래스 메소드 호출;
		System.out.println("부모 클래스 메소드 호출"+cl.ac(r));
		
		b3 com=new b3();
		System.out.println("자식 클래스 메소드 호출"+com.ac(r));

	}

}
