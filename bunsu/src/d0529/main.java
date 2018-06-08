package d0529;
import java.util.*;
public class main {
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int cho;
		sedan se[] = null;
		truck tr[] = null;
		String a=null;int b=0,c=0,j=1,k=1;				
		boolean z=true;
		while(z) {
		System.out.println("메뉴를 고르세요\n1은 승용차 2는 트럭 3은 종료 4는 차량조");
		cho=scan.nextInt();
		if(cho==1) {j++;
			for(int i=0;i<j;i++) {
			
			sedan s=se[i];
			s=new sedan(a,b,c);
			s.se();
			s.spd+=50;
			System.out.println(s.col()+"승용차의 속도는 "+s.spd()+"이고 좌석수는"+s.sit()+"개입니다.");
		}}
		else if(cho==2) {
			k++;
			for(int i=0;i<k;i++) {
			truck t=tr[i];	
			t=new truck(a,b,c);
			t.tr();
			t.spd-=50;
			System.out.println(t.col()+"승용차의 속도는 "+t.spd()+"이고 좌석수는"+t.gra()+"개입니다.");
		}}
		else if(cho==3) {System.out.println("종료합니다");z=false;}
		else {System.out.println("값을 제대로 입력하세요");}
	}}
}
