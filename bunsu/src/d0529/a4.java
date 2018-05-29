package d0529;

public class a4 {
	public int maxr;//최대회전
	public int accr;//누적 회전
	public String loc;//위치
	
	public a4(String loc,int maxr) {//바퀴위치랑 최대회전 수를 받음
		this.loc=loc;
		this.maxr=maxr;
	}
	
	public boolean roll() { //바퀴가 굴렀을때 수명 몇회가 남았는지 알려주고 수명이 넘어가면 펑크남
		++accr;//accr 초기값 0
		if(accr<maxr) {
			System.out.println(loc+"tire 수명"+(maxr-accr)+"회");
			return true;
		}
		else {
			System.out.println("***"+loc+"tire 펑크 ***");
			return false;
		}
	}
	
	
}
