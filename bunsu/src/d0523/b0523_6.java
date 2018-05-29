package d0523;
import java.util.*;
public class b0523_6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		a0523_6 a6a=new a0523_6();
		System.out.println("가스값을 입력하세요");
		int a=scan.nextInt();
		a6a.setgas(a);
		boolean b=a6a.leftgas();// b는 남은 가스에따라 true 나 false 를 받을것이여
		/*a6a.run();   =*/
		if(b) {//만일 가스가있으면 b가 true를 받을것이여
			System.out.println("출발합니다.");
			a6a.run();//고럼 이거들이 실행되겠지
		}
		if(a6a.leftgas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요");
		}
		
		
		
	}
}	
