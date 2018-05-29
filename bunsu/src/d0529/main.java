package d0529;
import java.util.*;
public class main {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cho;
		sedan se[]=new sedan[4];
		truck tr[];
		String a=null;int b=0,c=0,j=1,k;				
		boolean z=true;
		while(z) {
		System.out.println("자동차의 종류를 고르세요\n1은 승용차 2는 트럭 3은 종료");
		cho=scan.nextInt();
		if(cho==1) {j++;
			for(int i=0;i<j;i++) {
			se[i]=new sedan(a,b,c);
			sedan s=se[i];
			s.se();
			s.spd+=50;}
			System.out.println(s.col+"승용차의 속도는 "+s.spd+"이고 좌석수는"+s.sit()+"개입니다.");
		}
		else if(cho==2) {
			truck tr=new truck(a,b,c);	
			tr.tr();
			tr.spd-=50;
			System.out.println(tr.col+"승용차의 속도는 "+tr.spd+"이고 좌석수는"+tr.gra+"개입니다.");
		}
		else if(cho==3) {System.out.println("종료합니다");z=false;}
		else {System.out.println("값을 제대로 입력하세요");}
	}}
}
