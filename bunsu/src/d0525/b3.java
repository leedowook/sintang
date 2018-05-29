package d0525;

public class b3 {
	private int balance;
	public static final int MAX_BALANCE=1000000,MIN_BALANCE=0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if(balance<MIN_BALANCE || balance>MAX_BALANCE) {
			if(balance<MIN_BALANCE) {
		System.out.println("계좌에 돈이 부족합니다.");}
			else {System.out.println("계좌 저금한도를 초과했습니다.");}
	}
		else{this.balance = balance;}}
	
}
