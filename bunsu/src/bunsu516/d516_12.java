package bunsu516;
import java.util.*;
public class d516_12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name;
		System.out.println("당신의 이름을 입력하세요");
		name=scanner.next();//.next()문자열을 입력을 위한 스캐너의 메소드
		System.out.println("당신의이름은"+name+"입니다.");
		scanner.close();
		/*next():문자열입력
		 * nextInt()
		 * nextDouble():해당 변수입력
		 * close():스캐너 종료
		 * */
	}

}
