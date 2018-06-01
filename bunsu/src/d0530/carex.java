package d0530;

public class carex {
	public static void main(String []args) {
	sedan s=new sedan();
	truck t=new truck();
	s.col="빨강";
	s.spd=100;
	t.col="검정";
	t.spd=70;
	
	System.out.print("세단의 색은 "+s.col+" 속도는 "+s.spd);
	s.in();
	System.out.print("트럭의 색은 "+t.col+" 속도는 "+t.spd);
	t.in();
	}

}
