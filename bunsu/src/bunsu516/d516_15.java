package bunsu516;

import java.util.Scanner;

public class d516_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner x=new Scanner(System.in);
		System.out.println("초입력해라~");
		int q=x.nextInt();
		int h=(q/60)/60;
		int m=(q/60)%60;
		int s=(q%60%60);
		System.out.println("현제시각은"+h+"시"+m+"분"+s+"초입니다.");
		
	}

}
