package project01;
//스릴 테마 시설
public class trillfcl extends fclinfo {
	int dif ;
	public trillfcl(int num,String fclname,int x,int y,boolean io,int dif) {
		this.fclname=fclname;
		this.x=x;
		this.y=y;
		this.dif=dif;
		this.num=num;
	}
	
	
	@Override
	public  void option() {
		switch(dif) {
		case 1:
			System.out.println("난이도:★");
			break;
		case 2:
			System.out.println("난이도:★★");
			break;
		case 3:
			System.out.println("난이도:★★★");
			break;
		case 4:
			
			System.out.println("난이도:★★★★");
			break;
		case 5:
			System.out.println("난이도:★★★★★");
			break;
			
		
		}
	}
}


