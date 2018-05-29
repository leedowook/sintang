package d0523;
import java.util.*;
public class b0523_4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("차");
		String mod=scan.next();
		System.out.println("회사");
		String com=scan.next();
		a0523_4 a4d=new a0523_4();
		a0523_4 a4a=new a0523_4(mod);
		a0523_4 a4b=new a0523_4("소나타","뻘게");
		a0523_4 a4c=new a0523_4("황금마티즈","황금",5000);
		a4d.mod=mod;
		a4d.com=com;
		System.out.println(a4d.mod+a4d.com);
		System.out.println("모델"+a4a.mod);
		System.out.println("색"+a4a.col);
		System.out.println("속"+a4a.maxspeed);
		System.out.println("----------------------------");
		System.out.println("모델"+a4b.mod);
		System.out.println("색"+a4b.col);
		System.out.println("속"+a4b.maxspeed);
		System.out.println("----------------------------");
		System.out.println("모델"+a4c.mod);
		System.out.println("색"+a4c.col);
		System.out.println("속"+a4c.maxspeed);
		

	}

}
