package d0517;
import java.util.*;
public class d0517_5 {

	public static void main(String[] args) {
		/*점수를 입력받고
		 * 90점 이상인 점수에 대해 95점 이상이면 A+
		 * 90이상 95미만이면 A
		 * 85~89 B+
		 * 80~84 B
		 * 75~79 C+
		 * 70~74 C
		 * 
		 * 65~69 D+
		 * 60~64 D
		 * 59미만 F
		 * 
		 * IF문의 끝나면 학점을 출력하는 PRINT 문을 사용
		 * 주의할점은 학점처리한ㄴ STRING 타입의 변수를 하나 사용
		 * 
*/
		
	
		Scanner score=new Scanner(System.in);
		
		int s=score.nextInt();
		String x;
		if(s>90) {
			/*x=(s>=95)?"A+":"A";*/
			if(s>=95) {x="A+";}
			else {x="A";}
		}
		else if(s>80) {
			/*x=(s>=85)?"B+":"B";*/
			if(s>=85) {x="B+";}
			else {x="B";}
		}
		else if(s>70) {
			/*x=(s>=75)?"C+":"C";*/
			if(s>=75) {x="C+";}
			else {x="C";}
		}
		else if(s>60) {
			/*x=(s>=65)?"D+":"D";*/
			if(s>=65) {x="D+";}
			else {x="D";}
		}
		else {
			x="F";
		}
		System.out.println(x+"학점입니다. 축하합니다.");
		
	}

}
