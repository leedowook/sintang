package d0531;

public class stringcharat {
	public static void main(String []args) {
		String ssn="102455-241244";
		char gender=ssn.charAt(7);
		switch(gender) {
		case'1':
			System.out.println("남자입니다");
			break;
		case'2':
			System.out.println("여자입니다.");
			break;
		case'3':
			System.out.println("남자입니다");
			break;
		case'4':
			System.out.println("여자입니다.");
			break;
		}
		
	}
}
