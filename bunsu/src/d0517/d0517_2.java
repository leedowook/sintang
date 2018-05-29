package d0517;

public class d0517_2 {
	public static void main(String[]args) {
		/*score 값을 85로 선언 90이상이면 90보다 큽니다. 등급 A 출력
		 * 90미만 90보다 작 등급 B*/
		int scroe=85;
		if(scroe>=90) {
			System.out.println("90보다 큽니다.");
			System.out.println("등급 A");
			
		}
		else {//if를 제외한 나머지조건식에서 발동
			System.out.println("90이하입니다.");
			System.out.println("등급 B");
		}
		
	}

}
