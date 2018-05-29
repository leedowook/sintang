package d0528;
//a3의 자식 클래스
public class b3 extends a3{
	//부모 클래스에서 선언한 ac 메소드를 재정의함
	@Override//굳이 쓰지않아도 메소드가 재정의 된것으로 인지하지만(아마 덮어씌여지는듯) 컴파일러의 정화한 지시를 위해 사용
	double ac(double r) {
		System.out.println("b3객체의 ac()실행");
		return Math.PI*r*r;
	}
}
