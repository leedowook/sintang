package javapro;

public class eventfcl extends fclinfo{
	int day;//시설 이용제한 날짜
	public eventfcl(int num,String fclname,int x,int y,boolean io,int day) {
		this.fclname=fclname;
		this.x=x;
		this.io=io;
		this.y=y;
		this.day=day;
		this.num=num;
	}
	
	
	@Override
	public  void option() {
		System.out.println("해당 이벤트가 끝나는 날짜는 "+day+"입니다.");
}

}
