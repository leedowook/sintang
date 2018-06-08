package project01.copy;
//공포테마 시설
public class fearfcl extends fclinfo{
	int fear;
	
	public fearfcl(int num,String fclname,int x,int y,boolean io,int fear) {
		this.fclname=fclname;
		this.x=x;
		this.io=io;
		this.y=y;
		this.fear=fear;
		this.num=num;
		
	}
	
	
	@Override
	public  void option() {
		switch(fear) {
		case 1:
			System.out.println("공포도:★");
			break;
		case 2:
			System.out.println("공포도:★★");
			break;
		case 3:
			System.out.println("공포도:★★★");
			break;
		case 4:
			
			System.out.println("공포도:★★★★");
			break;
		case 5:
			System.out.println("공포도:★★★★★");
			break;
			
		
		}
		
		
	}
}
