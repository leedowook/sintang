package d0529;
import java.util.*;
public  class a1 {
	final String comp="한성";
	String name;
	int sp;
	Scanner scan=new Scanner(System.in);
	public final void sc() {
		
		System.out.println("이름");
		name=scan.next();
		System.out.println("스팩");
		sp=scan.nextInt();
		System.out.println("회사이름"+comp+"\n이름"+name+"스펙"+sp);
	};
}
