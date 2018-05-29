package d0529;
import java.util.*;
public class truck extends car{
	int gra;
	Scanner scan=new Scanner(System.in); 
				
	
	public truck(String col,int spd,int gra){
		super(col,spd);
		this.gra=gra;
		
	}
	public void tr() {
		System.out.println("색깔을 고르시오");
		this.col=scan.next();
		System.out.println("무게를 고르시오");
		this.gra=scan.nextInt();
	}
	public int gra(){
		return gra;
	}
}
