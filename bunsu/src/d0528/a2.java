package d0528;
import java.util.*;
public class a2 {
	public String name;
	public String ssn;
	Scanner scan=new Scanner(System.in);
	//생성자 선언
	public a2() {
		
		
		this.name=name();
		
		this.ssn=ssn();
		
	}
	public String name() {
		System.out.println("이름을 입력해봐라");
		this.name=scan.next();
		return this.name;
	}
	public String ssn() {
		System.out.println("주번을 입력해봐라");
		this.ssn=scan.next();
		return this.ssn;
	}
	void 출() {
		System.out.println("이름: "+this.name);
		System.out.println("주번: "+this.ssn);
	}
	
	
	
}

