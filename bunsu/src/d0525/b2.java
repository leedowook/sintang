package d0525;
import java.util.*;
public class b2 {
	Scanner scan=new Scanner(System.in);
	int p;
	public void dot() {
		System.out.print("첫번째 x좌표");
		int x1=scan.nextInt();
		System.out.print("첫번째 y좌표");
		int y1=scan.nextInt();
		System.out.print("두번째 x좌표");
		int x2=scan.nextInt();
		System.out.print("두번째 y좌표");
		int y2=scan.nextInt();
		System.out.println("두점 사이의 길이는"+Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2)));
	}
	public void gab() {
		System.out.print("절대값을 구할 숫자를 입력하세요:");
		double g=scan.nextDouble();
		if(g<0) {
			System.out.println("입력하신 수의 절대값은"+-g);
		}
		else {
			System.out.println("입력하신 수의 절대값은"+g);
		}
		
	}
	public void bone() {
		boolean z=true;
		while(z) {
			System.out.println("수행할 내용을 선택하세요");
			System.out.println("=============================");
			System.out.println("1.두점사이의 거리 구하기");
			System.out.println("2.절대값 구하기");
			System.out.println("3.종료");
			System.out.println("=============================");
			System.out.print("선택>>");
			p=scan.nextInt();
			if(p==1) {
				dot();
				continue;
			}
			else if(p==2) {
				gab();
				continue;
			}
			else if(p==3) {
				System.out.println("프로그램이 종료 됩니다 ");
				z=false;
				
				continue;
			}
			else {System.out.println("제대로 된 값을 입력하세요");}
			continue;
			
		}
	}
	
	

}
