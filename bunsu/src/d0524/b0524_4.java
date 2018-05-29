package d0524;
import java.util.*;
public class b0524_4 {
	private Scanner scan=new Scanner(System.in);
	private String name;
	private int accountnum,balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountnum() {
		return accountnum;
	}
	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan=scan;
	}
	public void deposit(){
		System.out.println("입금하실 계좌를 입력해주세요");
		int account=scan.nextInt();
		if(account==accountnum) {
			System.out.println("입금하실 금액를 입력해주세요");
			int money=scan.nextInt();
			this.balance+=money;
			System.out.println("계좌금액: "+this.balance);	
		}
		else{System.out.println("해당 계좌는 존재하지 않습니다.");
		}
		
	};
	public void withdraw(){
		System.out.println("출금하실 계좌를 입력해주세요");
		int account=scan.nextInt();
		if(account==this.accountnum) {
		System.out.println("출금하실 금액를 입력해주세요");
		int money=scan.nextInt();
		this.balance-=money;
		System.out.println("계좌금액: "+this.balance);}
		else{System.out.println("해당 계좌는 존재하지 않습니다.");
		}
	};
	public void result() {
		System.out.println("확인하실 계좌를 입력해주세요");
		int account=scan.nextInt();
		if(account==this.accountnum) {
			System.out.println("이름: "+this.name);
			System.out.println("계좌번호:"+this.accountnum);
			System.out.println("계좌금액: "+this.balance);}
		else{System.out.println("해당 계좌는 존재하지 않습니다.");
		}
		
	}
	
}
