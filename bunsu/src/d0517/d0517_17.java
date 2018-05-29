package d0517;
import java.util.*;
public class d0517_17 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		System.out.println("한계는 어디까지?");
		int sum=0,i=0,last=num.nextInt();
		num.close();
		while(true) {
			i++;
			if(!(i%2==0 || i%3==0)) {
				sum+=i;
				
			}
			else if(i==last) {
				System.out.println("결과:"+sum);
				
				break;
			}
			
			
		}
		//1부터 입력받은 수 정수 2또는 3의 배수가 아ㅣㄴ 수의 총합을 계산
		/*Scanner num=new Scanner(System.in);
		System.out.println("한계는 어디까지?");
		int sum=0,las=num.nextInt();
		System.out.println("이제 입력해라");
		while(true) {
			
			int n=num.nextInt();
			if(!(n%2==0 || n%3==0)) {
				sum+=n;
				
			}
			else if(n>las||n==las) {
				System.out.println("결과:"+sum);
				num.close();
				break;
			}
			
		}*/
	}

}
