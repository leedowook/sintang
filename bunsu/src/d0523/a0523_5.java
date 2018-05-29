package d0523;

public class a0523_5 {
	//메소드 선어
	//메소드 이름: on
	//매개변수 :안줌
	//메소드 리턴 타입: void
	void on() {
		System.out.println("전원을 켭니다.");
		
	}
	int/*리턴타입*/ plus(int x,int y/*매개변수*/) {//매소드 이름: plus
		int result=x+y;
		return result;// return 에 사용되는 값은 리턴타입이랑 타입이 같아야함
		
	}
	double divide(int x,int y) {
		double result= (double)x/(double)y;
		return result;
	}
	void off() {
		System.out.println("전원을 종료합니다");
	}
}
