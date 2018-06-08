package d0532;
import java.util.*;
import java.io.*;
public class engdex {
	public static void main(String[] args) {
		String a,b;
		Map<String,String> dic =new HashMap<String,String>();
		Scanner scan=new Scanner(System.in);
		boolean x=true;
		int p;
		while(x) {
			System.out.println("단어를 직접 입력하시겠습니까?맞으면 1번 틀리면 2번을 종료는 3번을  눌러주세요\n(기본단어은 10개입니다)");
			p=scan.nextInt();
					if(p==1) {
		System.out.print("단어의 갯수를 정하시오 : ");
		int c=scan.nextInt();
		for(int i=0;i<c;i++) {
			System.out.print(i+1+"번째 단어의 영어를 입력하세요");
			a=scan.next();
			System.out.print("뜻을를 입력하세요");
			b=scan.next();
			dic.put(a,b);
		}}
					
					else if(p==2) {
						dic.put("door","문");
						dic.put("moon","달");
						dic.put("water","물");
						dic.put("love","사랑");
						dic.put("fire","불");
						dic.put("wind","바람");
						dic.put("earth","지구");
						dic.put("rock","바위"); 
						dic.put("clock","시계");
					}
					else if(p==3) {x=false; break;
						
					}
		int d=0;
		
		boolean z=true;
		while(z) {
			System.out.println("사전입니다. 영어->한글를 검색을 하시려면 1번 한글->영어를 검색하시려면 2번 종료하시려면 3번을 눌러주세요");
			d=scan.nextInt();
			if(d==1) {System.out.println("검색하실 영어를 입력해주세요");
			a=scan.next();
			System.out.println(dic.get(a));		}
			else if(d==2) {
				System.out.println("검색하실 한글를 입력해주세요");
				a=scan.next();
				Set<String> di=dic.keySet();
				Iterator<String> k=di.iterator();
				while(k.hasNext()) {
					String key=k.next();
					String val=dic.get(key);
					if(a.equals(val)) {
						System.out.println("찾으시는 영어는"+key+"입니다.");
						break;
					}
				}
			}
			else if(d==3) {System.out.println("종료됩니다.");z=false;}
			else{System.out.println("장난치지 마십시오");}
		
		}}
	}
}
