package d0531;
import java.util.*;
public class nanum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("나눠질 값을 입력하세요:");
		int a=scan.nextInt();
		System.out.print("나눌 값을 입력하세요:");
		int b=scan.nextInt();
		try{System.out.println("결과값은 "+a/b);
		}
		catch(ArithmeticException e) {System.out.println("결과값은 "+(double)a/b);}
		
		
	}
}
