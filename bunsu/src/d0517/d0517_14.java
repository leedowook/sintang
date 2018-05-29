package d0517;
import java.util.*;
public class d0517_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메세지 입력해봐");
		System.out.println("종료시엔 q");
		Scanner de=new Scanner(System.in);
		int i=1;
		String IW;
		do {
			System.out.print(">");
			IW=de.next();
			System.out.println(IW);
		}while(! IW.equals("q"));
		System.out.println("프로그램 종료");
		/*while(i==1){
			String IW=de.next();
		switch(IW) {
			case "q":
			System.out.println("프로그램 종료");
			i=2;
			de.close();
			break;
			
			default: System.out.println(">"+IW);
		}}*/}}


