package d0521;
import java.util.*;
public class a0521_6 {

	public static void main(String[] args) {
		//for each문
		Scanner d=new Scanner(System.in);
		int n[]= {(1),(2),(3),(4),(5),(6)};
		
		int sum=0;
		int i=0;
		String[] f=new String[6];
		for(int num:n) {
			System.out.print(num);
			sum+=num;
			
		}
		System.out.println();
		
		for(String fru:f) {
			f[i]=fru=d.nextLine();
			System.out.print(fru);
			System.out.print(f[i]);
			i++;
		}
	}

}
