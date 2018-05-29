package d0524;

public class a0524_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a0524_1 a1=new a0524_1();
		a1.setSp(100);
		System.out.println("현제속도: "+a1.getSp());
		if(!a1.isStop()) {
			a1.setStop(true);
		}
		System.out.println("현제속도: "+a1.getSp());
	}

}
