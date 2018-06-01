package d0531;

public class carex {

	public static void main(String[] args) {
		car car=new car();
		car.run();//car의 메소드 불러옴
		System.out.println("-------------");
System.out.println("변수에 다른객체 대입");
car.flt=new kumho();//car에 있는 flt를 금호로 바뀜
//지금같이 클래스 변경하는거 사용할려고 쓰느늣

car.run();
	}

}
