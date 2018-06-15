package d0532;
import java.io.*;
import java.util.*;
public class ex {
	public  static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("이름의 총길이를 구해라");
		int b=scan.nextInt();
		List<String> list=new ArrayList<String>(b);
		
		for(int i=0;i<b;i++) {
			System.out.println("영어로 이름을 입력하세요");
			String a=scan.next();
			list.add(a);
		if(i==b-1) {
			for(int j=0;j<b;j++) {System.out.println(list.get(j));}
		}	
		}
		
		/*int m=0;*/
		int max=/*list.get(0).length();*/0;
		System.out.println("제일 긴이름은 ");
		for(int i=1;i<b;i++) {
			if(list.get(max).length()<list.get(i).length()) {
				max=i;
			}
		}
		System.out.println(list.get(max));
		
	}
}
