package d0530;
import java.util.*;
public class employex {
	public static void main(String []args) {
	employee[] ep=new employee[20];
	manager[] mg=new manager[5];
	excutive[] et=new excutive[2];
	Scanner scan=new Scanner(System.in);
	int cho;
	boolean z=true;
	while(z) {
		System.out.println("----------------------------------------");
		System.out.println("1.직원입력|2.승진|3.급여인상|4.직원정보|5.종료");
		System.out.println("----------------------------------------");
		System.out.print("선택>");
		cho=scan.nextInt();
		if(cho==1) {
			int m=0;
			for(int i=0;i<ep.length;i++) {
				if(ep[i]==null) {
				m=i;
				ep[m]=new employee(null,0);
				break;
				}
			}
			System.out.println("직원 입력메뉴");
			System.out.print("이름: ");
			ep[m].name=scan.next();
			System.out.print("원급: ");
			ep[m].price=scan.nextInt();
		}
		else if(cho==2){
			System.out.println("사원을 manager로 승급시키려면 1번 사원을 excutive로 승급시키려면 2");
			System.out.println("manager을 excutive로 승급시키려면 3번을 입력하세요");
			System.out.print("선택>");
			cho=scan.nextInt();
			if(cho==1) {
				int m = 0,b=0;
				System.out.println("사원의 이름을 입력해주세요");
				String nam=scan.next();
				for(int i=0;i<ep.length;i++) {
					if(ep[i].equals(nam)) {
					m=i;
					break;
					}
				}
				for(int i=0;i<mg.length;i++) {
					if(mg[i]==null) {
					b=i;
					mg[b]=(manager)ep[m];
					break;
					}
				}
				System.out.println("직원의 보너스가 지급되야합니다 보너스를 입력하세요");
				mg[b].bonus=scan.nextInt();
				System.out.println("승급되었습니다.");
				
			}
			else if(cho==2) {
				int m = 0,b=0;
				System.out.println("사원의 이름을 입력해주세요");
				String nam=scan.next();
				for(int i=0;i<ep.length;i++) {
					if(ep[i].equals(nam)) {
					m=i;
					break;
					}
				}
				for(int i=0;i<mg.length;i++) {
					if(et[i]==null) {
					b=i;
					et[b]=(excutive)ep[m];
					break;
					}
				}
				System.out.println("직원의 보너스가 지급되야합니다 보너스를 입력하세요");
				et[b].bonus=scan.nextInt();
				et[b].stock=true;
				System.out.println("승급되었습니다.");
				
			}
			else if(cho==3) {
				int m = 0,b=0;
				System.out.println("사원의 이름을 입력해주세요");
				String nam=scan.next();
				for(int i=0;i<mg.length;i++) {
					if(mg[i].equals(nam)) {
					m=i;
					break;
					}
				}
				for(int i=0;i<mg.length;i++) {
					if(et[i]==null) {
					b=i;
					et[b]=(excutive)mg[m];
					break;
					}
				}
				
				et[b].stock=true;
				System.out.println("승급되었습니다.");
				
			}
			else {System.out.println("잘못된값입니다.");}
		}
	}}
}
