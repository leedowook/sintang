package javapro;
//유아 테마시설
public class kidfcl extends fclinfo {
	int age;

	public kidfcl(int num,String fclname,int x,int y,boolean io,int age) {
		this.fclname=fclname;
		this.x=x;
		this.io=io;
		this.y=y;
		this.age=age;
		this.num=num;
	}
	
	
	@Override
	public  void option() {
		System.out.println("나이제한: "+age+"살까지");
	}
}
