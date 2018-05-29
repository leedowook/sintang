package d0521;
import java.util.*;
public class a5021_7 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int z,sn,avg;
		int[] go=null;
		boolean x=true;
		do {
			System.out.println("==============================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("==============================================");
			
			System.out.print("선택>");
			z=scan.nextInt();
			
			int count=0,sc=0;
			if(z==1) {
				
				System.out.print("학생수>");
				sn=scan.nextInt();
				go=new int[sn];
				continue;}
			else if(z==2) {
				
			
				for(int i=0;i<go.length;i++) {	
				System.out.print((i+1)+"번째 학생의 점수:");
				go[i]=scan.nextInt();}
				continue;
			}
			else if(z==3) {
				for(int i=0;i<go.length;i++) {
					System.out.println((i+1)+"번째 학생의 점수:"+go[i]);}
				continue;
			}
			else if(z==4) {
				int max=go[0];
				for(int i=0;i<go.length;i++) {
					if(max<=go[i]) {
						max=go[i];
					}
					sc+=go[i];
					count++;
				}
				System.out.println("최고의 점수:"+max);
				System.out.println("평균의 점수:"+(double)sc/count);
				continue;}
			else if(z==5) {x=false;
				break;}
			else {System.out.println("제대로 입력하세요");
				continue;}
			}while(x);

	}

}
