package d0530;

public interface remotecon {
	public int max_v= 10;
	public int min_v= 0;
	//abstract를 붙이지 않아도 자동으로 추상메소드로 인식
	//사용 목적은 객체가 가지고있는 메소드에 대한 설명
	void turnon();
	void turnoff();
	void setv(int volume);
	//디폴트 메소드
	//구현 객체가 가지고 있는 메소드의 실행내용까지 작성해 놓은것.
	default void setM(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}
	}
	//정적 메소드
	//객체가 없어도 인터페이스에서 바로 호출 가능한 메소드
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
