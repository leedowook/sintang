package bunsu516;

public class d516_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cc='A';
		if((cc>=65)&&(cc<=90)) {
			System.out.println("대문자 이군요");
			
		
		}
		if((cc>=97)&&(cc<=122)) {
			System.out.println("소문자 이군요");
		}
		if(!(cc<48)&&!(cc>57)) {
			System.out.println("0~9숫자 이군요");
		}
		int v=6;
		if((v%2==0)||(v%3==0)) {
			System.out.println("2또는 3의 배수이군요");
		}
	}

}
