package d0517;

import java.util.Scanner;

public class d0517_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//점수 학년 입력후 4학년이면 70점이상일떄 그외엔 60점 이상일떄 합격
		System.out.println("점수와 학년을 띄어서 입력하시오");
		Scanner gs=new Scanner(System.in);
		int s=gs.nextInt();
		String g=gs.next();
		String x;
		switch(g) {
		case "4":
			if(s>=70) {
				x="합격";
			}
			else {x="불합격";}
			break;
		default:
			if(s>=60) {
				x="합격";
			}
			else {x="불합격";}
			break;
			
		}
		System.out.println("당신은"+x+"입니다");
		
		
			
			
		}
	}


