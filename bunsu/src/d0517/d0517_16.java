package d0517;
import java.util.*;
public class d0517_16 {

	public static void main(String[] args) {
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요");
		Scanner num=new Scanner(System.in);
		int n,i=0;
		double sum=0;
		//while((n=scanner.nextInt())!=0)//0이 아닐때만 반복하래
		while(true) {
			n=num.nextInt();
			sum+=n;//sum=sum+n
			
			if(n==0) {
				
				System.out.println("입력한개수는"+(i)+"개 "+(sum/i));
				num.close();
				break;
			}
			else{i++;}
			}}}
