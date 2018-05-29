package d0521;
import java.util.*;
public class a0521_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Scanner scand=new Scanner(System.in);
		int z,x;
		String y;
		System.out.println("학기 횟수와 과목 갯수를 따로 입력하시오");
		z=scan.nextInt();//학기
		x=scan.nextInt();//과목
		double[][] score=new double[z][x];
		System.out.println("과목이름과 학점을 순서대로 입력하고 입력을 중도에 마치려면 끝를 입력하세요");
		
			loop:for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				y=scan.next();
				if(y.equals("끝")) {
					break loop;
				}
				score[i][j]=scand.nextDouble();
				
				
			
			}
		}
		/*double score[][]= {{3.2,5},{2.6,5.0},
						{4.5,2.1},{1.5,4.7},
						{2.8,3.7},{3.4,3.3}};*/
		double sum=0,avg,k=0;
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				k++;
				sum+=score[i][j];
			}
			
		}
		avg=sum/k;
		System.out.println("평균은 "+avg+"점입니다.");
	}

}
