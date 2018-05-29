package d0525;

public class a3 {
	public static void main(String[]args) {
	b3 account=new b3();
	account.setBalance(10000);
	System.out.println("현제잔고:"+account.getBalance());
	account.setBalance(-100);
	System.out.println("현제잔고:"+account.getBalance());
	account.setBalance(2000000);
	System.out.println("현제잔고:"+account.getBalance());
	account.setBalance(300000);
	System.out.println("현제잔고:"+account.getBalance());
	}
}
