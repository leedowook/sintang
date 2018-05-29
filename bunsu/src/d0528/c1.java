package d0528;

public class c1 {

	public static void main(String[] args) {
		
		
		String m="제우스",c="빨강";
		int ch=1;
		
		b1 dmb=new b1(m,c,ch);//사실상 클래스 객체 선언
		System.out.println(dmb.ch);
		System.out.println(dmb.model);
		System.out.println(dmb.color);
		
		dmb.hangup();
		dmb.sv("아아아아");
		dmb.rv("오ㅓ오오");
		dmb.bell();
		dmb.on();
		dmb.turnon();
		
		dmb.cgch(12);
		dmb.turnoff();
		dmb.off();

	}

}
