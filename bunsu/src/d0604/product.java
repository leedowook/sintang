package d0604;
//상품 정의를 위한 추상클래스
public abstract class product {
	//필드 선언	
	String pname;
	int price;
	boolean loc;
	
	//상품의 구체적 정보 출력을 위한 메소드
	public void printdetail() {
		System.out.println("상품명: "+pname+",");
		System.out.println("가격: "+price+",");
		System.out.println("위치:"+loc);
		printExtra();
		
	}
	//상품명,가격정보 이외의 추가 정보 출력을 위한 메소드
	public abstract void printExtra();
}
