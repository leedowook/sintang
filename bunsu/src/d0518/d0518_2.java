package d0518;

import java.util.Scanner;

public class d0518_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("2x+4y=n의 n값을 입력하세요");
		int x=0,y=0,z=1,i=1,n=num.nextInt();
	
			for(y=0;y<=10;y++) {
				i=1;
				x=0;
				while(i==1) {
					x++;
			if((2*x+4*y)==n) {++z;
		System.out.println("x:"+x+" y:"+y+" 일 때 "+2*x+"+"+4*y+"+"+"="+n);
				}
			else if((2*x+4*y)>n) {
				i=2;
			}		
					}
				}
			if(z==1) {
				System.out.println("답은 없습니다.");
			}
	}

}