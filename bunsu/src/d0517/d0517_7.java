package d0517;

public class d0517_7 {

	public static void main(String[] args) {
		char grade='B';
		String position="과장";
		
		switch(position) {
		case "부장"://동시에 두게 조건도 됨
		
			System.out.println("부장입니다.");
			break;
		case "과장":
		
			System.out.println("과장입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		
		
		};
		/*switch(grade) {
		case 'A'://동시에 두게 조건도 됨
		case 'a':
			System.out.println("우수회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반회원입니다.");
		default:
			System.out.println("손님입니다.");
		
		
		};*/

	}

}
