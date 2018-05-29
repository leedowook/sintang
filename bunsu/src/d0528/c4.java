package d0528;

public class c4 {
	public static void main(String args[]) {
		
		b4 b=new b4();//자식 클래스불러오기
		b.takeoff(); //자식의 부모꺼
		
		b.fly();//자식꺼 
		b.flymode=b.supersonic;
		b.fly();
		b.flymode=b.nomal;
		b.fly();
		b.land();//자식의 부모꺼
	}
}
