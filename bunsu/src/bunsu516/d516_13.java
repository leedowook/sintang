package bunsu516;
import java.util.*;
public class d516_13 {
	public static void main(String[]args) {
		System.out.println("이름 도시 나이 체중을 빈칸으로 분리하여 입력하세요");
		Scanner a=new Scanner(System.in);
		/*Scanner b=new Scanner(System.in);
		Scanner c=new Scanner(System.in);
		Scanner d=new Scanner(System.in);*/
		String name=a.next();
		String city=a.next();
		int age=a.nextInt();
		double weight=a.nextDouble();
		
		
		a.close();/*b.close();c.close();
		d.close();*/
		System.out.println("당신의이름은"+name);
		System.out.println("당신의 사는곳은"+city);
		System.out.println("당신의 나이는"+age);
		System.out.println("당신의 체중은"+weight);
		
	}
}
