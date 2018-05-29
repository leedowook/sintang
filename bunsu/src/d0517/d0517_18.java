package d0517;
import java.util.*;
public class d0517_18 {
	public static void main(String[]args) {
	Scanner num=new Scanner(System.in);
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
		
	}
}
}
