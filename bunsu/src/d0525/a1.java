package d0525;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 log=new b1();
		log.create();
		
		boolean result=log.login();
		if(result) {
			System.out.println("환엽합니다.");
			
		}else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}

}
