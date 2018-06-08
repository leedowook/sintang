package project01.copy;
//자연 테마 
public class natfcl extends fclinfo {
	int timee;//시설 이용제한 시간
	public natfcl(int num,String fclname,int x,int y,boolean io,int timee) {
		this.fclname=fclname;
		this.x=x;
		this.y=y;
		this.timee=timee;
		this.io=io;
		this.num=num;
	}
	
	
	@Override
	public  void option() {
		if(timee>12) {
		System.out.println("이용 끝나는 시각은 오후"+(timee-12)+"시 입니다.");}
		else if(timee>24 ||timee<0) {
			System.out.println("전산 오류입니다.재확인 부탁드립니다.");
		}
		else {System.out.println("이용 끝나는 시각은 오후\"+(timee-12)+\"시 입니다.");}
	}
}
