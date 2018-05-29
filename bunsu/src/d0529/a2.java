package d0529;

public class a2 {
	
	/*a클래스 접근제한자 protected인 피드,생성자,메소ㅡ 
	b클래스 메소드 선언해서 a클래스 객체 만듦 a클래스의 필드 메소드에 접근가능한지 확인
	c클래스 다른패키지에 선언 a클래스 포함시키고 a클래스객체 만듦 a클래스의 필드 메소드에 접근가능한지
	d클래스는 c크래스와 동일한 패키지에 선언 a클래스 포함 상속받고 생성자를 서넝ㄴ 부모클래스의 필드와 메소드에 접근가능한지 여부
	*/
	String 가;
	protected String 나;
	
	
	public a2(){
		가="가";
		나="나";
	}
	protected a2(String 가) {
		this.가=가;
	}
	protected void qw(){
		System.out.println(나);
	}
	public void qq() {
		System.out.println(나);
	}

}
