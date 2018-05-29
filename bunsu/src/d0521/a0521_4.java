package d0521;

import java.util.*;

public class a0521_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int z=0,x,i=0;
		String[][] words=new String[z][1];
		String o;
		System.out.println("단어의 개수를 고르세요");
		z=scan.nextInt();
		while(true) {
				if(i==words.length){break;}
				else{
				
					System.out.print("영어단어를 입력하세요");
					words[i][0]=scan.nextLine();//영어단어입력
					System.out.println("영어단어 "+words[i][0]+"를 입력하셨습니다.");
					System.out.print("뜻을 입력하세요");
					words[i][1]=scan.nextLine();//뜻을 입력
					System.out.println("뜻 "+words[i][1]+"를 입력하셨습니다.");
					i++;//다음 배열을 위해 
					continue;}
			
		}
		
		double j=0;
		int count=0;
		for(i=0;i<words.length;i++) {
			count++;
			System.out.print(words[i][0]+"뜻은?");
			o=scan.next();
				if(o.equals(words[i][1])){
					j++;
							System.out.println("정답입니다.");
					}
				else {System.out.print("입력한"+o+"는");
					System.out.println(" 오답입니다.");}
						
			}
		
		System.out.println("총"+j+"개 맞췄습니다.");
		System.out.println("정답률은 "+ j/count*100+"%");
	}

	}


