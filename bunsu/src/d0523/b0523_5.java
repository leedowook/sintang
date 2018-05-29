package d0523;

public class b0523_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculator 객체 생성
		//on 메소드 호출
		//plus 호출 및 호출결과 출력
		//divide 호출 및 호출결과 출력
		//off 메소드 호출
		a0523_5 a=new a0523_5();
		
		a.on();
		int i=a.plus(5, 6);
		System.out.println(a.plus(5, 2));
		double j=a.divide(5,5);
		System.out.println("j값"+j+"\n"+"i값"+i);
		System.out.println(a.divide(2, 3));
		a.off();
		
		
		
	}

}
