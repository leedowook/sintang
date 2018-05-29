package d0528;
//자식
public class b4 extends a4 {
	//1의 값을 갖느 nomal 상수 정의
	//2의 값을 갖는 supersonic 상수 정의
	public static final int nomal=1;//상수정의
	public static final int supersonic=2;//상수정의
	
	public int flymode=nomal;
	
	public void fly() {
		if(flymode==supersonic) {
		System.out.println("자식:초음속 비행합니다.");}
		else {
			super.fly();
			//부모 클래스의 메소드 호출(재정의 안됨)
		}
	}
}
