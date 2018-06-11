package project01;

public class resfcl extends fclinfo{
	int ppl;
	public resfcl(int num,String fclname,int x,int y,boolean io,int ppl) {
		this.fclname=fclname;
		this.x=x;
		this.io=io;
		this.y=y;
		this.ppl=ppl;
		this.num=num;
	}
	
	
	@Override
	public  void option() {
		switch(ppl) {
		case 1:
			System.out.println("맛평가:★");
			break;
		case 2:
			System.out.println("맛평가:★★");
			break;
		case 3:
			System.out.println("맛평가:★★★");
			break;
		case 4:
			
			System.out.println("맛평가:★★★★");
			break;
		case 5:
			System.out.println("맛평가:★★★★★");
			break;
			
		
		}
		
		
	}


}
