package d0518;

import java.util.Scanner;

public class d0518_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		
		int[] a=new int[3];
		int n,합=0;
		for(int i=0;i<a.length;i++) {
		System.out.println("수를 입력해라");
			a[i]=num.nextInt();
		합+=a[i];
		}
		int avg=합/a.length;
		System.out.println("합은 "+합+" 평균은:"+avg);
		
		
		//2차원 배열의 length는 가로안치면 행 가로치면 열
	}

}
