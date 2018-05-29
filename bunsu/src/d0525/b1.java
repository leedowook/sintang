package d0525;
import java.util.*;
public class b1 {
	
	private Scanner scan=new Scanner(System.in);
	private String id,pd;
	public Scanner getScan() {
		return scan;
	}
	public void setScan(Scanner scan) {
		this.scan = scan;
	}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getPd() {
	return pd;
}
public void setPd(String pd) {
	this.pd = pd;
}
	
	
	public void create(){
		System.out.print("생성할 계정의id를 입력하세요");
		this.id=scan.next();
		System.out.print("생성할 계정의 비밀번호를 입력하세요");
		this.pd=scan.next();
		
		
	}
	public boolean login() {
		System.out.print("id를 입력하세요:");
		id=scan.next();
		System.out.print("pw를 입력하세요:");
		pd=scan.next();
		
		boolean a;
		if(id.equals(this.id)) {
			if(pd.equals(this.pd)) {
				a=true;
			}
			else {
				a=false;
			}
		}
		else {a=false;}
		return a;

}
}