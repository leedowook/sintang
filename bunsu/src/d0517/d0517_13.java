package d0517;

import java.util.Scanner;

public class d0517_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		
		System.out.println("시작값과 끝값을 띄어쓰기해서 입력하세요");
		int sn=num.nextInt();
		int ln=num.nextInt();
		num.close();
		
		
		
		int sum=0,i=sn;
		
		while(i<=ln) {
			sum+=i;
			
			if(i<ln) {
			System.out.print(i+"+");}
			else {
				System.out.print(i+"="+sum);
			}
			
			
			/*i++*/i++;
			
			
		}
		
	}

}
