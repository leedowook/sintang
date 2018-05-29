package bunsu516;

public class bunsu516 {

	public static void main(String[] args) {//여기서 메인메소드가 시작이된다.라는 의미
		byte bytegab=10;
		
		int intgab=bytegab;//인트에 바이트 값을 넣으면 인트가 커서 무사히출력
		System.out.println(intgab);
		
		char chargab='가';
		intgab=chargab;//인트에 차값을 넣으면 유니코드로 변환 문자형을 못써서
		System.out.println("거의 유니코드"+intgab);
		
		intgab=500;
		long longgab=intgab;//long 은 인트보다 크므로 무사출력
		System.out.println(longgab);
		
		intgab=200;//더블에 인트값을 넣으면 실수로 바뀜 실수자체가 범위가커서
		double doublegab=intgab;
		System.out.println(doublegab);
		
		/*boolean boolgab=true;
		intgab=boolgab;
		System.out.println(boolgab); 되지 않는다 부울은 다른데 못넣음*/
	}

}
