package d0529;

import java.util.Scanner;

public class sedan extends car{
	int sit;
	Scanner scan=new Scanner(System.in); 
	
	public sedan(String col,int spd,int sit){
		super(col,spd);
		this.sit=sit;
		
	}
	public void se() {
		System.out.println("색깔을 고르시오");
		this.col=scan.next();
		System.out.println("좌석수를 고르시오");
		this.sit=scan.nextInt();
	}
	public int sit(){
		return sit;
	}
	
}
