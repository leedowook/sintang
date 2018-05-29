package d0517;
import java.util.*;
public class d0517_12 {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("몇부터 몇까지  더할건데");
		int i=a.nextInt();
		int j=a.nextInt();
		System.out.println();
		int sum=0;
		for(;i<=j;i++) {
			sum+=i;
			
			if(i<j) {
				System.out.print(i+"+");}
			else {System.out.print(i);}
		}System.out.println("="+sum);
		}
		
	
	}
	


