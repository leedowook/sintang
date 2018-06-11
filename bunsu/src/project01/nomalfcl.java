package project01;

public class nomalfcl extends fclinfo{
	
	public nomalfcl(int num,String fclname,int x,int y,boolean io) {
		this.num=num;
		this.fclname=fclname;
		this.x=x;
		this.y=y;
		this.io=io;
	}
	
	@Override 
	public void option() {
		System.out.println("");
	}
}
