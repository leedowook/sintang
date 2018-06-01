package d0531;

public class car {
	//tire 인터페이스 타입 변수 flt 선언
	tire flt=new hanbook();
	tire frt=new hanbook();
	tire blt=new hanbook();
	tire brt=new hanbook();
	void run() {
		flt.roll();
		frt.roll();
		blt.roll();
		brt.roll();
	}
	
}
