package javapro;
//워터 파크시설
public class waterfcl extends fclinfo {
	String wet;//시설 이용제한 시간
	public waterfcl(int num,String fclname,int x,int y,boolean io,String wet) {
		this.fclname=fclname;
		this.x=x;
		this.y=y;
		this.io=io;
		this.wet=wet;
		this.num=num;
	}
	
	
	@Override
	public  void option() {
		if(wet.equals("상")) {
		System.out.println("굉장히 많이 젖습니다 주의하십시오");}
		else if(wet.equals("중")) {
			System.out.println("어느정도 축축함이 예상됩니다.");
		}
		else if(wet.equals("하")){
			System.out.println("전자기기만 주의하여 주십시오");
		}
		else {System.out.println("전산오류입니다.");}
	}
}


