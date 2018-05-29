package d0523;

import java.util.Scanner;

public class b0523_8 {

	public static void main(String[] args) {
		a0523_8 a8=new a0523_8();
		int x,y;
		
		
		System.out.println("정사각형의 변의 길이를 입력하시오");
		Scanner 스캔=new Scanner(System.in);
		 x=스캔.nextInt();
		
		System.out.println(a8.넓이(x));
		System.out.println("직사각형의 변의 길이를 입력하시오");
		x=스캔.nextInt();
		y=스캔.nextInt();
		System.out.println(a8.넓이(x,y));
		

	}

}
