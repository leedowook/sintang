package d0531;
import java.util.*;
public class smartphone extends pda implements mobilephone,mp3 {
	Scanner scan=new Scanner(System.in);
	@Override
	public void mcall() {
		System.out.println("상대방의 전화번호를 입력하세요");
		int n=scan.nextInt();
		System.out.println(n+"번으로 통화를 시도합니다.");
		
	}

	@Override
	public void gcall() {
		// TODO Auto-generated method stub
		System.out.println("통화를 연결합니다.");
	}

	@Override
	public void musicon() {
		// TODO Auto-generated method stub
		System.out.println("음악프로그램을 실행시킵니다.");
	}

	@Override
	public void musicstop() {
		// TODO Auto-generated method stub
		System.out.println("음악을 정지합니다.");
	}

	@Override
	public void stext() {
		System.out.print("전송할 내용을 입력하세요");
		String n=scan.next();
		// TODO Auto-generated method stub
		System.out.println("문자를 보냅니다.");
	}

	@Override
	public void rtext() {
		// TODO Auto-generated method stub
		System.out.println("문자를 읽습니다.");
	}
	
}
