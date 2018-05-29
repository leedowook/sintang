package d0517;
import java.util.*;
public class d0517_3 {

	public static void main(String[] args) {
		/*점수를 스캔으로 입력받고 90이상이면 점수 90~100 .등급은 a입니다.
		 * 80이상 90미만이면 점수가 80~89입니다. b입니다.
		 * 70이상 80미만이면 점수가 70~79입니다. c입니다.
		 * 60~69입니다. d
		 * 60미만 입니다. 재수강 ㄱㄱㄱㄱ fffffffffffffffff
		 * 
*/	
		Scanner score=new Scanner(System.in);
		int x=score.nextInt();
		if(x>=90){
			System.out.println("당신의 점수"+x+"점은 90~100입니다. 등급은 A입니다.");
		}
		else if(x>=80) {
			System.out.println("당신의 점수"+x+"점은 89~80입니다. 등급은 B입니다.");

		}
		else if(x>=70) {
			System.out.println("당신의 점수"+x+"점은 79~70입니다. 등급은 C입니다.");

		}	
		else if(x>=60) {
			System.out.println("당신의 점수"+x+"점은 69~60입니다. 등급은 D입니다.");

		}	
		else {
			System.out.println("당신의 점수"+x+"점은 놀랍게도 재수강각입니다."
					+ "재시작으 ㄹ을 가진 등급 FFF입니다.");
			

		}
		score.close();
	}

}
