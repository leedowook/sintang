package d0529;



public class d4 extends a4{
	public d4(String loc,int maxr) {
		super(loc,maxr);
	}//c4처럼 마찬가지로 부모한테서 값을 받아옴
	
	@Override
	public boolean roll() {//c4와 마찬가지로 a4의 수명 한계 오버라이딩
		++accr;
		if(accr<maxr) {
			System.out.println(loc+"금호 타이어 수명"+(maxr-accr)+"회");
			return true;
		}
		else {
			System.out.println("***"+loc+"금호타이어 펑크 ***");
			return false;
		}
		
	}

}
