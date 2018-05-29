package d0525;
import java.util.*;
public class b4 {
	private static Scanner scan=new Scanner(System.in);
	private static int p=0;
	
	private static c4[] sa=new c4[100];
	
	//계좌 생성
	public void cr() {
	String a,b;
	int c;
	
	System.out.println("계좌 생성을 선택하셨습니다.");
	
	System.out.print("계좌번호:");
	a=scan.next();
	
	System.out.print("계좌주:");
	b=scan.next();
	
	System.out.print("초기금액:");
	c=scan.nextInt();
	
	sa[p]=new c4(a,b,c);
	System.out.println((p+1)+"번째 고객님 생성이 완료되었습니다.");
	System.out.println();
	p++;
	
		
	}
	//계좌 목록 
	public void 계좌목록() {
		int i=0;
		for(i=0;i<p;i++)
		System.out.println(sa[i].getAnum()+" "+sa[i].getName()+" "+sa[i].getBalance());
		}
		
	
	
	
	//입금
	public void 예금() {
		System.out.println("계좌번호:");
		String a;
		int i=0;
		a=scan.next();
		
		
		if(find(a)==null) {
			System.out.println("해당 계좌는 존재하지 않습니다.");
		}
		else {System.out.println("입금하실 금액을 선택하세요");
		int x,y;
		x=scan.nextInt();
		y=sa[i].getBalance();
		y+=x;
		sa[i].setBalance(y);
		System.out.println("계좌금액:"+find(a).getBalance());
			
		}
		/*boolean z=true;
		while(z) {
			
		if(a.equals(sa[i].getAnum())) {
			System.out.println("입금하실 금액을 선택하세요");
			int x,y;
			x=scan.nextInt();
			y=sa[i].getBalance();
			y+=x;
			sa[i].setBalance(y);
			System.out.println("계좌금액:"+sa[i].getBalance());
			z=false;
		}
		else if(i>p) {
			System.out.println("해당 계좌는 존재하지 않습니다.");
			z=false;
		} 
		else {
			i++;
			continue;
		} */
		
		}
	
	
	//출금
	public void 출금() {
		String a;
		int i=0;
		System.out.println("계좌번호:");
		
		a=scan.next();
		if(find(a)==null) {
			System.out.println("해당 계좌는 존재하지 않습니다.");
		}
		else {System.out.println("출금하실 금액을 선택하세요");
		int x,y;
		x=scan.nextInt();
		y=sa[i].getBalance();
		if(x>y) {
			System.out.println("금액이 모자랍니다.");
		}
		else {sa[i].setBalance(y);
		System.out.println("계좌금액:"+sa[i].getBalance());}
			
		}
		/*boolean z=true;
		while(z) {
			
			if(a.equals(sa[i].getAnum())) {
				System.out.println("출금하실 금액을 선택하세요");
				int x,y;
				x=scan.nextInt();
				y=sa[i].getBalance();
				if(x>y) {
					System.out.println("금액이 모자랍니다.");
				}
				else {sa[i].setBalance(y);
				System.out.println("계좌금액:"+sa[i].getBalance());}
				
				z=false;
			}
		else if(i>p) {
			System.out.println("해당 계좌는 존재하지 않습니다.");
			z=false;
		} 
		else {
			i++;
			continue;
		} */
		
		}
	
	
	//계좌 조회
		public void src() {
			
			System.out.println("계좌 조회를 선택하셨습니다.");
			System.out.println("계좌번호:");
			String a;
			int i=0;
			a=scan.next();
			boolean z=true;
			while(z) {
				
			if(a.equals(sa[i].getAnum())) {
				System.out.println("계좌주:"+sa[i].getName());
				System.out.println("계좌금액:"+sa[i].getBalance());
				z=false;
			}
			else if(sa[i].getAnum().equals(null)) {
				System.out.println("해당 계좌는 존재하지 않습니다.");
				z=false;
			} 
			else {
				i++;
				continue;
			} 
			
			}
		}
	
	//기본 메뉴
	private static c4 find(String anum) {
		int i=0;
		c4 ssa=sa[i];
		for(i=0;i<=p;i++) {
		if(anum.equals(sa[i].getAnum())) {
			return ssa;
		}
		else {return null;}
		}
		return null;
		}
	
	public void bone() {
		int sel;
		boolean z=true;
		while(z) {
		System.out.println("-----------------------------------------------");
		System.out.println("1. 계좌생성|2.계좌목록|3.예금|4.출금|5.계좌조회|6.종료");
		System.out.println("-----------------------------------------------");
		System.out.print("실행하실 업무를 고르세요>");
		sel=scan.nextInt();
		if(sel==1) 
		{cr();}
		else if(sel==2) {계좌목록();}
		else if(sel==3) {예금();}
		else if(sel==4) {출금();}
		else if(sel==5) {src();}
		else if(sel==6) {z=false;
		System.out.println("감사합니다 좋은하루 되십시오");}
		else {System.out.println("올바른 업무를 선택하여 주시기 바랍니다.");}
	}
}
}