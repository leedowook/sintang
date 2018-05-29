package d0529;

public class c4 extends a4{
	public c4(String loc,int maxr) {
		super(loc,maxr);
	}//a4부모의 loc과 maxr를 c4가 받음
	@Override
	public boolean roll() {//a4의 roll에서 오버라이딩
		++accr;
		if(accr<maxr) {
			System.out.println(loc+"한국 타이어 수명"+(maxr-accr)+"회");
			return true;
		}
		else {
			System.out.println("***"+loc+"한국타이어 펑크 ***");
			return false;
		}
		
	}

}
