package d0518;
import java.util.*;
public class d0518_4 {

	public static void main(String[] args) {
		Scanner job=new Scanner(System.in);
		int j,g,money=0;
		boolean i=true;//반복과 종료를 위해
		do {
		System.out.println("-----------------------------");
		System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("-----------------------------");
		System.out.print("선택>");
		j=job.nextInt();
		switch(j) {
			case 1: {System.out.print("예금액>");
				g=job.nextInt();
				money+=g;
				System.out.println("고객님의 총 잔액은"+money+"원 입니다.");
					continue;}
			case 2: {System.out.print("출금액>");
				g=job.nextInt();
				if(money>=g) {
					money-=g;
					System.out.println("고객님의 남은 잔액은"+money+"원입니다");
				}
				else {
					System.out.println("잔액이 부족합니다.");
				}
					continue;}
			case 3:{System.out.print("잔액>");
					System.out.println("해당 통장의 고객님의 총 잔액은");
					System.out.println(money+"원 입니다.");
					continue;}
			case 4:{System.out.print("잘가");
							i=false;						
							break;}
			default : {System.out.println("장난치지 마십시오");
						continue;}
									
									}
			
		
		
		}while(i);
		
	}

}
